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
}
