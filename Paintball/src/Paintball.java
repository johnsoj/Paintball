import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Paintball extends JFrame {
// left off at 6:24 -> https://www.youtube.com/watch?v=4uWKy9MEPA0
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Player player1; 
	private Player player2;
	
	public Image image; 
	private Graphics graphics; 
	
	
	public Paintball() {
		setTitle("Paintball!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(600,400); 
		setBackground(Color.BLACK); 
		setResizable(false); 
		
		setVisible(true); 
		// x pos, y pos, height, width, health, image
		player1 = new Player(10, 150, 20, 90, 10, getImage("images/player_1.png"));
		player2 = new Player(570, 150, 20, 90, 10, getImage("images/player_2 (1).png")); 
	}
	public void paint(Graphics g) {
		
		//creating new screen image
		image = createImage(getWidth(), getHeight()); 
		graphics = image.getGraphics(); // double buffer
		
		g.fillRect(0, 0, getWidth(), getHeight());
		paintComponent(graphics);
		
		//draws everything in paintComponent()
		g.drawImage(image, 0, 0, null); 
		repaint(); 

	}
	//draw players, bullets and anything else that will go into the game.
	public void paintComponent(Graphics g) { 
		player1.draw(g);
		player2.draw(g);
	}
	
	private Image getImage(String img) {
		return Toolkit.getDefaultToolkit().getImage(img);
	}
	public Player getPlayer1() {
		return player1;
	}
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
	public Player getPlayer2() {
		return player2;
	}
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	public static void main(String[] args) {
		new Paintball(); 
	}
}
