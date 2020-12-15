/*
* @Auteur : Martin Thaw
* @Date : Dec. 15, 2020
* @Description : Programme avec des methodes permettant de manipuler des tableaux:
* Exercise 1. Programme reecrite avec les 4 erreurs corriges (erreurs donnes ci-dessous)
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
 * 5. La methode saluerAmi n'est pas static. Il faut etre static pour etre appele dans le main (qui est static).
 */
public class Erreurs {
	public static void main(String[] args) {
		System.out.println(saluerAmi("John"));
	}

	public static String saluerAmi(String nom) {
		String message = "Bonjour mon ami " + nom;
		return message;
	}
}
