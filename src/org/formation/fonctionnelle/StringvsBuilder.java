package org.formation.fonctionnelle;

/* 
 * Cr�er deux String de la mani�re suivante :
 * String lievre;
 * String tortue = "";
 * Faire une boucle qui it�re 10000 fois
 * dans la boucle ajouter '' '' et i (l'indice de l'it�ration).
 * Faire une boucle en concat�nant des string avec +
 * Une boucle en utilisant StringBuilder et sa m�thode append() ;
 * Comparer les chaines (elle doivent �tre �gales)
 * Calculer le temps mis pour la concat�nation et pour la m�thode append de StringBuilder
 */
public class StringvsBuilder {

	public static void main(String[] args) {
		String lievre;
		String tortue = "";

		long start1 = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			tortue += " " + i;
		}
		long duration1 = System.nanoTime() - start1;

		StringBuilder builder = new StringBuilder();
		long start2 = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			builder.append(" ");
			builder.append(i);
		}
		long duration2 = System.nanoTime() - start2;
		lievre = builder.toString();

		System.out.println("chaines �gales ? " + tortue.equals(lievre));
		System.out.format("tortue = %.2f ms\n", duration1 / 1000000.0);
		System.out.format("li�vre = %.2f ms\n", duration2 / 1000000.0);
	}

}
