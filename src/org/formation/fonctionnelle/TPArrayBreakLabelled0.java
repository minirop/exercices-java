package org.formation.fonctionnelle;

//import java.util.Arrays;
import java.util.Scanner;

/*
 * Cr�er un tableau avec les int suivants :
 * 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127
 * Demander un int en entr�e.
 * Rechercher la valeur dans le tableau.
 * Si elle est trouv�e afficher � trouv� ! � sinon � cette valeur n'existe pas �
 */
public class TPArrayBreakLabelled0 {

	public static void main(String[] args) {
		int[] tab = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
		int val;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entrez une valeur : ");
			val = scanner.nextInt();
		}

		boolean found = false;
		for (int x : tab) {
			if (x == val) {
				System.out.println("trouv� !");
				found = true;
			}
		}
		if (!found) {
			System.out.println("cette valeur n'existe pas");
		}
		/*
		 * Arrays.sort(tab); if(Arrays.binarySearch(tab, val) >= 0) {
		 * System.out.println("trouv� !"); } else { System.out.println(
		 * "cette valeur n'existe pas"); }
		 */
	}

}
