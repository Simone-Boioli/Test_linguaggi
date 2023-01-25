import java.util.NoSuchElementException;
import java.util.*;
public class Albero {
			private Nodo nodo;			
						
						/**
						 * Inner class di nodo
						 */
						private class Nodo{  
							private int key; //dati del nodo  
							private Nodo left; //puntatore al nodo sinistro
							private Nodo right; //puntatore al nodo destro
							private Nodo parent; // puntatore al parente del nodo
							
							public Nodo(int k, Nodo sx, Nodo dx, Nodo p){ //nodo interno
								this.key = k;
								this.left = sx;
								this.right = dx;
								this.parent = p;
								if(sx.parent != null){  //aggiorna il campo padre del figlio sinistro
									sx.parent = this;
								}
								if(dx.parent != null){ //aggiorna il campo padre del figlio destro
									dx.parent = this;
								}
							}
							
							public Nodo(int k){  //nodo senza riferimenti
								this.key = k;
								this.left = null;
								this.right = null;
								this.parent = null;
							}
							
							public Nodo(int k, Nodo p){  //nodo foglia
								this.key = k;
								this.left = null;
								this.right = null;
								this.parent = p;
							}
							
							public Nodo(int k, Nodo sx, Nodo dx){  //nodo root
								this.key = k;
								this.left = sx;
								this.right = dx;
								this.parent = null;
							}
							
							public Nodo(){
							}
						}
	
	public Albero(){
		nodo = null;
	}
	/**
	 * Metodo che ritorna true se l'albero è vuoto, altrimenti null
	 */
	public boolean isEmpty(){
		return(nodo==null);
	}
	
	/**
	 * Metodo che svuota l'albero
	 */
	public void clear(){
		nodo = null;
	}
	
	/**
	 * Metodo per aggiungere un nodo 
	 */
	public boolean add(int x){
		if(isEmpty()){
			this.nodo = new Nodo(x);   // creo il nodo root
			return true;
		}
		else{
			return(addHelper(x, nodo));
		}
	}
	
	private boolean addHelper(int x, Nodo tree){
		if(x == tree.key){
			return false;
		}else if(x < tree.key){ //scende a sinistra
			if(tree.left == null){
				tree.left = new Nodo(x, tree); //inserisco come figlio sinistro
				return true;
			}else{
				return(addHelper(x, tree.left)); //continua nel sottoalbero sinistro
			}
		}else{  //x > tree.key, quindi scende a destra
			if(tree.right == null){
				tree.right = new Nodo(x, tree); //inserisco come figlio destro
				return true;
			}
			else{
				return(addHelper(x,tree.right)); //continua nel sottoalbero destro
			}
		}
	}
	
	/**
	 * Metodo per cancellare un nodo
	 */
	public boolean remove(int x){
		if(isEmpty()){    //se l'albero è vuoto ritorna false
			return false;   
		}else{
			Nodo z = find(x, nodo);
			if(z == null){ //non c'è nell'albero
				return false;
			}else{  //il valore è contenuto nell'albero
				removeHelper(z);
				return true;
			}
		}
	}
	
	private void removeHelper(Nodo z){
		Nodo y;
		if((z.left != null) && (z.right != null)){  //l'elemento da cancellare ha 2 figli
			y = successor(z); //prendo il successore del nodo da cancellare
			z.key = y.key; //sostituisco le chiavi
		}else{
			y = z;
		}
		Nodo x = (y.left != null) ? y.left : y.right; // cerchiamo il figio di t
		if(x != null){
			x.parent = y.parent;  //se x ha un figlio cambiano i parent
		}
		if(y.parent == null){  //se y era la radice, x diventa la radice
			nodo = x;
		}else{
			if(y == y.parent.left){  //se sono foglie, trovo il ramo giusto e tolgo la foglia
				y.parent.left = x;
			}else{
				y.parent.right = x;
			}
		}
		
	}
	
	/**
	 *	Metodo per cercare un elemento in un'albero 
	 */
	public boolean contains(int x){
		Nodo n = find(x, nodo);
		return (n != null);
	}
	

	private Nodo find(int value, Nodo node) {
		if (node == null) {
			return null;
		}
		if (node.key == value){
			return node;
		}
		if (value < node.key){
			return find(value,node.left);
		}
		else {
			return find(value,node.right);
		}
		
	}
	/** 
	 *  Metodo che calcola il numero di nodi dell'albero
	 */
	
	public int size() {
		if (nodo == null){ //se l'albero è vuoto, il num di nodi è 0 
			return 0;
		}
		return sizeHelper(nodo);
	}
	
	private int sizeHelper(Nodo node) {
		if (node == null) {
			return 0;
		}else{
			return (1 + sizeHelper(node.left) + sizeHelper(node.right)); //l'1 è la radice
		}
	}
	/**
	 *  Calcola il livello d'altezza di un nodo con una certa chiave
	 */ 
	public int level(int value) {
		Nodo n = find(value,nodo);
		return levelHelper(n);
	}
	
