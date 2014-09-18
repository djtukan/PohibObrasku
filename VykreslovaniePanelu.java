package javaGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class VykreslovaniePanelu extends JPanel {
	private final int SIRKA_OBRASKU = 141;
	private final int VYSKA_OBRASKU = 80;
	private int x, y;
	private int smerX, smerY;

	private Image image;
	private int i = 0;
	public VykreslovaniePanelu (){
		this.x = 0;
		this.y = 0;
		this.smerX = 1;
		this.smerY = 1;
		
		this.setPreferredSize(new Dimension(600, 400));
		this.setBackground(Color.WHITE);
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource("images.jpg"));
		image = ii.getImage();
		
		Timer timer = new Timer(20, new Pohibovanie());
		timer.start();
	}
	public void paint(Graphics g ){
		
		
		
		
		Graphics2D g2d = (Graphics2D ) g;
		g2d.drawImage(image, x, y, SIRKA_OBRASKU, VYSKA_OBRASKU, null);
		
		
	}
	private void move(){
		x += smerX;
		y += smerY;
		
		if  ( x + smerX <  0 ) 
			smerX =  1 ; 
		else  if  ( x + smerX > this.getWidth ()  - SIRKA_OBRASKU ) 
		  smerX =  - 1 ; 
		else  if  ( y + smerY <  0 ) 
		 smerY = 1 ; 
		else  if  ( y + smerY > this. getHeight ()  - VYSKA_OBRASKU ) 
			smerY = -1; 
	}
	class Pohibovanie  implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			 move();
				repaint();
			
		}
		
	}
}
