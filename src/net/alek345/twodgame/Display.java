package net.alek345.twodgame;

public class Display{
	
	static String TITLE = "2d Game";

	public static void main(String[] args){
		JFrame f = new JFrame(TITLE);
		f.setSize(800, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
