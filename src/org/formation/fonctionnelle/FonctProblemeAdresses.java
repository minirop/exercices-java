package org.formation.fonctionnelle;

import java.util.HashMap;
import java.util.Map.Entry;

/* 
 * Créer un tableau de dix chaînes de caractères puis remplir ce tableau avec des adresses e-mail.
 * Calculer ensuite, à partir des informations présentes dans le tableau, la part de marché de chacun
 * des fournisseurs d’accès. On suppose que le nom du fournisseur d’accès est la partie située après
 * le caractère @ de l’adresse e-mail.
 */
public class FonctProblemeAdresses {

	public static void main(String[] args) {
		String[] adresses = {"test1@hotmail.com", "foo@bar.com", "lalala@wanadoo.fr", "dupont@gmail.com",
			"test2@hotmail.com", "dupond@gmail.com", "useless@yahoo.com", "bob@sfr.fr", "bill.gates@hotmail.com",
			"lala@orange.fr"};

		HashMap<String, Integer> pourcentages = new HashMap<>();
		for (String addr : adresses) {
			String domaine = addr.substring(addr.indexOf('@') + 1);
			int nombre = 1;
			if (pourcentages.containsKey(domaine)) {
				nombre += pourcentages.get(domaine);
			}
			pourcentages.put(domaine, nombre);
		}

		for (Entry<String, Integer> entry : pourcentages.entrySet()) {
			float percent = entry.getValue() * 100.0f / adresses.length;
			System.out.format("%s: %.2f%%\n", entry.getKey(), percent);
		}

	}

}
