public class Dipendente{
	public static void main (String[]args){
		public String nome;
		public int stipendio;
		public int matricola;
		public String dataDiNascita;
		public String dataDiAssunzione;
		
		Dipendente [] arr = new Dipendente [3];  //collezione eterogenea di dipendenti
		arr[0] = new Dirigente();
		arr[1] = new Programmatore();
		arr[2] = new AgenteDiVendita();
		
		public void pagaDipendente(Dipendente dip){
			if(dip instanceof Programmatore){
				dip.stipendio = 1200;
			}else if(dip instanceof Dirigente){
				dip.stipendio = 3000;
			}else (dip instanceof AgenteDivendita){
				dip.stipendio = 1000;
			}
		}
		
		System.out.println(pagaDipendente(Programmatore));
	}	
}