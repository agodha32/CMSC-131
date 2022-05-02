import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ShapePanel extends JPanel {

	private DrawableThing[] thingsToDraw;  // collection of things to be drawn
	
	private static int NUMBER_OF_THINGS = 100;
	private static int PANEL_WIDTH = 1000;
	private static int PANEL_HEIGHT = 500;
	
	private static Random random = new Random();
	
	/* Constructor will initialize the collection of "Drawable Things" */
	public ShapePanel() {
		
		thingsToDraw = new DrawableThing[NUMBER_OF_THINGS];
		
		for (int i = 0; i < NUMBER_OF_THINGS; i++) {
			
			// Decide what kind of thing to instantiate
			int choice = random.nextInt(3);
			if (choice == 1) {
				thingsToDraw[i] = new Square();
			} else if (choice == 2) {
				thingsToDraw[i] = new Circle();
			} else if (choice == 3) {
				thingsToDraw[i] = new Plus();
			} else if (choice == 4) {
				thingsToDraw[i] = new Triangle();
			} else {
				thingsToDraw[i] = new Text("Hi there!!!");
			}
			
			/* Set random size and location */
			thingsToDraw[i].setSize(random.nextInt(40) + 10);  // 10 to 49
			thingsToDraw[i].setX(random.nextInt(PANEL_WIDTH));
			thingsToDraw[i].setY(random.nextInt(PANEL_HEIGHT));
		}
	}
	
	/* This is the method that gets called whenever it is time to 
	 * draw the content of a panel. This is part of Java GUI 
	 * programming.  If you're doing any customized graphics, you 
	 * will be Overriding the "paint" method.  
	 * 
	 * This implementation of paint goes through the array
	 * of "drawable things", drawing each one, and then randomly
	 * moving it a bit.
	 */
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		for (int i = 0; i < thingsToDraw.length; i++) {
			thingsToDraw[i].drawSelf(g);
			int deltaX = random.nextInt(11) - 5;   // -5 to +5
			int deltaY = random.nextInt(11) - 5;   // -5 to +5
			thingsToDraw[i].setX(thingsToDraw[i].getX() + deltaX);
			thingsToDraw[i].setY(thingsToDraw[i].getY() + deltaY);
		}
	}
	
	
	public static void main(String[] args) {
		ShapePanel panel = new ShapePanel();
		
		/* This is a request for the "Event Dispatching Thread" to 
		 * display our panel.
		 * 
		 * The syntax you see below will probably confuse you.  It's an 
		 * example of an "anonymous inner class".  You'll learn about this
		 * in CMSC 132.
		 */
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {		
				displayPanel(panel);
			}
		});	
	}
	
	private static void displayPanel(ShapePanel panel) {
		
		/* A JFrame is a window.  We'll make one now.*/
		JFrame frame = new JFrame();
		frame.setContentPane(panel);  // Sets the panel inside the frame
		frame.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		/* This timer will repaint the panel every 10 milliseconds.
		 * This is an example of an anonymous inner class, which you'll
		 * learn about in CMSC 132. */
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				frame.repaint();
			}
		}, 0, 10);		
	}

	private static final long serialVersionUID = 1L;

}
