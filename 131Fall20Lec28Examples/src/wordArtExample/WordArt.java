package wordArtExample;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;

public class WordArt {

	public static void doWordArt(WordStream stream, long delayBetweenWordsMS) throws InterruptedException {
		createGUI();
		while (stream.hasAnotherWord()) {
			String word = stream.getWord();
			showWord(word);
			Thread.sleep(delayBetweenWordsMS);
		}
		killGUI();
	}


	
	
	
	
	
	
	/* OK, you should probably stop reading now.
	 * The rest of this class contains a lot of stuff
	 * you won't see until CMSC 132.
	 * 
	 * Continue at your own risk!  :-)
	 */
	
	
	private static WordArtPanel panel;
	private static ArrayList<WordData> wordList;
	protected static final long serialVersionUID = 0L;
	private static JFrame frame;
	private static final int PANEL_WIDTH = 800;
	private static final int PANEL_HEIGHT = 400;
	private static Random random = new Random();

	private static void createGUI() {
		panel = new WordArtPanel();
		panel.createGUI();
		wordList = new ArrayList<WordData>();
	}
	
	private static void killGUI() {
		panel.killGUI();
	}

	private static void showWord(String wordToAdd) {
		
		int randomX;
		try {
			randomX = random.nextInt(PANEL_WIDTH - 12 * wordToAdd.length() - 80) + 40;
		} catch(IllegalArgumentException e) {
			return;  // word is just too long -- forget it
		}
		int randomY = random.nextInt(PANEL_HEIGHT - 80) + 40;
		Color c = getRandomColor();
		WordData word = new WordData(wordToAdd, randomX, randomY, c);
		wordList.add(word);
		panel.repaint();
	}

	private static Color getRandomColor() {
		int red = random.nextInt(200) + 50;
		int green = random.nextInt(200) + 50;
		int blue = random.nextInt(200) + 50;
		return new Color(red, green, blue);
	}

	
	/* Nested class representing the "content panel" of
	 * the GUI
	 */
	private static class WordArtPanel extends JPanel {
		
		private static final long serialVersionUID = 1L;

		private void createGUI() {
			setBackground(Color.BLACK);
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
					createAndShowFrame();
				}
			});	
		}

		private void createAndShowFrame() {
			frame = new JFrame("Word Art");
			setSize(PANEL_WIDTH, PANEL_HEIGHT);
			frame.setContentPane(this);
			frame.pack();
			frame.setVisible(true);
			frame.toFront();
			frame.setAlwaysOnTop(true);
		}

		public void killGUI() {
			if (frame != null) {
				frame.dispose();
			}
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
		}

		public void paint(Graphics g) {
			super.paint(g);
			g.setFont(new Font("Arial", 18, 18));
			for (int i = 0; i < WordArt.wordList.size(); i++) {
				WordData w = wordList.get(i);
				g.setColor(w.color);
				g.drawString(w.word, w.x, w.y);
			}
		}
	}
	
	
	/* Nested class used to keep track of the state of
	 * each word that gets displayed
	 */
	private static class WordData {
		public String word;
		public int x;
		public int y;
		public Color color;

		public WordData(String w, int x, int y, Color c) {
			word = w;
			this.x = x;
			this.y = y;
			color = c;
		}
	}

}