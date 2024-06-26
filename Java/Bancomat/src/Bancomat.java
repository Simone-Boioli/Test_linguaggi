
public class Bancomat {
	private boolean isInserita;
	private boolean pinCorretto;
	private ContoCorrente [] CC;
	private CartaBancomat CB;
	
	public Bancomat(ContoCorrente [] contiCorrenti){
		isInserita = false;
		pinCorretto = false;
		this.CC = contiCorrenti;
		CB = null;
	}
	
	public boolean inserisciCarta(CartaBancomat inCarta){
		if (!isInserita && CB == null){
			isInserita = true;
			CB = inCarta;
			return true;
		}else{
			return false;
		}
	}
	
	public CartaBancomat ritiraBancomat(){
		if( isInserita){
			CartaBancomat cartaEstratta = CB;
			CB = null;
			isInserita = false;
			pinCorretto = false;
			return cartaEstratta;
			
		}else{
			return null;
		}
	}
	
	public boolean verificaPin(int inPin){
		if(inPin == CB.getPin()){
			pinCorretto = true;
		}
		return pinCorretto;
	}
	
	public double prelievo(double inImporto){
		if(!pinCorretto){
			return 0.0;
		}else{
			ContoCorrente ccUtente = null;
			String nomeUtente = CB.getNome();
			
			for(int i = 0; i < CC.length; i++){
				if(nomeUtente.equals(CC[i].getNome())){
					ccUtente = CC[i];
					break;
				}
			}
			if(ccUtente == null || ccUtente.getSaldo() <= inImporto || CB.getMassimale() < inImporto){
				return 0.0;
			}else{
				double saldo = ccUtente.getSaldo();
				double massimale = CB.getMassimale();
				
				saldo = saldo - inImporto;
				massimale = massimale - inImporto;
				
				CB.setMassimale(massimale);
				ccUtente.setSaldo(saldo);
				
				return inImporto;
			}
				
		}
	}
	
	public String toString(){
		if(isInserita){
			return CB.toString();
		}else{
			return "Nessuna Carta Inserita!";
		}
	}
}
