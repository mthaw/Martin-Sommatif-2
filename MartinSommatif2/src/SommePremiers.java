/*
* @Auteur : Martin Thaw
* @Date : Dec. 15, 2020
* @Description : Programme qui permet de trouver et afficher la somme des nombres premiers contenus dans un tableau.
* Ce tableau a 100 nombres entiers generes au hasard qui sont entre 0 et 99999 (inclusive).
*/

import java.util.*;

public class SommePremiers {

	public static int sommePremiers(int tableau[]) {
		int somme = 0;
		for (int i = 0; i < tableau.length; i++) {
			if (isPremier(tableau[i])) {
				somme += tableau[i];
				System.out.println("Prime");
			}
		}
		return somme;
	}

	public static boolean isPremier(int valeur) {
		if (valeur == 1) {
			return false;
		}
		for (int i = 2; i <= valeur / 2; i++) {
			if (valeur % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		int monTableau[] = new int[100];
		for (int i = 0; i < 100; i++) {
			monTableau[i] = (int) (Math.random() * 100000);
		}
		System.out.println(sommePremiers(monTableau));
	}

}
