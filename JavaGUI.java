package javaGUI;

import java.awt.Color;

import javax.swing.JFrame;



public class JavaGUI extends JFrame  {
	
	public JavaGUI (){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.white);
		VykreslovaniePanelu vp = new VykreslovaniePanelu();
		this.add(vp);
		
		this.setResizable(false);
		
		this.pack();
		
	}
	
	
	public static void main(String[] args) {
		new JavaGUI().setVisible(true);
		
	}
}

