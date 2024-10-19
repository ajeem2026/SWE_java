
import java.awt.*;

/**
 * Represents a Human in the Game
 *
 * @author Chuck C. Liang, modified by Sara Sprenkle (mostly refactoring; some
 *         simplification)
 */
class Human extends GamePiece {

	/** the distance, in pixels, to move in the x direction on each step */
	private int dx;
	/** the distance, in pixels, to move in the y direction on each step */
	private int dy;
	/** the default amount to move each step, in pixels */
	private static final int STEP = 4;

	/**
	 * Creates the Human at the given x and y coordinates.
	 * 
	 * @param x the x-coordinate of the top-left corner of the Human
	 * @param y the y-coordinate of the top-left corner of the Human
	 * @param g the Graphics object used to draw the Human's image
	 */
	public Human(int x, int y, Graphics g) {
		super(x, y, g);
		img = Toolkit.getDefaultToolkit().getImage(imgDir + "running_dude.gif");
		img_width = 30;
		char_width = 26;
	}

	/**
	 * Human takes turn, moving based on its current direction
	 */
	@Override
	public void takeTurn(Game game) {
		// will wrap around edges of window
		// For horizontal movement
		xcoord = xcoord + dx; // xcoord: current horizontal pos.; dx= velocity in x-axis

		// If x-coord is negative ==> we're out of left edge of game window
		if (xcoord < 0) {
			// Wraps to the far right
			// Game.XBOUND: maximum x-coordinate (rightmost edge of game window)
			xcoord = Game.XBOUND - img_width;
		}

		// Checks if prof has moved past right edge of the window
		if (xcoord > Game.XBOUND - img_width) {
			// Then it wraps around to the left (refer to diagram)
			xcoord = 0;
		}

		// Same principle for vertical movement
		// However, in this case, YMIN_DISPLAY = min visible y-coord
		ycoord = ycoord + dy;

		// If prof goes beyond upper bound
		if (ycoord < Game.YMIN_DISPLAY) {
			// Wrap prof to the bottom
			ycoord = Game.YBOUND - img_width;
		}

		// If prog goes under lower bound
		if (ycoord > Game.YBOUND - img_width) {
			// Wrap prof back to the top
			ycoord = Game.YMIN_DISPLAY;
		}
	}

	/**
	 * Returns this Human's change in the x direction, in pixels
	 * 
	 * @return the change in x, in pixels
	 */
	public int getChangeInX() {
		return dx;
	}

	/**
	 * Returns this Human's change in the y direction, in pixels
	 * 
	 * @return the change in y, in pixels
	 */
	public int getChangeInY() {
		return dy;
	}

	/**
	 * Sets which direction Human should go
	 * 
	 * @param horizontalDirection -1 means left, 1 means right, 0 means no
	 *                            horizontal movement
	 * @param verticalDirection   -1 means up, 1 means down, 0 means no vertical
	 *                            movement
	 */
	public void setDirection(int horizontalDirection, int verticalDirection) {
		dx = horizontalDirection * STEP;
		dy = verticalDirection * STEP;
	}

	/**
	 * Returns a clone of this Human
	 */
	@Override
	public Human clone() throws CloneNotSupportedException {
		return (Human) super.clone();
	}

}
