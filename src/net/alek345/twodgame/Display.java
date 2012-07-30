package net.alek345.twodgame;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Display extends Canvas{
	private static final long serialVersionUID = 1L;
	
	static String TITLE = "2d Game";
	
	private final static int WIDTH = 800;
	private final static int HEIGHT = 600;

	public static void main(String[] args){
		JFrame f = new JFrame(TITLE);
		f.setSize(WIDTH, HEIGHT);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
