/*
 * Definire una classe WordsFrequency che implementi un albero binario 
 * di ricerca e nella quale ogni nodo, oltre agli appropriati riferimenti 
 * agli altri nodi, sia atto a contenere una singola parola
 * ed un contatore della sua frequenza in un testo.
 * Si definiscano i metodi per:
 *   - inserire una nuova parola nell'albero (add) che,
 *     nel caso la parola esista gia', incrementi il contatore;
 *   - trovare la parola alfabeticamente minore;
 *   - trovare la parola alfabeticamente maggiore;
 *   - stampare in ordine alfabetico tutte le parole e 
 *     la loro frequenza nel testo.
 *
 * Si definisca la classe WordsFrequencyDemo il cui metodo main:
 *   - legga un file testuale il cui nome viene passato come argomento;
 *   - riempia l'albero con tutte le parole contenute nel file;
 *   - stampi la parola alfabeticamente minore e alfabeticamente maggiore;
 *   - stampi in ordine alfabetico tutte le parole con a fianco 
 *     la loro frequenza nel testo.
 */

import java.util.*;

public class WordsFrequency {
	private	BinNode root;

	// costruttore dell'albero
    public WordsFrequency() {
	    root = null;
    }

    // Visita in ordine simmetrico dell'albero
    public void inOrderTreeWalk() { 
    	inOrderTreeWalk(root);
    }

    // Visita in ordine simmetrico dell'albero
    private static void inOrderTreeWalk(BinNode root) { 
    	if (root==null)
    		return; 
    	else
    	{
    		inOrderTreeWalk(root.left);
    		System.out.println("\"" + root.word + "\"" +  " -> " + root.count);
    		inOrderTreeWalk(root.right);
    	}
    }
    
    
    /* 
     * Ritorna la chiave/parola piu' piccola dell'albero, 
     * ritorna null se l'albero e' vuoto 
     */ 
    public String min() {
    	return min(root); 
    }
    
    /* 
     * Ritorna la chiave/parola piu' piccola dell'albero t, 
     * ritorna null se l'albero t e' vuoto 
     */ 
    private String min(BinNode t) {
    	if (t == null)
    		return null;
    	else
    		while (t.left != null)
    			t = t.left;
    	return t.word;
    } 
    
    
    /* 
     * Ritorna la chiave/parola piu' grande dell'albero, 
     * ritorna null se l'albero e' vuoto 
     */ 
    public String max() {
    	return max(root); 
    }
    
    /* 
     * Ritorna la chiave/parola piu' grande dell'albero t, 
     * ritorna null se l'albero t e' vuoto 
     */ 
    private String max(BinNode t) {
    	if (t == null)
    		return null;
    	else
    		while (t.right != null)
    			t = t.right;
    	return t.word;
    } 
    
    /* 
     * Aggiunge la stringa cx nell'albero tree e 
     * ritorna true se cx non appartiene gia' all'albero, 
     * se cx appartiene all'albero aggiorna solo il contatore della parola 
     *  e ritorna true
     */ 
    public boolean add(String cx) { 
    	return add(cx, root);
    }
    
    /* 
     * Versione Ricorsiva di inserimento di un nodo
     * Aggiunge la stringa cx nell'albero tree e 
     * ritorna true se cx non appartiene gia' all'albero, 
     * se cx appartiene all'albero aggiorna solo il contatore della parola 
     *  e ritorna true
     */ 
    private boolean add(String cx, BinNode tree) { 
    
    	if (tree == null) // l'albero e' vuoto lo crea
    	{ 
    		root = new BinNode (cx); 
    		return true; 
    	} 
    
        if (cx.compareTo(tree.word) == 0) 
        // cx e' la chiave contenuta nella radice 
        {
    	    tree.count ++;
    	    return true;
        }
        else 
    	if (cx.compareTo(tree.word) < 0 )//scende a sinistra             
    	    if (tree.left == null)  
    	    {   //inserisce cx come figlio sinistro 
    		    tree.left = new BinNode(cx,tree);
    		    return true;
    	    }
    	    else  //la ricerca continua nel sottoalbero sinistro 
    		return(add(cx, tree.left)); 
    	else // scende a destra             
    	    if (tree.right == null) 
    	    { //inserisce cx come figlio destro 
    		    tree.right = new BinNode (cx,tree);
    		    return true;
    	    }
    	    else //la ricerca continua nel sottoalbero destro 
    		return(add(cx, tree.right));
    } 
    
    /* 
     * Classe BinNode: la struttura di un nodo dell'albero binario 
     * Nota: questa classe e' privata, visibile solo alla
     * classe WordsFrequency
     */
    
    private class BinNode { 
    	private String word; // campo chiave 
    	private int count; // la frequenza di word all'interno di un testo
    	private BinNode left; // link al figlio sinistro 
    	private BinNode right; // link al figlio destro 
    	private BinNode parent; // link al padre
    
        /* Costruzione di un BinNode, parametri:
         *		la parola/chiave, 
         * 		il nodo figlio sinistro
         * 		il nodo figlio destro
         * 		il nodo padre
         */
        BinNode(String c, BinNode sx, BinNode dx,  BinNode g ) { 
        	word = c; 
        	count = 1;
        	left = sx; 
        	right = dx; 
        	parent = g; 
        
        	if (sx != null) // aggiorna il campo padre del figlio sinistro (se esiste) 
        		sx.parent = this; 
        	if (dx != null) // aggiorna il campo padre del figlio destro (se esiste) 
        		dx.parent = this; 
        } 
        
        BinNode(String c, BinNode g) { 
        	this (c, null, null, g); 
        }
        
        BinNode(String c) { 
        	this (c, null, null, null); 
        }
    
    } // end BinNode


} // end WordsFrequency
