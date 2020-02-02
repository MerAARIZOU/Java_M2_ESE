
import javax.swing.JFrame;
 
public class Ex1{
	public static void main(String[] args) {

		//Créer un composant JFrame
		JFrame fenetre = new JFrame();
		
		//Rendre le composant visible
		fenetre.setVisible(true);

		//Fixer une taille au composant
		fenetre.setSize(400, 200);

		//Fixer l'opération de fermeture de la fenêtre
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Positionner le composant au centre de l'écran
		fenetre.setLocationRelativeTo(null);

	}
}