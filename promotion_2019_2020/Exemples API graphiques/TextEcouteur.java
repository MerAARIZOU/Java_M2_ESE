import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class TextEcouteur implements KeyListener{
	public void keyPressed(KeyEvent e){

	}

	public void keyReleased(KeyEvent e){

	}

	public void keyTyped(KeyEvent e){
		System.out.print(e.getKeyChar()+"");

	}
}