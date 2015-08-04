package org.formation.fonctionnelle;

/* 
 * Créer deux String de la manière suivante :
* String lievre;
* String tortue = "";
* Faire une boucle qui itère 10000 fois
* dans la boucle ajouter '' '' et i (l'indice de l'itération).
* Faire une boucle en concaténant des string avec +
* Une boucle en utilisant StringBuilder et sa méthode append() ;
* Comparer les chaines (elle doivent être égales)
* Calculer le temps mis pour la concaténation et pour la méthode append de StringBuilder
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

		System.out.println("chaines égales ? " + tortue.equals(lievre));
		System.out.format("tortue = %.2f ms\n", duration1 / 1000000.0);
		System.out.format("lièvre = %.2f ms\n", duration2 / 1000000.0);
	}

}
