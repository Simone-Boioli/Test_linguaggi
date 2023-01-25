
public class Guerriero {
	private int resistenza;
	private String nome;
	private Arma arma;
	private Armatura armatura;
	
	//costruttore
	public Guerriero(int resistenza, String nome,Arma ar,Armatura armor){
		this.resistenza = resistenza;
		this.nome = nome;
		this.arma=ar;
		this.armatura=armor;
	}
	
	public Armatura getArmatura(){
		return armatura;
	}
	
	public String getNome(){
		return nome;
	}
	public int getResistenza(){
		return resistenza;
	}
	
	public void infliggiDanno(int danno){
		resistenza=resistenza-danno;
	}
	
	public String attacca (Guerriero avversario){
		int danno=arma.calcolaDanno(avversario.getArmatura());
		
		String mex="<"+nome+"> attacca <"+avversario.getNome()+">";
		mex=mex+" infliggendogli <"+danno+">";
		mex+="\n[resInizialeAvversario: "+avversario.getResistenza();
		
		avversario.infliggiDanno(danno);
		
		mex+=" resFinaleAvversario: "+avversario.getResistenza();
		
		if(avversario.getResistenza()<1){
			System.out.println(avversario.muore());
		}
		else
			System.out.println(avversario.attacca(this));
		
		return mex;
	}
	
	private String muore(){
		String mex=nome+" Muore";
			
		
		return mex;
	}

}
