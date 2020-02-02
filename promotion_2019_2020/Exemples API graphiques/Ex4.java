import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
 
public class Ex{
	public static void main(String[] args) {

		Fenetre fenetre = new Fenetre();
		Panel panel = new Panel("mon bouton");
		fenetre.setContentPane(panel);

	}
}