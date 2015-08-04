package org.formation.fonctionnelle;

import java.util.Random;

public class FonctAvanceDoWhile1 {

	public static void main(String[] args) {
		int numberOfTries = 0;
		int a, b, c;
		Random r = new Random();

		do {
			a = r.nextInt(1000);
			b = r.nextInt(1000);
			c = r.nextInt(1000);
			
			numberOfTries++;
		} while((a % 2) == 1 || (b % 2) == 1 || (c % 2) == 0);
		
		/*
		 * version "à ne jamais faire"
		do {
		} while(++numberOfTries > 0 & ((r.nextInt(1000) % 2) == 1 || (r.nextInt(1000) % 2) == 1 || (r.nextInt(1000) % 2) == 0));
		*/
		
		System.out.println("La suite 'pair, pair, impair' (" + a + ", " + b + ", " + c + ") a été obtenue après " + numberOfTries + " essai" + (numberOfTries > 1 ? "s" : ""));
	}

}
