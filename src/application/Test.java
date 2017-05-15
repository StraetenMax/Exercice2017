package application;

//import java.util.Scanner;
import exoNoteCnam.Forme;

public class Test {

	public static void main(String[] args) {
		/*Forme[] formes = new Forme[2];
		Scanner clavier = new Scanner(System.in);
		for(int i=0; i<formes.length; i++){
			System.out.println("Donner à "+(i+1)+" une surface ");
			int surf = clavier.nextInt();
			System.out.println("Donner à "+(i+1)+" une couleur ");
			String coul = clavier.nextLine();
			formes[i]= new Forme(surf, coul);
		}
		clavier.close();*/
		Forme F1 = new Forme(200, "Rouge");
		Forme F2 = new Forme(250, "Jaune");
		Forme F3 = new Forme(200, "Vert");
		
		System.out.println(F1.description());
		System.out.println(F3.description());
		F1.setCouleur("Orange");
		System.out.println(F1.description());
		F3.setSurface(150);
		System.out.println(F3.description());
		
		System.out.println(F1.afficher());
		System.out.println(F2.masquer());
	}

}
