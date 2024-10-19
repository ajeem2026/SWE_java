import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import javax.swing.*;

/**
 * A GUI game that involves a professor chasing treasure and goblins
 * chasing the professor.
 * 
 * @author Chuck C. Liang, modified by Sara Sprenkle (mostly refactoring; some simplification)
 */
public class Game extends JFrame implements KeyListener {
	private Graphics brush;
	private Graphics display;
	/** off-screen graphics buffer */
	private Image canvas; 

	/** the professor, who is our hero */
	private Human professor;

	/** the Goblin, who is our villain */
	private Goblin goblin;

	/** the Treasure, who is our gem */
	private Treasure treasure;

	/** width of window */
	public static final int XBOUND = 800; 
	/** the top 20 pixels (or so) are cut off by the menu bar */
	public static final int YMIN_DISPLAY = 20; 
	/** height of window */
	public static final int YBOUND = 600; 
	
	private static final Color BACKGROUND_COLOR = Color.black; 
	private static final int FDELAY = 30; // animation frame delay

	public static void main(String[] args) {
		Game game = new Game();
		game.play();
	}
	
	/**
	 * Creates the GUI, sets up the state for the game
 	 */    
	public Game() {
		super();
		
		setBounds(0, 0, XBOUND, YBOUND);
		setTitle("Abid Jeem: Professor vs Goblin");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		canvas = createImage(XBOUND, YBOUND);

		brush = canvas.getGraphics();
		brush.setColor(BACKGROUND_COLOR); // clear
		brush.fillRect(0, 0, XBOUND, YBOUND); // with black background
		
		display = this.getGraphics();

		addKeyListener(this);
		requestFocus(); // keys go to JFrame
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void paint(Graphics g) {
	    // overrides auto-update
	} 

	public void clearBuffer() {
		Color old = brush.getColor();
		brush.setColor(BACKGROUND_COLOR); // clear
		brush.fillRect(0, 0, XBOUND, YBOUND); // with black background
		brush.setColor(old); // restores color
	}

	/**
	 * 
	 * @param delay in ms
	 */
	public void nextFrame(int delay) { 
		try {
			Thread.sleep(delay);
		} catch (InterruptedException IE) {
		}
		display.drawImage(canvas, 0, 0, null); // draws to screen
		clearBuffer();
	}

	// -------- event handling: respond to key strokes -------

	/**
	 * Pressing certain keys controls direction of professor
	 */
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode(); // key pressed
		if (key == KeyEvent.VK_UP)
			professor.setDirection(0, -1); // move up
		if (key == KeyEvent.VK_DOWN)
			professor.setDirection(0, 1);
		if (key == KeyEvent.VK_LEFT)
			professor.setDirection(-1, 0);
		if (key == KeyEvent.VK_RIGHT)
			professor.setDirection(1, 0);
		if (key == KeyEvent.VK_SPACE)
			professor.setDirection(0, 0); // stop
		// else do nothing - direction remains the same
	}
	
	/**
	 * ignore released keys
	 */
	public void keyReleased(KeyEvent e) {
	    // ignore key released
	}

	/**
	 * ignore typed keys
	 */
	public void keyTyped(KeyEvent e) {
	    
	}

	// --------------------------------------------- 

	/**
	 * plays the game
	 */
	public void play() {
		boolean stop = false; // controls when loop stops

		//To declare and allocate memory for GamePiece array
		GamePiece[] pieces = new GamePiece[3];

		// Array Initialization
		professor = new Human(XBOUND - 50, YBOUND - 50, brush);
		goblin = new Goblin(0, 0, brush);
		treasure = new Treasure((int) XBOUND/2, (int) YBOUND/2, brush);
		
		pieces[0]=professor;
		pieces[1]=goblin;
		pieces[2]=treasure;
	
		// wait 1 second
		try {
			Thread.sleep(1000);
		} catch (Exception ee) {
		} 

		boolean win = false;

		while (!stop) {

			for (GamePiece piece : pieces){
				piece.takeTurn(this);
				piece.draw();
			}

			// Extra Credit: Determine win/loss
			
			nextFrame(FDELAY);

		}

		String displayStr = "You lose!";
		if (win) {
			displayStr = "You win!";
		}
		
		display.setFont(new Font("SansSerif", Font.ITALIC+Font.BOLD, 36));
		display.setColor(Color.red);
		display.drawString(displayStr, XBOUND / 2 - 100, YBOUND / 2);

	}

	/**
	 * Returns a copy of the human (the professor) in the Game
	 * @return a copy of the human (the professor) in the Game
	 */
	public Human getHuman() {
		try {
			return professor.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Returns a copy of the Goblin in the Game
	 * @return a copy of the Goblin in the Game
	 */
	public Goblin getGoblin() {
		try {
			return goblin.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Returns a copy of the Treasure in the Game
	 * @return a copy of the Treasure in the Game
	 */
	public Treasure getTreasure() {
		try {
			return treasure.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
