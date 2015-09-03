package org.formation.fonctionnelle;

import java.util.Random;
import java.util.Scanner;

/*
 * Faire une application qui tire au sort un nombre soit 0 pour pile, soit 1 pour face
 * Demander un choix (0 ou 1)
 * Si le nombre correspond, afficher « bravo ! »
 * sinon si le nombre tiré est 0 afficher c'est pile, si le nombre tiré est 1 afficher c'est face
 */
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
