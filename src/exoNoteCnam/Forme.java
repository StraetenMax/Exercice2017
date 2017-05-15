package exoNoteCnam;

public class Forme {
	//propriétés
	private int surface;
	private String couleur;
	
	//constructeurs vide et initialisé
	public Forme(){
		surface = 0;
		couleur = "";
	}
	public Forme(int surface, String couleur){
		this.surface= surface;
		this.couleur= couleur;
	}
	// accesseurs et mutateurs
	public int getSurface(){
		return surface;
	}
	public void setSurface(int surface){
		this.surface = surface;
	}
	
	public String getCouleur(){
		return couleur;
	}
	public void setCouleur(String couleur){
		this.couleur = couleur;
	}
		//méthodes
	public String afficher(){
		String af = "Forme affichée";
		return af;
	}
	public String masquer(){
		String ma = "Forme masquée";
		return ma;
	}
	public String description(){
		String des = "La forme de surface "+this.getSurface()+" est de couleur "+this.getCouleur();
		return des;
	}

}


