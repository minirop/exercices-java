package org.formation.fonctionnelle;

import java.util.Scanner;

public class GradeEvaluator {

	public static void main(String[] args) {
		/* Faire une application qui attend une note sur 100 en entrée
		Si la note est supérieure à 63, afficher « Vous avez un C » plus une appréciation moyenne
		Si la note est supérieure à 79, afficher « Vous avez un B » plus un encouragement
		Si la note est supérieure à 89, afficher « Vous avez un A » plus une félicitation
		Sinon afficher « vous avez un F » plus un conseil de réorientation*/
		Scanner s = new Scanner(System.in);
		System.out.print("Entrez une note entre 0 et 100 : ");
		int note = s.nextInt();
		
		if (note > 89) {
			System.out.println("Vous avez un A, félicitation.");
		} else if (note > 79) {
			System.out.println("Vous avez un B, continuez comme ça.");
		} else if (note > 63) {
			System.out.println("Vous avez un C, peut mieux faire.");
		} else {
			System.out.println("Vous avez un F, changez de domaine.");
		}
		
		s.close();
	}

}
