package net.alek345.twodgame;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Display extends Canvas implements Runnable{
	private static final long serialVersionUID = 1L;
	
	static String TITLE = "2d Game";
	
	private final static int WIDTH = 800;
	private final static int HEIGHT = 600;
	
	static boolean running = false;
	
	static Thread thread;
	private static Display game;

	public static void main(String[] args){
		game = new Display();
		JFrame f = new JFrame(TITLE);
		f.setSize(WIDTH, HEIGHT);
		f.add(game);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		game.start();
	}
	
	public static void start(){
		thread = new Thread(game, "Game");
		thread.start();
	}

	@Override
	public void run() {
		while(running){
			tick();
			render();
		}
		
	}

	private void render() {
		
		
	}

	private void tick() {
		
		
	}
	
}
