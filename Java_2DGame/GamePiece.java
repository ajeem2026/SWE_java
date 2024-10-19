import java.awt.*;

/**
 * The base class for GamePieces that are displayed on the game panel.
 *
 * @author Chuck C. Liang, modified by Sara Sprenkle (mostly refactoring; some
 *         simplification)
 */
abstract class GamePiece implements Cloneable {
	/** animated gif of the game piece, to be displayed on the Game board */
	protected Image img;
	/** coordinate of top-left corner of the GamePiece */
	protected int xcoord, ycoord;

	/** size of the image */
	protected int img_width; // may need to fine tune

	/** size of the character inside the image */
	protected int char_width; // may need to fine tune

	private Graphics brush;

	/**
	 * Location of the image files. When using Eclipse, use bin/. Without Eclipse
	 * structure, use ./
	 */
	protected static String imgDir = "./";

	/**
	 * Creates a GamePiece at the given x and y coordinates.
	 * 
	 * @param x the x-coordinate of the top-left corner of the game piece
	 * @param y the y-coordinate of the top-left corner of the game piece
	 * @param g the Graphics object used to draw the game piece's image
	 */
	public GamePiece(int x, int y, Graphics g) {
		xcoord = x;
		ycoord = y;
		brush = g;
	}

	// ------------------- accessor methods -------------------

	/**
	 * Returns the game piece's x coordinate
	 * 
	 * @return the x coordinate of this game piece
	 */
	public final int getXPos() {
		return xcoord;
	}

	/**
	 * Returns the game piece's y coordinate
	 * 
	 * @return the y coordinate of this game piece
	 */
	public final int getYPos() {
		return ycoord;
	}

	/**
	 * Returns the width of this game piece's image
	 * 
	 * @return the width of this game piece's image
	 */
	public final int getImageWidth() {
		return img_width;
	}

	/**
	 * Returns the width of the game piece's character (not necessarily the same as
	 * the image's width).
	 * 
	 * @return the width of the game piece's character
	 */
	public final int getCharacterWidth() {
		return char_width;
	}

	/**
	 * Draws the GamePiece on the canvas
	 */
	// Same logic for all so can be final
	public final void draw() {
		brush.drawImage(img, xcoord, ycoord, null);
	}

	/**
	 * The GamePiece takes its turn (nothing for this class)
	 * 
	 * @param game the game that contains this game piece (and others)
	 */

	// Refactored into an abstract function
	public abstract void takeTurn(Game game);

	/**
	 * Returns a clone of this GamePiece
	 */
	@Override
	public GamePiece clone() throws CloneNotSupportedException {
		return (GamePiece) super.clone();
	}

}
