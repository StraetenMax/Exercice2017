package exoNoteCnam;

public class Quadrilatere extends Forme {
	//propriétés
	private String type;
	
	//constructeurs vide et initialisé
	public Quadrilatere(){
		super();
		type = "";
	}
	public Quadrilatere(int surface, String couleur, String type){
		super(surface, couleur);
		this.type = type;
	}
	
	//accesseurs et mutateurs
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
	//méthodes
	public String afficher(){
		String aff = "Quadrilatere affiche";
		return aff;
	}
	public String description(){
		String des = super.description()+" qui est de type "+this.getType();
		return des;
	}
	
}