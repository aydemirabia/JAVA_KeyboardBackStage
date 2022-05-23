package java_klavye;

import java.awt.Graphics;
import javax.swing.JFrame;

public class KlavyeJava extends JFrame {
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawLine(0, 0, 250, 250);
	}


}
