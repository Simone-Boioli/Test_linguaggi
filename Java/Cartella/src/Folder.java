
public class Folder extends File{           //Extends--->Folder è una sottoclasse di File
	private File[] files;
	private int freeItem;
	public Folder(){
		super(null);            //Invocazione superclasse di File
		files=new File[10];     //Inizializza l'arrey
		freeItem=0;             //Inizializza freeItem
	}
	public void addFileInFolder(File f){   //Metodo aggiungi file nell'arrey
		if (f==null)return;       //Se il metodo è null non fa niente
		if (freeItem>9)return;    //Se ci sono già 9 posizioni occupate il metodo non fa niente
		files[freeItem]=f;        //Nella posizione freeItem(0) inserisco il file f
		freeItem++;               //Aumento la posizione nell'arrey
	}
	public int getSize(){
		int size=0;
		for(int i=0;i<freeItem;i++){        //ciclo che passa l'intero arrey
			size=size+files[i].getSize();
		}
		return size;
	}
}
