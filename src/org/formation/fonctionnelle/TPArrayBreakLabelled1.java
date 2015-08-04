package org.formation.fonctionnelle;

import java.util.Scanner;

public class TPArrayBreakLabelled1 {

	public static void main(String[] args) {
		int[][] tab = {
				{  32,   87,    3, 589 },
				{  12, 1076, 2000,   8 },
				{ 622,  127,   77, 955 }
		};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez une valeur : ");
		int val = scanner.nextInt();
		scanner.close();
		
		//boolean found = false;
		loop: for(int i = 0;i < tab.length;i++) {
			for(int j = 0;j < tab[i].length;j++) {
				if (tab[i][j] == val) {
					System.out.println("trouvé à l'indice " + i + ", " + j);
					//found = true;
					break loop;
				}
			}
			
			if(i < tab.length - 1) continue;
			
			System.out.println("cette valeur n'existe pas");
		}
		//if(!found) {
		//	System.out.println("cette valeur n'existe pas");
		//}

	}

}
