
public class GiocoOcaEliminazione extends GiocoDellOca{
	int casellaEliminazione;
	public GiocoOcaEliminazione(int numCaselle, int casellaEliminazione) {
		super(numCaselle);
		this.casellaEliminazione = casellaEliminazione;
	}
	public Pedina giocaTurno() {
		Pedina p = super.giocaTurno();
		if(p == null) {		
			int ultimoTurnoGiocato;
			if(this.turno != 0) ultimoTurnoGiocato = this.turno - 1;
			else ultimoTurnoGiocato = this.pedine.size() - 1;
			Pedina ultimaPedinaMossa = this.pedine.get(ultimoTurnoGiocato);
			if(ultimaPedinaMossa.getCasellaCorrente() == this.casellaEliminazione){
				this.pedine.remove(ultimoTurnoGiocato);
				if(this.turno != 0) this.turno--;
			}
		}
		return p;
	}
	
	
}