	private int levelHelper(Nodo node) {
		if (node == null) {
			return 0;   //albero vuoto
		}
		return (1 + levelHelper(node.parent));
	}
	
	
	/**
	 * Metodo che restituisce il valore minimo dell'albero, se l'albero è vuoto restituisce un' eccezione
	 */
	public int min(){
		Nodo n = minHelper(nodo);
		if(n != null){
			return n.key;
		}else{
			throw new NoSuchElementException(); //se l'albero è vuoto lancia un' exception
		}
	}
	
	private Nodo minHelper(Nodo t){
		if(t == null){
			return null;     //l'albero è vuoto
		}else{
			while(t.left != null){
				t = t.left;  //scorre fino all'ultimo elemento più a sinistra
			}
			return t;
		}
	}
	
	/**
	 * Metodo che restituisce il valore massimo dell'albero, se l'albero è vuoto restituisce un'eccezione
	 */
	
	public int max(){
		Nodo n = maxHelper(nodo);
		if(n != null){
			return n.key;
		}else{
			throw new NoSuchElementException(); //albero vuoto---> lancia un'eccezione
		}
	}
	
	private Nodo maxHelper(Nodo t){
		if(t == null){
			return null; //albero vuoto
		}else{
			while(t.right != null){
				t = t.right; //scorre fino all'elemento più a destra
			}
			return t;
		}
	}
	
	/**
	 *	Metodo che ritorna il successore di un nodo (la più piccola chiave più grande di quella passata) 
	 */
	private Nodo successor(Nodo t){
		if(t == null){
			throw new IllegalArgumentException();
		}else if(t.right != null){  //se il sottoalbero destro non è vuoto restituisce --->
			return (minHelper(t.right));        //-->il min ovvero il val più a sinistra del sottoalbero di destra
		}else{ //sottoalbero destra vuoto ---> restituisce l'antenato più prossimo che ha un figlio sinistro
			Nodo y = t.parent;
			while((y != null) && (t==y.right)){
				t = y;
				y = y.parent;
			}
			return y;
		}
		
	}
	
	/**
	 * Metodo che ritorna il predecessore (la più grande chiave più piccola di quella passata)
	 */
	private Nodo predecessor(Nodo t){
		if(t == null){
			throw new IllegalArgumentException();
		}else if(t.left != null){
			return (maxHelper(t.left));
		}else{
			Nodo y = t.parent;
			while((y != null) && (t == y.left)){
				t = y;
				y = y.parent;
			}
			return y;
		}
	}
	
	
	/**
	 * Metodi per scorrere l'albero 
	 */
	public void inorderVisit(){
		inorderVisitHelper(nodo);
	}
	
	private void inorderVisitHelper(Nodo root){
		if(root == null){
			return;
		}else{
			inorderVisitHelper(root.left);
			System.out.println(root.key);
			inorderVisitHelper(root.right);
		}
	}
	public void preorderVistitHelper(Nodo root){
		preorderVisit(root);
	}
	private static void preorderVisit(Nodo root){
		if(root == null){
			return;
		}else{
			System.out.println(root.key);
			preorderVisit(root.left);
			preorderVisit(root.right);
		}
	}
	
	public void postOrderVisitHelper(Nodo root){
		postorderVisit(root);
	}
	private static void postorderVisit(Nodo root){
		if(root==null){
			return;
		}else{
			postorderVisit(root.left);
			postorderVisit(root.right);
			System.out.println(root.key);
		}
	}	
	
	/**
	* Considerate un albero binario di ricerca su interi (ad esempio la classe BinTree vista a lezione).
	* Scrivete un metodo che, partendo dalla radice, visiti tutti i nodi dell'albero e metta i valori delle chiavi in un Vector (di interi) in ordine crescente.
	* Implementate se necessario anche metodi di servizio.
	*/
	/*
	public void ordina(){
		ordinaHelper(nodo);
	}
	private void ordinaHelper(Nodo root){
		Vector<Integer> v = new Vector<Integer>();
		int lungh = size();
		int i = 0;
		int [] a = new int [lungh];
		if(root == null){
			return;
		}else{
			a[i] = nodo.key;
			i++;
			ordinaHelper(root.left);
			ordinaHelper(root.right);
		}
		for (int j = 0; j < a.length; j++){
			System.out.println(a[j]);
		}
		
	}
	*/
	
	/**
	* Considerate un albero binario di ricerca su interi (ad esempio la classe BinTree vista a lezione).
	* Scrivete un metodo che, partendo dalla radice, conti tutti i nodi foglia dell'albero.
	* Implementate se necessario anche metodi di servizio.
	*/
	public void contaFoglie(){
		if(nodo == null){
			System.out.println("albero vuoto");
		}else if(nodo.left == null && nodo.left == null){
			System.out.println("un nodo solo-->una foglia")
		}else{
			int count = 0;
			Nodo x = nodo;
			if(x.left
		}
	}
	public static void main(String[]args){
		Albero albero = new Albero();
		Vector <Integer> vett = new Vector<Integer>();	
			albero.add(65);
			albero.add(50);
			albero.add(30);
			albero.add(60);
			albero.add(15);
			albero.add(45);
			albero.add(76);
			albero.add(80);
			albero.add(78);
			albero.add(85);
			
			albero.ordina();
			
			vett.add(25);
			vett.add(52);
			//System.out.println(vett.size());
	}
	
}
