/*
* @Auteur : Martin Thaw
* @Date : Dec. 15, 2020
* @Description : Programme avec des methodes permettant de manipuler des tableaux:
* Exercise 1. Programme, class Erreurs, reecrite avec les 4 erreurs corriges (erreurs donnes ci-dessous)
*/

/*
 * Description des erreurs:
 * 1. Le nom de la classe (Exemples) sur ligne 10 n'est pas la meme que le nom du fichier nomme Erreurs.java
 *    Ils doivent etre les memes: le nom de classe sur la ligne 10 devrait etre "Erreurs" (sans les guillemets)
 * 
 * 2. La methode saluerAmi acccepte un String comme parametre, mais sur la ligne 14, on ne donne pas un String quand on l'appele. Il faut mettre des double guillemets (") autout de John. Pour que ce soit une chaine de caracteres
 * 
 * 3. Sur la ligne 22, on ne met pas d'espace entre "Bonjour mon ami" et nom. Donc si on appele la methode avec le nom "John", le message sera "Bonjour mon amiJohn". Il faut mettre l'espace
 * 
 * 4. La methode saluerAmi devrait retourner un String (comme specifie dans sa definition sur la ligne 20), mais elle ne le fait pas. Il faut retourner le message
 * 
 */
public class Erreurs {
	public static void main(String[] args) {
		// Appeler la methode saluerAmi avec le nom "John".
		Erreurs erreur = new Erreurs();//Creer un objet de la class erreurs
		System.out.println(erreur.saluerAmi("John"));//Appeler la methode saluerAmi sur cet objet (erreur), avec le nom "John" et imprimer le resultat (message)
	}

	/**
	 * 
	 * @param nom, c'est le nom de la personne qu'on veut saluer.
	 * @return le message pour saluer la personne qui est "Bonjour mon ami" suivi
	 *         par le nom de la personne qu'on salue, separes par une espace
	 */
	public String saluerAmi(String nom) {
		String message = "Bonjour mon ami " + nom;// Creer le message pour saluer
		return message;// Retourner le message
	}
}
