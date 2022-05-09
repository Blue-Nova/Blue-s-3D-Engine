package engine.Objects3D;

import engine.main.Window;

public class Origin3DPoint {
	public static final float[][] origin = { { Window.WIDTH / 2 }, { Window.HEIGHT / 2 }, { 0 } };
	
	public static float moveX(float x) {
		
		x =(x + (Window.WIDTH/2));
	return x;
	}
	public static float moveY(float y) {
		
		y =((y + (Window.HEIGHT/2))+(2*(-y)));  
	return y;
	}
}
