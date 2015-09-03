package org.formation.fonctionnelle;

import java.util.HashMap;
import java.util.Map.Entry;

/* 
 * Cr�er un tableau de dix cha�nes de caract�res puis remplir ce tableau avec des adresses e-mail.
 * Calculer ensuite, � partir des informations pr�sentes dans le tableau, la part de march� de chacun
 * des fournisseurs d�acc�s. On suppose que le nom du fournisseur d�acc�s est la partie situ�e apr�s
 * le caract�re @ de l�adresse e-mail.
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
