import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
 
public class Ex{
	public static void main(String[] args) {

		Fenetre fenetre = new Fenetre();
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		fenetre.setContentPane(panel);

	}
}