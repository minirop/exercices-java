package org.formation.fonctionnelle;

import java.util.Random;

/*
 * Générer trois nombres aléatoires compris entre 0 et 1000, puis vérifier
 * si vous avez deux nombres pairs suivis par un nombre impair. Si ce n’est
 * pas le cas, recommencer jusqu’à ce vous ayez la combinaison pair, pair,
 * impair. Afficher ensuite le nombre d’essais nécessaires pour obtenir
 * cette combinaison.
 */
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
		} while ((a % 2) == 1 || (b % 2) == 1 || (c % 2) == 0);

		// version "à ne jamais faire"
		// do {
		// } while(++numberOfTries > 0 & ((r.nextInt(1000) % 2) == 1 || (r.nextInt(1000) % 2) == 1 || (r.nextInt(1000) % 2) == 0));
		System.out.format("La suite 'pair, pair, impair' (%d, %d, %d) a été obtenue après %d essai%s", a, b, c, numberOfTries, (numberOfTries > 1 ? "s" : ""));
	}

}
