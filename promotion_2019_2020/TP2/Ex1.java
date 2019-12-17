import java.util.Scanner;
import java.io.File;

/**
 * Exemple de l'utilisation de la classe Scanner pour lecture d'un fichier texte
 *
 * @see java.util.Scanner
 * @see java.io.File
 * @author Meriem AARIZOU
 */


public class Ex1{
	public static void main(String[] args){
		try{
		Scanner input = new Scanner(new File("exemple.txt"));
		String ligne;

		//lecture de la première ligne
		ligne = input.nextLine();
		System.out.println(ligne);

		//lecture de la deuxième ligne
		ligne = input.nextLine();
		System.out.println(ligne);

		//lecture des autres lignes		
		while (input.hasNextLine()){
			ligne = input.nextLine();
			System.out.println(ligne);
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}