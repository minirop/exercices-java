package org.formation.fonctionnelle;

import java.util.Scanner;

/*
 * Créer deux entiers x et y. Calculer et afficher leur somme, leur
 * différence, leur produit, le quotient de x/y, le reste de x/y et les
 * afficher. Faire la même chose avec des 'double'.
 * 
 * Faire une application qui
 * prend un nombre entre 0 et 1000 et qui fait la somme des chiffres (digit)
 * de ce nombre
 */
public class Fonct0 {
	public static void main(String[] args) {
		int xi = 10, yi = 3;
		System.out.println("entiers:");
		System.out.println("x + y = " + (xi + yi));
		System.out.println("x - y = " + (xi - yi));
		System.out.println("x * y = " + (xi * yi));
		System.out.println("x / y = " + (xi / yi));
		System.out.println("x % y = " + (xi % yi));
		System.out.println("x % 10 = " + (xi % 10));

		double xd = 10, yd = 3;
		System.out.println("flottants:");
		System.out.println("x + y = " + (xd + yd));
		System.out.println("x - y = " + (xd - yd));
		System.out.println("x * y = " + (xd * yd));
		System.out.println("x / y = " + (xd / yd));
		System.out.println("x % y = " + (xd % yd));
		System.out.println("x % 10 = " + (xd % 10));

		Scanner s = new Scanner(System.in);
		System.out.print("Entrez un nombre entre 0 et " + Integer.MAX_VALUE + " : ");
		int value = s.nextInt();

		int total = 0;
		int v2 = value;
		while (v2 > 0) {
			total += (v2 % 10);
			v2 /= 10;
		}
		System.out.println("somme des chiffres de " + value + " = " + total);
		s.close();

		// max somme int = 82 (1999999999)
		// max somme long = 170 (8999999999999999999)
	}

}
