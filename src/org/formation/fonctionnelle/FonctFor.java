package org.formation.fonctionnelle;

/*
 * Etape 1 Imprimer les chiffres de 0 � 12
 * 
 * Etape 2
 * 
 * Cr�er un tableau
 * contenant une s�rie de chiffres. Afficher la valeur de chaque �l�ment du
 * tableau En utilisant la boucle classique et l'attribut length En
 * utilisant la boucle nomm�e for each
 * 
 * Etape 3
 * Cr�er une constante String
 * portant le nom de la ville dans laquelle nous sommes Cr�er une liste de
 * villes (String) dont un des �l�ment est la ville dans laquelle nous
 * sommes Parcourir cette liste. Si le non de la ville correspond � la ville
 * dans laquelle nous sommes afficher � c'est ma ville pr�f�r�e � sinon
 * afficher � ... �
 */
public class FonctFor {

	public static void main(String[] args) {
		for (int i = 0; i < 13; i++) {
			System.out.println(i);
		}

		System.out.println("------");

		final int[] chiffres = {1, 42, 57, 74, 11, 16, 87};
		for (int i = 0; i < chiffres.length; i++) {
			System.out.println(chiffres[i]);
		}

		System.out.println("------");

		for (final int k : chiffres) {
			System.out.println(k);
		}

		System.out.println("------");

		final String ville = "Nantes";
		final String[] villes = {"Paris", "Nantes", "Lille", "Bordeaux"};
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
