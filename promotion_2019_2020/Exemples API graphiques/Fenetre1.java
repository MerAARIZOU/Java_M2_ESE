import javax.swing.JFrame;

public class Fenetre1 extends JFrame{

	public Fenetre1(){

		
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Panel panel = new Panel();
		
		this.setContentPane(panel);
		this.setVisible(true);
	}
}