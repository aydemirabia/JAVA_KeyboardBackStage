package java_klavye;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
//Kalvyeden bastýðýmýzda String içeriðini deðiþtirmesi için KeyListener kullanýlýr.

public class Keyboard extends JFrame implements MouseListener, KeyListener {
	private Random rnd;
	private int x1, y1, x2, y2;
	
	private String yazi;
	
	//constructor
	public Keyboard() {
		super();
		rnd = new Random();
		addMouseListener(this); //Constructor'a MouseListener'ý ekleme iþlemini yaptýk.
		
		//KeyListener'ý bu classta almasý için kullanýldý.
		addKeyListener(this);
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		yazi = "Java GNU Keyboard  ";
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(x1, y1, x2, y2);
		g.drawString(yazi, 50, 50);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == e.BUTTON1) {
			x1 = e.getX();
			y1 = e.getY();
		}
		else if(e.getButton() == e.BUTTON3) {
			x2 = e.getX();
			y2  =e.getY();
		}
		repaint();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		/*yazi += e.getKeyChar();
		repaint();*/
	}
	@Override
	public void keyPressed(KeyEvent e) {
		//Hangi karakter basýlýyorsa o karakteri alýr ve ekrana yazar.
				//System.out.println("KeyCode: " + e.getKeyChar() + "VKA: " + e.VK_A);
				/*if(e.getKeyCode() == e.VK_BACK_SPACE) {
					yazi = yazi.substring(0, yazi.length()-1);
				}*/
				/*else {
					yazi = yazi + e.getKeyChar();
				}
				yazi = yazi + e.getKeyChar();*/
		
		if(e.getKeyCode() == e.VK_BACK_SPACE && yazi.length() > 0) {
			yazi = yazi.substring(0, yazi.length()-1);
		}
		else {
			yazi += e.getKeyChar();
		}
		repaint();
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
