import java.util.*;

public class BinTreeInt {
    
    private class BinNode {
        private int key;
        private BinNode left;
        private BinNode right;
        private BinNode parent;
        
        BinNode(int key, BinNode left, BinNode right, BinNode parent) {
            this.key  = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
            
            if(left != null)  left.parent=this;
            if(right != null) right.parent=this;
        }
        
        BinNode(int key) {
            this(key, null,null,null);
        }
        
        BinNode(int key, BinNode parent) {
            this(key,null,null,parent);
        }
        
        BinNode(int key, BinNode left, BinNode right) {
            this(key,left,right,null);
        }
    } // end of class BinNode

    private BinNode root;
    
    BinTreeInt() {
        root = null;
    }
    
    public boolean isEmpty() {
        return root == null;
    }
    
    public void clear() {
        root = null;
    }
    
    public void visit() {
        inOrderVisit(root);
    }
    
    private void inOrderVisit(BinNode node) {
        if (node == null) return;
        
        inOrderVisit(node.left);
        System.out.println(node.key);
        inOrderVisit(node.right);
    }
    
    public boolean contains(int x) {
        return (find(x) != null);
    }

    private BinNode find(int x) {       
        BinNode n = root;
        
        while (n != null) {
            if (x < n.key) n = n.left;
            else if (x > n.key) n = n.right;
            else return n;
        }
        return null;
    }
        
    private BinNode findR(int x, BinNode n) {
        if (n == null) return null;
        if (x == n.key) return n;
        
        if (x < n.key) return findR(x, n.left);
        else return findR(x, n.right);
    }
        
    public boolean add(int x) {
        if (root == null) {
            root=new BinNode(x);
            return true;
        }
        else return addHelper(x,root);
    }
    
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
    
    public int min() {
        BinNode m=minHelper(root);
        if (m == null) throw new NoSuchElementException();
        else return m.key;
    }
    
    private BinNode minHelper(BinNode node) {
        if (node == null) return null;
        while (node.left != null) node = node.left;
        return node;        
    }
    
    public int max() {
        BinNode m = maxHelper(root);
        if (m == null) throw new NoSuchElementException();
        else return m.key;
        
    }
    
    private BinNode maxHelper(BinNode node) {
        if (node == null) return null;
        while (node.right != null) node = node.right;
        return node;        
    }

    
    public int successor(int x) {
        BinNode node=successor(find(x));
        if (node!=null) return node.key;
        else throw new NoSuchElementException();     
    }
    
    private BinNode successor(BinNode node) {
        if (node == null) throw new IllegalArgumentException();
        
        if (node.right != null) return minHelper(node.right);
        
        BinNode p = node.parent;
        
        while (p != null && p.left != node) {
            node = p;
            p = p.parent;
        }
        
        return p;
    }

    public int predecessor(int x) {
        BinNode node=predecessor(find(x));
        if (node!=null) return node.key;
        else throw new NoSuchElementException();     
    }
    
    private BinNode predecessor(BinNode node) {
        if (node == null) throw new IllegalArgumentException();
        
        if (node.left != null) return maxHelper(node.left);
        
        BinNode p = node.parent;
        
        while (p != null && p.right != node) {
            node = p;
            p = p.parent;
        }
        
        return p;
    }    
    
    public boolean remove(int x) {
        BinNode node = find(x);
        
        if (node == null) return false; 
        else {
            removeHelper(node);
            return true;
        }
    }
    
    private void removeHelper(BinNode n) {
        BinNode t;
    
	if ((n.left != null) && (n.right != null)) { 
	    /* n ha due figli, quindi deve essere spostato il successore di n */ 
	    t = successor(n); 
	    n.key = t.key; 
	} 
	else t = n; 

	// Recupero l’unico figlio di t (se esiste)
	// t è il successore di n e ha in questo caso 0 o 1 figlio oppure 
	// è n che ha 0 o 1 figlio (else) 
	BinNode tc = (t.left != null ? t.left : t.right); 
        
        // Devo rimuovere t
        // cambio il padre di tc con quello di t
        if (tc != null) tc.parent = t.parent;
        
        if (t.parent == null) 
            root = tc; // se t era la root cambio la root con tc;
        else {
            // tc diventa il figlio giusto del padre di t 
            if (t.parent.left == t) t.parent.left = tc;
            else t.parent.right = tc; 
        }
    }
    
    

    // Metodi aggiuntivi per esercizio 

    public Vector<Integer> toVector() {
        Vector<Integer> v=new Vector<Integer>();
        
        return toVectorHelper(root, v);    
    }
    
    private Vector<Integer> toVectorHelper(BinNode n, Vector<Integer> v) {
        if (n.left != null) v = toVectorHelper(n.left, v);
        if (n != null) v.add(n.key);
        if (n.right != null) v = toVectorHelper(n.right, v);
        
        return v;
    }
    
    public int size() {
        return sizeHelper(root);
    }
    
    private int sizeHelper(BinNode n) {
        if (n == null) return 0;
        
        return 1 + sizeHelper(n.left) + sizeHelper(n.right);
    }
    
    public int level(int x) {
        BinNode n=find(x);
        if (n == null) throw new NoSuchElementException();
        else return level(n);
    }
    
    private int level(BinNode n) {
        int lv = 0;
        
        while (n.parent != null) {
            n=n.parent;
            lv++;
        }
        return lv;
    }

    public static void main (String[] args) {
        BinTreeInt tree=new BinTreeInt();
        
        tree.add(10);
        tree.add(20);
        tree.add(21);
        tree.add(15);
        tree.add(4);
        tree.add(90);
  	tree.remove(10);
                
	System.out.println("Visita:");
	tree.visit();
	
        System.out.println("Livello di 90: " + tree.level(90));
	System.out.println("dimensione: " + tree.size());
	System.out.println("Trasformazione in vettore: " + tree.toVector());
        
    }
}