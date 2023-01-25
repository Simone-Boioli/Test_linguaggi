import java.io.*;

public class ListFile{
	public static void main(String[]args){
		try{
			ListFile.listaFiles(args[0]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Usage: NomeDir");
		}
	}
	
	public static void listaFiles(String dir){
		File fl = new File(dir);
		if( !fl.exists()){
			System.out.println("cartella inesistente");
		}
		File[]files = fl.listFiles();
		if(files != null){
			for(int i = 0; i <files.length; i++){
				if(files[i].isFile()){
						System.out.println(files[i].getName());
				}else{
					System.out.println("");
					System.out.println(files[i].getPath());
					listaFiles(files[i].getPath());
				}
			}
		}
	}
}