package org.formation.fonctionnelle;

public class FonctFor {

	public static void main(String[] args) {
		for(int i = 0;i < 13;i++) {
			System.out.println(i);
		}
		
		System.out.println("------");
		
		final int[] chiffres = {
			1, 42, 57, 74, 11, 16, 87	
		};
		for(int i = 0;i < chiffres.length;i++) {
			System.out.println(chiffres[i]);
		}
		
		System.out.println("------");
		
		for(final int k : chiffres) {
			System.out.println(k);
		}
		
		System.out.println("------");
		
		final String ville = "Nantes";
		final String[] villes = {
				"Paris", "Nantes", "Lille", "Bordeaux"
		};
		for(final String v : villes) {
			System.out.print(v + " : ");
			if (v.equals(ville)) {
				System.out.println("C'est une ville comme une autre.");
			} else {
				System.out.println("...");
			}
		}
	}

}
