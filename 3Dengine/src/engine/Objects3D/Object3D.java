package engine.Objects3D;

import java.awt.Graphics;

public abstract class Object3D {

	public float[][] center;
	public float[][] newCenter;

	public abstract void render(Graphics g);

	public abstract void tick();

	public abstract void checkInBounds();

	public void adjustCenter() {

		if (newCenter == null) {
			newCenter = this.center;
		} else if ((newCenter[0][0] != this.center[0][0]) || (newCenter[1][0] != this.center[1][0])
				|| (newCenter[2][0] != this.center[2][0])) {

			newCenter = this.center;

		}
	}
}
