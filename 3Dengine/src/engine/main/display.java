package engine.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class display extends Canvas {

	private static final long serialVersionUID = -5928052939474515288L;
	public JFrame frame;

	public display(int width, int height, String Title, Window game) {
		frame = new JFrame(Title);
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}

	public JFrame returnJFrame() {
		return this.frame;
	}
}
