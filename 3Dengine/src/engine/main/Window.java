package engine.main;

import java.awt.Canvas; //                                                                            |
//                                                                                                    | HOW TO MAKE SHAPES APPEAR:
import java.awt.Color;  //                                                                            | -in openWorld() will be your area of creating all the shapes
import java.awt.Graphics;//                                                                           | -static shape class has alot of funtions to create alot of shapes
import java.awt.image.BufferStrategy;//                                                               | -each shape has their own arguments. try em out
import java.util.Random;//                                                                            | - you can disable specific rotations in the XX class by commenting
//                                                                                                    |   out certain lines where it rotates the shapes in functions:
import javax.swing.JFrame;//                                                                          |    * XX
//                                                                                                    |    * XX
import engine.ObjectFX.ShapeRandomSpawns;//                                                           | - have fun :=)
import engine.Objects3D.ObjectHandler;//                                                              |
import engine.Objects3D.Shapes3D;//                                                                   |
//                                                                                                    |
public class Window extends Canvas implements Runnable {//                                            |
//                                                                                                    |
	private static final float TIME_SPEED = 1f;//                                                 |
	private static final long serialVersionUID = -1660049387310505671L;//                         |
	public static final int WIDTH = 1900;//                                                       |
	public static final int HEIGHT = WIDTH / 10 * 6; // 1140//                                    |
	private Thread gameThread;//                                                                  |
	private boolean running = false;//                                                            |
	public JFrame jFrame;//                                                                       |
	public String title = "3D engine";//                                                          |
	public ObjectHandler handler = new ObjectHandler();//                                         |
	public static Shapes3D shape = new Shapes3D();
	public ShapeRandomSpawns shapesRandom = new ShapeRandomSpawns();
	boolean ticking = false;

	public Window() {
		display display = new display(WIDTH, HEIGHT, title, this);
		this.jFrame = display.returnJFrame();
	}

	public static void main(String[] args) {
		new Window();
		openWorld();
	}

	private static void openWorld() {
		float z = 0f;
		float angle = 0.005f;
		for (int x = 1; x < 150; x++) {
			float[][] center = {{0},{-100},{z},{1}};
			shape.cube(size, center, angle);
			z = z - 50;
			angle = angle + 0.005f;
		}
	}

	public synchronized void start() {
		gameThread = new Thread(this);
		running = true;
		gameThread.start();
	}

	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0 * TIME_SPEED;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			++frames;
			while (delta >= 1) {
				tick();
				delta--;
			}
			if (running)
				render();
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				jFrame.setTitle(title + " - FPS : " + frames);
				frames = 0;
			}
		}

	}

	public void tick() {
		if (!ticking) {
			ticking = true;
			handler.tick();
			if (new Random().nextInt(1000) <= 40) {
				//shapesRandom.circleSpawn();
			}
			ticking = false;
		}
		//shape.TickCircile();
	}

	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g = bs.getDrawGraphics();
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		handler.render(g);
		g.dispose();
		bs.show();

	}

}
