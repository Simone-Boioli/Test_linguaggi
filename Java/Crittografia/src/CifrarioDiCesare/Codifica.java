package CifrarioDiCesare;

public class Codifica {
	private String messaggio; // messaggio da codificare
	private int chiave; // chiave di codifica
	private char[] alfabeto;
	String mexCodificato;
	
	
	public Codifica(String msg, int chiave){
		this.messaggio = msg;
		this.chiave = chiave;
		this.alfabeto = new char[26];
		this.mexCodificato = "";
	}
	
	public String codifica(){
		riempiVettore(alfabeto);
		
		for(int i = 0; i < messaggio.length(); i++){
			
			for(int j = 0; j < alfabeto.length; j++){
				
				if(messaggio.charAt(i) == alfabeto[j]){
					mexCodificato = mexCodificato +alfabeto[(j+this.chiave)%26];
				}else if(messaggio.charAt(i) == ' '){
					mexCodificato = mexCodificato + " ";
				}
			}
		}
		return mexCodificato;
	}
	
	private void riempiVettore(char v[]){
		v[0] = 'a';
		v[1] = 'b';
		v[2] = 'c';
		v[3] = 'd';
		v[4] = 'e';
		v[5] = 'f';
		v[6] = 'g';
		v[7] = 'h';
		v[8] = 'i';
		v[9] = 'y';
		v[10] = 'k';
		v[11] = 'l';
		v[12] = 'm';
		v[13] = 'n';
		v[14] = 'o';
		v[15] = 'p';
		v[16] = 'q';
		v[17] = 'r';
		v[18] = 's';
		v[19] = 't';
		v[20] = 'u';
		v[21] = 'v';
		v[22] = 'w';
		v[23] = 'j';
		v[24] = 'x';
		v[25] = 'z';
		
		
	}
}
