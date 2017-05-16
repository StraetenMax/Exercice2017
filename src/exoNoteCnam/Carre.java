package exoNoteCnam;

public class Carre extends Quadrilatere{
	//propriétés
	private int tailleCote;
	private boolean grand;
	
	//constructeurs vide initialisé
	public Carre(){
		super();
		tailleCote= 0;
		//this.getGrand();
	}
	public Carre(int surface, String couleur,String type,int tailleCote){
		super(surface, couleur, type);
		this.tailleCote = tailleCote;
		//this.getGrand();
	}
	
	
}
