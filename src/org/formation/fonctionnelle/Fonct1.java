package org.formation.fonctionnelle;

import java.util.Scanner;
import static java.lang.Math.PI;

/*
 * demandez � l'utilisateur le rayon et la longueur d'un cylindre, en
 * afficher l'aire du disque et le volume du cylindre
 */
public class Fonct1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Entrez un rayon : ");
		double r = s.nextDouble();
		System.out.print("Entrez une longueur : ");
		double l = s.nextDouble();
		System.out.println("aire = " + (r * r * PI));
		System.out.println("volume = " + (l * r * r * PI));
		s.close();
	}

}
