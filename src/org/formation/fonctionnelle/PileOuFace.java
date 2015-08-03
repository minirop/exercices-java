package org.formation.fonctionnelle;

import java.util.Random;
import java.util.Scanner;

public class PileOuFace {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Entrez 0 (pile) ou 1 (face) : ");
		int choix = s.nextInt();
		int piece = new Random().nextInt(2);
		if (piece == choix) {
			System.out.println("BRAVO !");
		} else {
			System.out.println("PERDU ! Il fallait choisir " + (piece == 0 ? "pile" : "face") + ".");
		}
		s.close();
	}

}
