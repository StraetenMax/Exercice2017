package exoNoteCnam;

public class Rectangle extends Quadrilatere{
	//propriétés
	private int aire;
	
	//constructeurs vide initialisé
	public Rectangle(){
		super();
		aire = 0;
	}
	public Rectangle(int surface, String couleur, String type, int aire){
		super(surface,couleur, type);
		this.aire = aire;
	}
	
	//accesseur et mutateur
	public int getAire(){
		return aire;
	}
	public void setAire(int aire){
		this.aire = aire;
	}
	
	//méthodes
	public boolean estDeMemeCouleurQue(Rectangle rect){
		boolean mCouleur;
		if(rect.getCouleur() == this.getCouleur()){
			mCouleur = true;
	}else{
		 mCouleur = false;
	}
	return mCouleur;
	}
	
	public String description(){
		String desc = super.description()+" qui a une aire de "+this.getAire();
		return desc;
	}
	
}