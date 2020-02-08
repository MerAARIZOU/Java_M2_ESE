import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class Panel1 extends JPanel{

	private JButton bouton;
	private JSpinner spin;
	private JTextField textField;

	public Panel1(){

		this.setLayout(new BorderLayout());
		
		this.bouton = new JButton("mon titre");
		this.spin = new JSpinner();
		this.textField = new JTextField(10);
		
		this.add(this.bouton, BorderLayout.NORTH);
		this.add(this.spin, BorderLayout.WEST);
		this.add(this.textField, BorderLayout.SOUTH);

		//Créer une instance de l'écouteur
		BoutonEcouteur boutonEcouteur = new BoutonEcouteur();
		TextEcouteur textEcouteur = new TextEcouteur();

		//Associer l'écouteur au bouton
		this.bouton.addMouseListener(boutonEcouteur);
		this.textField.addKeyListener(textEcouteur);
	}
}