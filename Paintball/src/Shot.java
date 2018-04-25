import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Shot extends GameObject {
	
	private int deltaX;
	
	public Shot(final int xPos, final int yPos, final int width, final int height, final String img) {
		// xPos = horizontal axis, yPos = vertical axis
		this.xPos = xPos; 
		this.yPos = yPos; 
		this.height = height; 
		this.width = width; 
		this.img = getImage(img);

	}
	public void draw (Graphics g) {
		g.drawImage(img, xPos, yPos, width, height, null);
	}
	@Override
	void update(final Paintball paintball, final int id) {
		// TODO Auto-generated method stub
		
	}
	public int getDeltaX() {
		return deltaX;
	}
	public void setDeltaX(int deltaX) {
		this.deltaX = deltaX;
	}
	@Override
	Image getImage(String img) {
		return Toolkit.getDefaultToolkit().getImage(img); 
		
	}
}
