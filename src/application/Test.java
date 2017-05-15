package application;

import java.util.Scanner;
import exoNoteCnam.Forme;

public class Test {

	public static void main(String[] args) {
		Forme[] formes = new Forme[2];
		Scanner clavier = new Scanner(System.in);
		for(int i=0; i<formes.length; i++){
			System.out.println("Donner à "+(i+1)+" une surface ");
			int surf = clavier.nextInt();
			System.out.println("Donner à "+(i+1)+" une couleur ");
			String coul = clavier.nextLine();
			formes[i]= new Forme(surf, coul);
		}
		clavier.close();
		
		
		
	}

}
