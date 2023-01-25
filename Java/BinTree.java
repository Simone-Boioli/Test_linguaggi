import java.util.*;

public class BinTree {
	
	private class BinNode {
		private int value;
		private BinNode left;
		private BinNode right;
		private BinNode parent;
		
		BinNode(int value, BinNode left, BinNode right, BinNode parent) {
			this.value = value;
			this.left = left;
			this.right = right;
			this.parent = parent;
		}
		
		BinNode(int value) {
			this(value,null,null,null);
		}
		
		BinNode(int value, BinNode parent) {
			this(value,null,null,parent);
		}  
		
		BinNode(int value, BinNode left, BinNode right) {
			this(value,left,right,null); 
		}
		
	} // BinNode


	
	private BinNode root;
	
	BinTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return (root==null);
	}
	
	public void clear() {
		root = null;
	}
	
	public boolean add(int value) {
		if (root == null) {
			root = new BinNode(value);
			return true;
		}
		else
			return add(root, value);
	}
	
	private boolean add(BinNode node, int value) {
		
		if (node.value == value) return false;
		
		if (value < node.value) {
			if (node.left == null) {
				node.left = new BinNode(value,node);
				return true;
			}
			else return add(node.left,value);
		}
		
		if (node.right == null) {
			node.right = new BinNode(value,node);
			return true;
		}
		else return add(node.right,value);
		
	} 

	public void inOrderVisit() {
		inOrderVisit(root);
	}
	
	private void inOrderVisit(BinNode node) {
		if (node == null) return;
		inOrderVisit(node.left);
		System.out.println(node.value);
		inOrderVisit(node.right);
	}

	public void preOrderVisit() {
		preOrderVisit(root);
	}
	
	private void preOrderVisit(BinNode node) {
		if (node == null) return;
		System.out.println(node.value);
		preOrderVisit(node.left);
		preOrderVisit(node.right);
	}

	public boolean contains(int value) {
		BinNode n = find(value,root);
		return (n != null);
	}
	
	private BinNode find(int value, BinNode node) {
		if (node == null) return null;
		
		if (node.value == value) return node;
		
		if (value < node.value) return find(value,node.left);
		else return find(value,node.right);
		
	}

	public int min() {
		if (root == null) throw new NoSuchElementException();
		
		BinNode n = min(root);

		return n.value;		
	}
	
	private BinNode min(BinNode node) {
		if (node.left != null) return min(node.left);
		return node;
	}

	public int max() {
		if (root == null) throw new NoSuchElementException();
		
		BinNode n = max(root);

		return n.value;		
	}
	
	private BinNode max(BinNode node) {
		if (node.right != null) return max(node.right);
		return node;
	}
	
	public int size() {
		if (root == null) return 0;
		return size(root);
	}
	
	private int size(BinNode node) {
		if (node == null) return 0;
		return 1 + size(node.left) + size(node.right);
	}

	public int level(int value) {
		
		BinNode n = find(value,root);
		
		return level(n);
	}
	
	private int level(BinNode node) {
		if (node == null) return 0;
		return 1 + level(node.parent);
	}

	public void remove(int value) {
		
		BinNode n = find(value,root);
		
		if (n == null) throw new NoSuchElementException();
		
		remove(n);
	}

	private BinNode successor(BinNode node) {
		if (node.right != null) return min(node.right);
		
		BinNode p = node.parent;
		
		while (p != null && p.left != node) {
			node = p;
			p = p.parent;
		}
		return p;	
	}

	private void remove(BinNode node) {
		
		BinNode t = null;
		
		// Se esistono 2 figli, cerchiamo il successore del nodo corrente
		if ((node.left != null) && (node.right != null)) {
			t = successor(node);
			node.value = t.value;
		}
		else t = node;
		
		// Il nodo da rimuovere ora  t e ha 0 o 1 figlio soltanto
		
		// cerchiamo il figio di t
		BinNode tc = (t.left != null) ? t.left : t.right;
		
		// Se esiste settiamo il suo genitore
		if (tc != null) tc.parent = t.parent;
		
		// Se il genitore di t  null, allora t  la root
		if (t.parent == null) 
			root = tc;
		else { // Verifichiamo se t  figlio destro o sinistro 
			// Linkiamo il sottoramo corretto di t.parent a tc 
			if (t.parent.left == t) t.parent.left = tc;
			else t.parent.right = tc;
		}
		
	}

	public static void main(String[] args) {
		
		BinTree tree = new BinTree();
		
		tree.add(10);		
		tree.add(5);
		tree.add(7);		
		tree.add(15);		
		tree.add(13);		
		tree.add(17);	
		tree.add(14);	
		tree.add(20);	
		tree.add(22);	
		
		//System.out.println(max(4,tree.root));
		//System.out.println(tree.contaFoglie());
		//System.out.println(tree.profondita());
		System.out.println(tree.fogliePari());
		/*
		tree.preOrderVisit();	

		System.out.println(tree.contains(9));
		System.out.println(tree.contains(99));
		
		System.out.println("min = "+tree.min());
		System.out.println("max = "+tree.max());
		
		System.out.println("size = "+tree.size());
		
		System.out.println("level of 50 = "+tree.level(50));
		System.out.println("level of 10 = "+tree.level(10));
		
		tree.remove(10);
		tree.preOrderVisit();
		*/
	}
	
	
	public static int max(int x, BinNode nodo){
		if(nodo == null){
			return 0;
		}else{
			if(x < nodo.value){
				return max(x,nodo.left) + max(x,nodo.right) + 1;
			}
			else{
				return max(x,nodo.right) ;
			}
		}	
	}	
	
	public int contaFoglie(){
		if(root == null){
			return 0;
		}
		else{
			return contaFoglie(root);
		}
	}
	
	public int contaFoglie(BinNode root){
		if(root == null){
			return 0;
		}else if(root.left == null && root.right == null){
			return 1;
		}else{
			return contaFoglie(root.left) + contaFoglie(root.right);
		}
	}
	
	public int conta(int x){
		if(root == null){
			return 0;
		}else{
			return conta(x, root);
		}
	}
	
	public int conta (int x, BinNode root){
		int cont = 0;
		int sx = 0;
		int dx = 0;
		if(root == null){
			return 0;
		}else if(x == root.value){
			sx = conta(x,root.left); 
			dx = conta(x,root.right);
			cont++;
			return cont + sx + dx;
			
		}else if(x < root.value){
			sx = conta(x, root.left);
			return sx;
		}else{
			dx = conta(x, root.right);
			return dx;
		}
	}
	
	public int profondita(){
		if(root == null){
			return 0;
		}else{
			return profondita(root);
		}
	}
	public int profondita(BinNode root){
		if(root == null){
			return 0;
		}else{
			return 1 + Math.max(profondita(root.left), profondita(root.right));
		}
	}
	
	public static void binary(long n){
		ArrayList<Integer> a = new ArrayList<Integer>();
		//Nel secondo array b salvo quello ritornato dal metodo privato
		ArrayList<Integer> b = binary(n, a, 0);
		//chiamo il metodo privato, che mi ritorna il numero binario nell array list
		System.out.println("Il numero " + n + " in binario e' : ");
		for (int j= (b.size()-1); j >= 0; j--){
			System.out.print(b.get(j) + " ");
			//devo stampare al contrario l'array perchè le cifre sono inserite al contrario
		}
	}

	private static ArrayList<Integer> binary(long n, ArrayList<Integer> a, int i){
		//quando arrivo a n==0 il numero è finito
		if(n == 0)
			return a;
		//in binario essendoci solo 1 e 0 uso il modulo due
		if(n%2 == 0){
			a.add(i, 0);
			return binary (n/2, a, i+1);
		}
		else{
			a.add(i, 1);
			return binary (n/2, a, i+1);
		}
	}
	
	public boolean fogliePari(){
		if(root == null){
			return false;
		}else{
			return fogliePari(root);
		}
	}
	
	public boolean fogliePari(BinNode root){
		if(root == null){
			return false;
		}else{
			int foglie = contaFoglie();
			if(foglie%2 == 0){
				return true;
			}else{
				return false;
			}
		}
	}

} // BinTree