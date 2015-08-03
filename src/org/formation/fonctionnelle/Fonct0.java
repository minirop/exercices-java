package org.formation.fonctionnelle;

import java.util.Scanner;

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
		//while(value < 0 || value > 1000) {
		//	System.out.println("ENTRE 0 ET 1000 J'AI DIT !!!! ");
		//	value = s.nextInt();
		//}
		
		int total = 0;
		int v2 = value;
		while(v2 > 0) {
			total += (v2 % 10);
			v2 /= 10;
		}
		System.out.println("somme des chiffres de " + value + " = " + total);
		s.close();
		
		// max int = 82 (1999999999)
		// max long = 170 (8999999999999999999)
	}

}
