package org.formation.fonctionnelle;

/*
 * Etape 1 Imprimer les chiffres de 0 à 12
 * 
 * Etape 2
 * 
 * Créer un tableau
 * contenant une série de chiffres. Afficher la valeur de chaque élément du
 * tableau En utilisant la boucle classique et l'attribut length En
 * utilisant la boucle nommée for each
 * 
 * Etape 3
 * Créer une constante String
 * portant le nom de la ville dans laquelle nous sommes Créer une liste de
 * villes (String) dont un des élément est la ville dans laquelle nous
 * sommes Parcourir cette liste. Si le non de la ville correspond à la ville
 * dans laquelle nous sommes afficher « c'est ma ville préférée » sinon
 * afficher « ... »
 */
public class FonctFor {
	public static void main(String[] args) {
		for (int i = 0; i < 13; i++) {
			System.out.println(i);
		}

		System.out.println("------");

		final int[] chiffres = { 1, 42, 57, 74, 11, 16, 87 };
		for (int i = 0; i < chiffres.length; i++) {
			System.out.println(chiffres[i]);
		}

		System.out.println("------");

		for (final int k : chiffres) {
			System.out.println(k);
		}

		System.out.println("------");

		final String ville = "Nantes";
		final String[] villes = { "Paris", "Nantes", "Lille", "Bordeaux" };
		for (final String v : villes) {
			System.out.print(v + " : ");
			if (v.equals(ville)) {
				System.out.println("C'est une ville comme une autre.");
			} else {
				System.out.println("...");
			}
		}
	}

}
