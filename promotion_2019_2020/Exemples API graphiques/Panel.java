import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class Panel extends JPanel{

	private JButton bouton;
	private JSpinner spin;

	public Panel(String titre){
		this.bouton = new JButton(titre);
		this.spin = new JSpinner();
		this.add(this.bouton);
		this.add(this.spin);
	}
}