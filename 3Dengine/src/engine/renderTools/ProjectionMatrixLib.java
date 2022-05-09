package engine.renderTools;

import engine.Objects3D.Point3D;

public class ProjectionMatrixLib {
	public float n = 15;
	public float f = 10000;
	public float end = -10000;
	public Point3D point;
	
	public ProjectionMatrixLib(Point3D point) {
		this.point = point;
	}
	public float[][] orthoMatrix = { 
			{1 ,0 ,0 ,0},
			{0 ,1 ,0 ,0},
			{0 ,0 ,1 ,0},
			{0 ,0 ,0 ,1}
			
	};
	public float[][] perspectiveMatrix = { 
			{((2*n)/((-1)-1)) ,0 ,((-1+1)/(-1-1)) ,0},
			{0 ,((2*n)/((-1)-1)) ,((-1+1)/(-1-1)) ,0},
			{0 ,0 ,-(f+n)/(f-n) ,(-2*f*n)/(f-n)},
			{0 ,0 ,-1 ,0}
			
	};
}
