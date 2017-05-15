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
	
}