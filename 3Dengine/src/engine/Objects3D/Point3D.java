package engine.Objects3D;

import java.awt.Graphics;
import java.util.ArrayList;

import engine.main.Window;
import engine.renderTools.MatrixTools;
import engine.renderTools.ProjectionMatrixLib;
import engine.renderTools.TransformationMatrixLib;

public class Point3D extends Object3D {

	private ObjectHandler handler = new ObjectHandler();
	private MatrixTools matrixTools = new MatrixTools();
	private TransformationMatrixLib TransMatrixLib = new TransformationMatrixLib();
	public float[][] vertex3D = {{0},{0},{0},{1}};
	private ProjectionMatrixLib projectionLib = new ProjectionMatrixLib(this);
	public float x2d;
	public float y2d;
	public float rotationAngle;
	float boundsX = Window.WIDTH + 300;
	float boundsY = Window.HEIGHT + 300;
	float boundsZ = 10000;
	float[][] projected3D = {{0},{0},{0},{1}};
	public float[][] rotatedCoords= {{0},{0},{0},{1}};
	ArrayList<Line3D> lines = new ArrayList<Line3D>();

	public Point3D(float x, float y, float z, float[][] center, float rotationAngle) {
		this.center = center;
		this.vertex3D[0][0] = x;
		this.vertex3D[1][0] = y;
		this.vertex3D[2][0] = z;
		this.vertex3D[3][0] = 1;
		this.rotationAngle = rotationAngle;
		handler.addObject(this);

	}

	public void tick() {

		adjustCenter();
		
		setCoordsToCenter();

		countRotation();
		//vertex3D = matrixTools.matrixMult(TransMatrixLib.rotationZ(rotationAngle), vertex3D);   //THESE VERTEX LINES DECIDE IN WHICH WAYS WILL THE SHAPES BE 
		//vertex3D = matrixTools.matrixMult(TransMatrixLib.rotationX(rotationAngle), vertex3D);   // ROTATED AROUND THE ORIGIN POINT
		//vertex3D = matrixTools.matrixMult(TransMatrixLib.rotationY(rotationAngle), vertex3D);
		rotatedCoords[0][0] = vertex3D[0][0]+this.center[0][0];
		rotatedCoords[1][0] = vertex3D[1][0]+this.center[1][0];
		rotatedCoords[2][0] = vertex3D[2][0]+this.center[2][0] -400;
		
		projected3D = matrixTools.matrixMult(projectionLib.perspectiveMatrix, rotatedCoords);

		checkInBounds();

	}

	private void setCoordsToCenter() {

		
	}
	
	
	public void render(Graphics g) {
		
		
		x2d = Origin3DPoint.moveX(100*projected3D[0][0]/(projected3D[3][0]));
		y2d = Origin3DPoint.moveY(100*projected3D[1][0]/(projected3D[3][0]));

		//g.setColor(Color.cyan);
		//g.fillOval((int) x2d-5, (int) y2d-5, 10, 10);
	}


	public void countRotation() {

		//this.center = matrixTools.matrixMult(TransMatrixLib.rotationX(rotationAngle),this.center); //THESE CENTER LINES DECIDE IN WHICH WAYS WILL THE SHAPES BE
		this.center = matrixTools.matrixMult(TransMatrixLib.rotationZ(rotationAngle),this.center); // ROTATED AROUND THEMSELVES
		//this.center = matrixTools.matrixMult(TransMatrixLib.rotationY(rotationAngle),this.center);

	}

	public void checkInBounds() {

		if (center[0][0] >= boundsX || center[0][0] <= -boundsX) {

			this.Delete();
			System.out.println("X is out of bounds : " + center[0]);
		}
		if (center[1][0] >= boundsY || center[1][0] <= -boundsY) {

			this.Delete();
			System.out.println("Y is out of bounds : " + center[1]);

		}
		if (center[2][0] >= boundsZ || center[2][0] <= -boundsZ) {

			this.Delete();
			System.out.println("Z is out of bounds : " + center[2]);
		}

	}

	public void Delete() {
		handler.remObject(this);
		for (int i = 0; i < lines.size(); i++) {
			Object3D line = lines.get(i);
			handler.remObject(line);

		}
	}

	public void addLine(Line3D line) {

		this.lines.add(line);

	}
}
