package org.formation.fonctionnelle;

import java.util.Scanner;

/*
 * Un signe astrologique chinois d�pend de l'ann�e de naissance. Faire une
 * application qui pour une ann�e de naissance en entr�e, fait correspondre
 * le signe astrologique chinois appropri�.
 */
public class ChineseZodiac {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int year = scanner.nextInt();
			int sign = year % 12;

			switch (sign) {
				case 0:
					System.out.println("You are a monkey");
					break;
				case 1:
					System.out.println("You are a cock");
					break;
				case 2:
					System.out.println("You are a dog");
					break;
				case 3:
					System.out.println("You are a pig");
					break;
				case 4:
					System.out.println("You are a rat");
					break;
				case 5:
					System.out.println("You are an ox");
					break;
				case 6:
					System.out.println("You are a tiger");
					break;
				case 7:
					System.out.println("You are a rabbit");
					break;
				case 8:
					System.out.println("You are a dragon");
					break;
				case 9:
					System.out.println("You are a snake");
					break;
				case 10:
					System.out.println("You are a horse");
					break;
				case 11:
					System.out.println("You are a sheep");
					break;
				default: // negative number
					System.out.println("?????????????");
			}
		}
	}

}
