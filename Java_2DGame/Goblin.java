import java.awt.*;

/*
 * This Goblin class chases the professor
 * Represents a Goblin in the Game
 * 
 * @author Abid Jeem
 * 
 * This is me testing out eclipse
 * This is another change
 */

class Goblin extends GamePiece {
	// Constructor for Goblin
	public Goblin(int x, int y, Graphics g) {
		super(x, y, g);
		img = Toolkit.getDefaultToolkit().getImage(imgDir + "zerg1.gif");
		img_width = 60;
		char_width = 54;
	}

	@Override
	public void takeTurn(Game game) {

		// ~10 lines of code
		Human professor = game.getHuman();

		// Get distance of prof from goblin in each axis
		int dx = professor.getXPos() - this.xcoord;
		int dy = professor.getYPos() - this.ycoord;

		// Find the distance using pythagorean relationship
		double vector_length = Math.sqrt(dx * dx + dy * dy);

		// Convert each vector into basis vector [normalization]
		// Scale it by an arbitrary velocity
		this.xcoord += dx / vector_length * 10; // x-coord+= Normalized x-coord * constant velocity
		this.ycoord += dy / vector_length * 10; // y-coord+= Normalized y-coord * constant velocity

		// When collision occurs
		// Remain stationary in prof's coordinates
		if (vector_length == 0) {
			this.xcoord = professor.getXPos();
			this.ycoord = professor.getYPos();
		}
	}

	/**
	 * 
	 */
	public void testEclipse() {
		return;
	}

	/**
	 * Returns a clone of this Goblin
	 */
	@Override
	public Goblin clone() throws CloneNotSupportedException {
		return (Goblin) super.clone();
	}

}
