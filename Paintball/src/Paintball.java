import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Paintball extends JFrame implements KeyListener {
// left off at  -> https://www.youtube.com/watch?v=Cf2xRl8047s
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Player player1; 
	private Player player2;
	
	public Image image; 
	private Graphics graphics; 
 
	boolean player1_up = false; // Keypress mapped to VK_W
	boolean player1_down = false; // Keypress mapped to VK_S
	 
	boolean player2_up = false; 
	boolean player2_down = false; 
	
	public Paintball() {
		setTitle("Paintball!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(600,400); 
		setBackground(Color.WHITE); 
		setResizable(false); 
		addKeyListener(this);
		setVisible(true); 
		// x pos, y pos, height, width, health, image
		player1 = new Player(10, 150, 20, 90, 10, "images/player_1.png");
		player2 = new Player(570, 150, 20, 90, 10, "images/player_2 (1).png"); 
	}
	public void paint(Graphics g) {
		
		//creating new screen image
		image = createImage(getWidth(), getHeight()); 
		graphics = image.getGraphics(); // double buffer
		
//		g.fillRect(0, 0, getWidth(), getHeight()); - what is this why
		paintComponent(graphics);
		
		//draws everything in paintComponent()
		g.drawImage(image, 0, 0, null); 
		repaint(); 

	}
	//draw players, bullets and anything else that will go into the game.
	public void paintComponent(Graphics g) { 
		player1.draw(g);
		player1.update(this, 1);
		
		player2.draw(g);
		player2.update(this, 2);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		 if(e.getKeyCode() == KeyEvent.VK_W); {
			player1_up= true; 
		} if(e.getKeyCode() == KeyEvent.VK_S); {
			player1_down= true; }
//		} if(e.getKeyCode() == KeyEvent.VK_UP); {
//			player2_up= true; 
//		} if(e.getKeyCode() == KeyEvent.VK_DOWN); {
//			player2_down= true; 
//		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		 if(e.getKeyCode() == KeyEvent.VK_W); {
			player1_up= false; 
		} if(e.getKeyCode() == KeyEvent.VK_S); {
			player1_down= false; }
//		} if(e.getKeyCode() == KeyEvent.VK_UP); {
//			player2_up= false; 
//		} if(e.getKeyCode() == KeyEvent.VK_DOWN); {
//			player2_down= false; 
//		}		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		;		
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
