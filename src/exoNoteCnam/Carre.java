package exoNoteCnam;

public class Carre extends Quadrilatere{
	//propriétés
	private int tailleCote;
	private boolean grand;
	
	//constructeurs vide initialisé
	public Carre(){
		super();
		tailleCote= 0;
		this.setGrand();
	}
	public Carre(int surface, String couleur,String type,int tailleCote){
		super(surface, couleur, type);
		this.tailleCote = tailleCote;
		this.setGrand();
	}
	
	//accesseurs et mutateurs
	public int getTailleCote(){
		return tailleCote;
	}
	public void setTailleCote(int tailleCote){
		this.tailleCote = tailleCote;
		this.setGrand();
	}
	public boolean getGrand(){
		return grand;
	}
	public void setGrand(){
		if(tailleCote>10){
			grand = true;
		}else{
			grand = false;
		}
	}
	//méthodes
	public boolean estPlusGrandQue(Carre ct){
		boolean crt;
		if(ct.getTailleCote()>this.getTailleCote()){
			crt = true;
		}else{
			crt = false;
		}
		return crt;
	}
	
	public String description(){
		String descript = super.description()+" dont le coté mesure "+this.getTailleCote()+" cm";
		return descript;
	}
	
}
