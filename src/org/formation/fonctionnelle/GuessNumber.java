package org.formation.fonctionnelle;

import java.util.Random;
import java.util.Scanner;

/*
 * Générer un nombre aléatoire compris entre 0 et 1000. Demander ensuite à l’utilisateur de deviner le
 * nombre choisi par l’ordinateur. Il doit saisir un nombre compris entre 0 et 1000 lui aussi.
 * Comparer le nombre saisi avec celui choisi par l’ordinateur et afficher sur la console
 * Afficher « c’est plus » ou « c’est moins » selon le cas.
 * Recommencer jusqu’à ce que l’utilisateur trouve le bon nombre.
 * Afficher alors le nombre d’essais nécessaires pour trouver la bonne réponse.
 */
public class GuessNumber {

	public static void main(String[] args) {
		int secretNumber = (new Random()).nextInt(1000);

		try (Scanner scanner = new Scanner(System.in)) {
			int value, numberOfTries = 0;
			do {
				System.out.print("Entrez un nombre entre 0 et 1000 : ");
				value = scanner.nextInt();
				numberOfTries++;

				if (value < secretNumber) {
					System.out.println("c'est plus");
				} else if (value > secretNumber) {
					System.out.println("c'est moins");
				}
			} while (value != secretNumber);
			System.out.println("c'est gagné ! " + numberOfTries + " essai" + (numberOfTries > 1 ? "s" : ""));
		}
	}

}
