
public class File {
	private byte[] data;         //Incapsula arrey di byte
	public File(byte[]data){     //Arrey di byte
		this.data=data;
	}
	public int getSize(){        //metodo dimensione File
		return data.length;      //lunghezza arrey
	}
	public boolean isBiggerThan(File f){     //Metodo confronto
		return this.getSize()>f.getSize();   //Contronta i file
		
	}
}
