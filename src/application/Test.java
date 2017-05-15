package application;

import java.util.Scanner;
import exoNoteCnam.Forme;

public class Test {

	public static void main(String[] args) {
		Forme[] formes = new Forme[3];
		Scanner clavier = new Scanner(System.in);
		for(int i=0; i<formes.length; i++){
			System.out.print("Donner à "+(i+1)+" une surface ");
			int surface = clavier.nextInt();
			System.out.print("Donner à "+(i+1)+" une couleur ");
			String couleur = clavier.nextLine();
			formes[i]= new Forme(surface, couleur);
		}
		clavier.close();
		
	}

}
