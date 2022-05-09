package engine.Objects3D;

import java.awt.Color;
import java.awt.Graphics;

public class Line3D extends Object3D {

	ObjectHandler handler;
	Point3D point1;
	Point3D point2;
	float bounds = 400;

	public Line3D(Point3D point1, Point3D point2) {
		this.point1 = point1;
		this.point2 = point2;

		this.point1.addLine(this);
		this.point2.addLine(this);
		handler = new ObjectHandler();
		handler.addObject(this);
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.drawLine((int) point1.x2d, (int) point1.y2d, (int) point2.x2d, (int) point2.y2d);
	}

	public void tick() {
	}

	@Override
	public void checkInBounds() {
		
	}
}
