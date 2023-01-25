import java.util.Vector;

public class GiocoDellOca {
	private int numeroCaselleTotali;
	protected int turno;
	private Dado dado;
	protected Vector<Pedina> pedine;
	public GiocoDellOca(int numCaselle){
		this.numeroCaselleTotali = numCaselle;
		this.turno = 0;
		this.dado = new Dado();
		pedine = new Vector<Pedina>();
	}
	public void aggiungiPedina(Pedina p){
		pedine.add(p);
	}
	public Pedina giocaTurno(){
		int valoreLancio = this.dado.lancia();
		Pedina p = pedine.get(this.turno);
		p.avanza(valoreLancio);
		System.out.println("Turno " + turno + " " + p);
		if(p.getCasellaCorrente() > this.numeroCaselleTotali){
			pedine.remove(this.turno);
			//dopo pedine.remove il turno corrente indica
			//il giocatore successivo, eccetto il caso in
			//cui venga rimossa l'utima pedina
			if(this.turno == pedine.size()) 
				this.turno = 0;
			return p;
		}
		//else:
		turno = (turno + 1) % pedine.size();
		return null;
	}
}