import java.awt.Graphics;
import java.awt.Image;

public class Player extends GameObject {
	/**
	 * Create a player
	 * @param xPos   x position
	 * @param yPos   y position
	 * @param height height of player
	 * @param width  width of player 
	 * @param health health of player
	 * @param img    image of player
	 */

	public Player(final int xPos, final int yPos, final int width, final int height, final int health, final Image img) {
		// xPos = horizontal axis, yPos = vertical axis
		this.xPos = xPos; 
		this.yPos = yPos; 
		this.height = height; 
		this.width = width; 
		this.health = health;
		this.img = img; 
	}
	
	public void draw (Graphics g) {
		g.drawImage(img, xPos, yPos, width, height, null);
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		
	}
}