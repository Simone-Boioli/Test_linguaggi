package compitino;

import java.util.*;
import java.io.*;

public class BinTreeIntTLeggiMaxPari {

	private BinNode root;

	// costruttore dell'albero
	BinTreeIntTLeggiMaxPari() {
	root = null;
	}

	public static void main (String[] args) {
		BinTreeIntTLeggiMaxPari tree=new BinTreeIntTLeggiMaxPari();

		/****************************
		1. Leggere tutti gli interi contenuti nel file numeri.txt e con essi
		popolare l’albero binario di ricerca (tree).
		Potete usare il metodo add (gia’ fornito nella classe) che permette
		l’inserimento di un nodo nell’albero. Attenzione a gestire le opportune
		eccezioni e ad inserire nell'albero SOLO i numeri interi.
		***************************/
		BufferedReader inputStream;
		try{
			inputStream = new BufferedReader(new FileReader("numeri.txt"));
			Scanner input = new Scanner(inputStream);
			String line = null;
			int numero;
			while(input.hasNext()){
				line = input.next();
				if(isInt(line)){
					numero = Integer.parseInt(line);
					tree.add(numero);
					System.out.println(numero);
				}
			}
				
			inputStream.close();
		
	
		int count = tree.maxPari();

		System.out.print("L'albero contiene al massimo ");

		System.out.print(count);
		System.out.println(" numeri pari su uno stesso ramo.");
		}catch(FileNotFoundException e){
			System.out.println("impossibile aprire il file");
		}catch(IOException e){
			System.out.println("errore IO");
		}
		
	}

		/****************************
		2.Implementare utilizzando la RICORSIONE il metodo maxPari che
		restituisce il numero massimo di elementi pari di tree su uno stesso ramo.
		***************************/
	public static boolean isInt(String t){
		try{
			int n = Integer.parseInt(t);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
	
	
	public int maxPari() {
		if(root == null)
			return  0;
		return maxPari(root);
	}
	
	public int maxPari(BinNode nodo){
		if (nodo == null){
			return 0;
		}else if(nodo.key%2 == 0){
			return 1 + Math.max(maxPari(nodo.left), maxPari(nodo.right));
		}else{
			return Math.max(maxPari(nodo.left), maxPari(nodo.right));
		}
	}


		// metodo per inserire un nuovo nodo, con chiave == x, nell'albero
		public boolean add(int x) {
			if (root == null) {
				root=new BinNode(x);
				return true;
			}
			else return addHelper(x,root);
		}

		// metodo di supporto (per inserire un nuovo nodo, con chiave == x, nell'alebro
		private boolean addHelper(int x, BinNode n) {
			if (x == n.key) return false; // il valore esiste già
			else if (x < n.key) { // analizza il stalbero sinistro
				if (n.left == null) { // non c'e' stalbero sinistro -> inserisce
					n.left=new BinNode(x,n);
					return true;
				}
				else // continua la ricerca nel stalbero sinistro
					return addHelper(x,n.left);
			}
			else { // analizza il stalbero destro
				if (n.right == null) { // non c'e' stalbero destro -> inserisce
					n.right = new BinNode(x,n);
					return true;
				}
				else // continua la ricerca nel stalbero destro
					return addHelper(x,n.right);
			}
		}
	

		// Definizione della classe nodo dell'albero
		private class BinNode {
			private int key;
			private BinNode left;
			private BinNode right;
			private BinNode parent;

			BinNode(int key, BinNode left, BinNode right, BinNode parent) {
				this.key = key;
				this.left = left;
				this.right = right;
				this.parent = parent;

				if( left != null ) left.parent=this;
				if( right != null ) right.parent=this;
			}

			BinNode(int key) {
				this(key, null,null,null);
			}

			BinNode(int key, BinNode parent) {
				this(key,null,null,parent);
			}
		} // end of inner class BinNode
}
