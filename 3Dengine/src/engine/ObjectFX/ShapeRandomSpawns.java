package engine.ObjectFX;

import java.util.Random;

import engine.Objects3D.Shapes3D;
import engine.main.Window;

public class ShapeRandomSpawns {
	
	
	Shapes3D shapes = new Shapes3D();

	boolean Working = false;

	public void tick() {
		if (!Working) {
			Working = true;
			float rad = 30;
			int Z = new Random().nextInt(100)+1;
			int randomX = (int) (0.5* Window.WIDTH) - (new Random().nextInt(Window.WIDTH)) ;
			int randomY = Window.HEIGHT + 10;
			int randomZ = new Random().nextInt(1100);
			
			float angle = (float) ((new Random().nextInt(30) / 1000) + 0.01);
			float[][] center = { {randomX}, {randomY}, {randomZ} };

			float angleran = new Random().nextInt(2);
			if (angleran == 1) {

				angle = -angle;

			}

			shapes.circle(rad, Z, center, angle, 5);
			Working = false;
		}
	}
	
	public void circleSpawn() {
		
		float[][] center= {{0},{0},{0},{0}};

		shapes.circle(30, 0, center, 0.001f, 3);
		
	}
}
