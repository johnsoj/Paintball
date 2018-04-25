import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

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

	public Player(final int xPos, final int yPos, final int width, final int height, final int health, final String img) {
		// xPos = horizontal axis, yPos = vertical axis
		this.xPos = xPos; 
		this.yPos = yPos; 
		this.height = height; 
		this.width = width; 
		this.img = getImage(img);
		this.health = health;
	}
	
	public void draw (Graphics g) {
		g.drawImage(img, xPos, yPos, width, height, null);
	}

	// update() handles the player movement
	void update(final Paintball paintball, final int id) {
		if(id == 1) {
			if(paintball.player1_up) {
				if(!(yPos < 26)) { // 26 accounts for margin at top of window
					yPos--; 
				}
			} else if (paintball.player1_down) {
				if(!(yPos > paintball.getHeight() - 96)) { // TODO:verify these margins are ok
					yPos++; 
				}
			}
		} 
//		else if (id == 2) {
//			if(paintball.player2_up) {
//				if(!(yPos < 26)) {
//					yPos--;
//				}
//			} else if(paintball.player2_down) {
//				if(!(yPos > paintball.getHeight() - 96)) {
//					yPos++;
//				}
//			}
//		}
	}

	@Override
	Image getImage(String img) {
		return Toolkit.getDefaultToolkit().getImage(img); 
		
	}

}