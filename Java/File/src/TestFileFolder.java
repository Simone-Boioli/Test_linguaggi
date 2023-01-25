import junit.framework.TestCase;    //libreria JUnit


public class TestFileFolder extends TestCase {   //TestCase è la libreria di JUnit 
	
	public void testFolderAnnidati(){  //i nomi dei metodi devono sempre iniziare con test
		byte[]b1={1,5,7,9};
		byte[]b2={15,18};       //arrey di byte
		byte[]b3={8,16,23};
		File f1=new File(b1);
		File f2=new File(b2);   //file che incapsulano gli arrey
		File f3=new File(b3);
		
		Folder fold1=new Folder();    //creo un folder
		fold1.addFileInFolder(f1);    //Aggiungo il file f1
		fold1.addFileInFolder(f2);    //aggiungo il file f2
		Folder fold2=new Folder();    //creo un folder
		fold2.addFileInFolder(f3);    //aggiungo il file f3
		fold1.addFileInFolder(fold2); 
		
		assertEquals(9,fold1.getSize());   //"assertEquals"metodo che JUnit mette a disposizione per fared il test..
		
		//E' uguale che scrivere:
		//if(fold1.getSize()==9)
		//System.out.println("OK");

		assertTrue(fold1.isBiggerThan(f1));  //"assertTrue"metodo di JUnite per i boolean
	}
}
