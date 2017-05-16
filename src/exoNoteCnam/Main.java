package exoNoteCnam;

public class Main {

	public static void main(String[] args) {
		//instanciers les classes
		Forme F1 = new Forme(123,"Blanc");
		Quadrilatere Q1 = new Quadrilatere(145,"Bleu","Concave");
		Carre C1 = new Carre(127, "Vert","Convexe",4);
		Carre C2 = new Carre(169, "Rouge","Croisé",6);
		
		Rectangle R1 = new Rectangle(115,"Bleu","Convexe",18);
		Rectangle R2 = new Rectangle(189, "Gris","Concave",22);
	
		//appeler les méthodes
		System.out.println(F1.description());
		System.out.println(Q1.description());
		System.out.println(R1.description());
	
	}

}
