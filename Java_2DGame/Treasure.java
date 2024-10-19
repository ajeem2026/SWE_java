import java.awt.*;
import java.util.Random;

/*
 * This is the treausre
 * Represents a Treasure in the Game
 * 
 * @author Abid Jeem
 */

class Treasure extends GamePiece {

	private Random rand;
	private long lastMoveTime = System.currentTimeMillis();

	// Constructor for Treasure
	public Treasure(int x, int y, Graphics g) {
		super(x, y, g);
		img = Toolkit.getDefaultToolkit().getImage(imgDir + "gem.gif");
		img_width = 60;
		char_width = 54;
		rand = new Random();
	}

	@Override
	public void takeTurn(Game game) {

		// Logic to ensure takeTurn is called randomly
		// Limiting probability from 0 to 1
		float probability = rand.nextFloat();

		// Logic to ensure takeTurn is called periodically AND randomly
		long currentMoveTime = System.currentTimeMillis();

		// Checking if 5 seconds have elapse:
		if (currentMoveTime - lastMoveTime >= 5000) {
			// Assuming a 50% chance of moving
			if (probability < 0.5) {
				xcoord = (int) (Math.random() * (Game.XBOUND - img_width));
				// (Total height - Menu bar height-Treasure height)+ min_ycoord (to avoid menu
				// bar)
				ycoord = (int) (Math.random() * (Game.YBOUND - Game.YMIN_DISPLAY - img_width)) + Game.YMIN_DISPLAY;
				// Update lastMoveTime
				lastMoveTime = currentMoveTime;
			}
		}
	}

	/**
	 * Returns a clone of this Treasure object
	 */
	@Override
	public Treasure clone() throws CloneNotSupportedException {
		return (Treasure) super.clone();
	}

}
