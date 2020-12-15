/*
* @Auteur : Martin Thaw
* @Date : Dec. 15, 2020
* @Description : Programme qui permet de trouver et afficher la somme des nombres premiers contenus dans un tableau.
* Ce tableau a 100 nombres entiers generes au hasard qui sont entre 0 et 99999 (inclusive).
*/

public class SommePremiers {
/**
 * 
 * @param tableau, le tableau d'entiers dans lequel on veut trouver la somme des nombres premiers.
 * @return la somme des nombres premiers dans tableau
 */
	public static int sommePremiers(int tableau[]) {
		int somme = 0;//Creer la variable somme, la somme des nombres premiers dans tableau
		for (int i = 0; i < tableau.length; i++) {//Pour chaque valeur dans tableau
			if (isPremier(tableau[i])) {//Si il est premier
				somme += tableau[i];//Augmenter la somme par ce nombre premier
			}
		}
		return somme;//Retourner la somme des nombres premiers dans tableau
	}
/**
 * 
 * @param valeur, on veut verifier si valeur est un nombre premier
 * @return true, si valeur est un nombre premier et false sinon (valeur n'est pas un nombre premier)
 */
	public static boolean isPremier(int valeur) {
		if (valeur == 1) {//Si valeur est 1, 
			return false;//il n'est pas premier (exception)
		}
		for (int i = 2; i <= valeur / 2; i++) {//Verifier tous les facteurs de 2 jusqu'a un demi de valeur (=valeur/2)
			if (valeur % i == 0) {//Si il est divisible par ce facteur i (donne un reste de 0), alors 
				return false;//il n'est pas premier
			}

		}
		return true;//Si aucun facteur le divise (la methode n'a pas deja fait return), valeur est premier
	}

	public static void main(String[] args) {
		int monTableau[] = new int[100];//Creer le tableau de taille 100
		for (int i = 0; i < 100; i++) {//Pour chaque element du tableau
			monTableau[i] = (int) (Math.random() * 100000);//Mettre un nombre au hazard entre 1 et 99999 inclusive
		}
		//Appeler la methode somme Premiers et afficher le resultat:
		System.out.println(sommePremiers(monTableau));
	}

}
