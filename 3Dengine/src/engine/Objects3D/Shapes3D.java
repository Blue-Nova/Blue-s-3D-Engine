package engine.Objects3D;


public class Shapes3D {
	
	
	public float X;
	public float Y;
	public float inc = 0;
	public float[] center = {0f,0f,0f};
	
	@SuppressWarnings("unused")
	public void cube(float size, float[][] center, float angle) {
		

		float[][] thisCenter = center;
			
		Point3D point1 = new Point3D(-(size), -(size), -(size), thisCenter, angle);// BDL -> FDL BUL BDR
		Point3D point2 = new Point3D(-(size), -(size), (size), thisCenter, angle);// FDL -> BDL FUL FDR
		Point3D point3 = new Point3D((size), -(size), (size), thisCenter, angle);// FDR -> BDR FUR FDL
		Point3D point4 = new Point3D((size), (size), (size), thisCenter, angle);// FUR -> BUR FDR FUL
		Point3D point5 = new Point3D(-(size), (size), (size), thisCenter, angle);// FUL -> BUL FDL FUR
		Point3D point6 = new Point3D((size), (size), -(size), thisCenter, angle);// BUR -> FUR BDR BUL
		Point3D point7 = new Point3D(-(size), (size), -(size), thisCenter, angle);// BUL -> FUL BDL BUR
		Point3D point8 = new Point3D((size), -(size), -(size), thisCenter, angle);// BDR -> FDR BUR BDL
		Line3D line1 = new Line3D(point1, point2);
		Line3D line2 = new Line3D(point1, point7);
		Line3D line3 = new Line3D(point1, point8);
		Line3D line4 = new Line3D(point2, point5);
		Line3D line5 = new Line3D(point2, point3);
		Line3D line6 = new Line3D(point3, point8);
		Line3D line7 = new Line3D(point3, point4);
		Line3D line8 = new Line3D(point4, point6);
		Line3D line9 = new Line3D(point4, point5);
		Line3D line10 = new Line3D(point5, point7);
		Line3D line11 = new Line3D(point6, point8);
		Line3D line12 = new Line3D(point6, point7);
	}

	@SuppressWarnings("unused")
	public void rectangle(float sizex, float sizey, float sizez, float[][] center, float angle) {
		float[][] thisCenter = center;
		
		
		Point3D point1 = new Point3D(-(sizex), -(sizey), -(sizez), thisCenter, angle);// BDL -> FDL BUL BDR
		Point3D point2 = new Point3D(-(sizex), -(sizey), (sizez), thisCenter, angle);// FDL -> BDL FUL FDR
		Point3D point3 = new Point3D((sizex), -(sizey), (sizez), thisCenter, angle);// FDR -> BDR FUR FDL
		Point3D point4 = new Point3D((sizex), (sizey), (sizez), thisCenter, angle);// FUR -> BUR FDR FUL
		Point3D point5 = new Point3D(-(sizex), (sizey), (sizez), thisCenter, angle);// FUL -> BUL FDL FUR
		Point3D point6 = new Point3D((sizex), (sizey), -(sizez), thisCenter, angle);// BUR -> FUR BDR BUL
		Point3D point7 = new Point3D(-(sizex), (sizey), -(sizez), thisCenter, angle);// BUL -> FUL BDL BUR
		Point3D point8 = new Point3D((sizex), -(sizey), -(sizez), thisCenter, angle);// BDR -> FDR BUR BDL
		Line3D line1 = new Line3D(point1, point2);
		Line3D line2 = new Line3D(point1, point7);
		Line3D line3 = new Line3D(point1, point8);
		Line3D line4 = new Line3D(point2, point5);
		Line3D line5 = new Line3D(point2, point3);
		Line3D line6 = new Line3D(point3, point8);
		Line3D line7 = new Line3D(point3, point4);
		Line3D line8 = new Line3D(point4, point6);
		Line3D line9 = new Line3D(point4, point5);
		Line3D line10 = new Line3D(point5, point7);
		Line3D line11 = new Line3D(point6, point8);
		Line3D line12 = new Line3D(point6, point7);
	}
	
	@SuppressWarnings("unused")
	public void arrow(float scaleX, float scaleY, float scaleZ, float[][] center, float angle) {
		
		Point3D point = new Point3D(0*scaleX,10*scaleY,5*scaleZ,center,angle);
		Point3D point1 = new Point3D(0*scaleX,10*scaleY,-5*scaleZ,center,angle);
		Point3D point2 = new Point3D(-8*scaleX,0*scaleY,5*scaleZ,center,angle);
		Point3D point3 = new Point3D(-8*scaleX,0*scaleY,-5*scaleZ,center,angle);
		Point3D point4 = new Point3D(8*scaleX,0*scaleY,5*scaleZ,center,angle);
		Point3D point5 = new Point3D(8*scaleX,0*scaleY,-5*scaleZ,center,angle);
		Point3D point6 = new Point3D(-5*scaleX,-1*scaleY,5*scaleZ,center,angle);
		Point3D point7 = new Point3D(-5*scaleX,-1*scaleY,-5*scaleZ,center,angle);
		Point3D point8 = new Point3D(5*scaleX,-1*scaleY,5*scaleZ,center,angle);
		Point3D point9 = new Point3D(5*scaleX,-1*scaleY,-5*scaleZ,center,angle);
		
		Point3D point10 = new Point3D(-3*scaleX,1*scaleY,5*scaleZ,center,angle);
		Point3D point11 = new Point3D(-3*scaleX,1*scaleY,-5*scaleZ,center,angle);
		Point3D point12 = new Point3D(3*scaleX,1*scaleY,5*scaleZ,center,angle);
		Point3D point13 = new Point3D(3*scaleX,1*scaleY,-5*scaleZ,center,angle);
		
		Point3D point14 = new Point3D(-3*scaleX,-12*scaleY,5*scaleZ,center,angle);
		Point3D point15 = new Point3D(-3*scaleX,-12*scaleY,-5*scaleZ,center,angle);
		Point3D point16 = new Point3D(3*scaleX,-12*scaleY,5*scaleZ,center,angle);
		Point3D point17 = new Point3D(3*scaleX,-12*scaleY,-5*scaleZ,center,angle);
		
		Line3D line = new Line3D(point,point1);
		Line3D line1 = new Line3D(point,point2);
		Line3D line2 = new Line3D(point2,point3);
		Line3D line3 = new Line3D(point1,point3);
		Line3D line4 = new Line3D(point,point4);
		Line3D line5 = new Line3D(point1,point5);
		Line3D line6 = new Line3D(point4,point5);
		Line3D line7 = new Line3D(point6,point2);
		Line3D line8 = new Line3D(point7,point3);
		Line3D line9 = new Line3D(point8,point4);
		Line3D line10 = new Line3D(point9,point5);
		Line3D line11 = new Line3D(point6,point7);
		Line3D line12 = new Line3D(point8,point9);
		
		Line3D line13 = new Line3D(point6,point10);
		Line3D line14 = new Line3D(point7,point11);
		Line3D line15 = new Line3D(point8,point12);
		Line3D line16 = new Line3D(point9,point13);
		Line3D line17 = new Line3D(point10,point11);
		Line3D line18 = new Line3D(point12,point13);

		Line3D line19 = new Line3D(point10,point14);
		Line3D line20 = new Line3D(point11,point15);
		Line3D line21 = new Line3D(point12,point16);
		Line3D line22 = new Line3D(point13,point17);
		
		Line3D line23 = new Line3D(point14,point15);
		Line3D line24 = new Line3D(point16,point17);
		Line3D line25 = new Line3D(point14,point16);
		Line3D line26 = new Line3D(point15,point17);


		
	}
	@SuppressWarnings("unused")
	public void circle(float rad,float Z,float[][] center, float angle, int pointNo) {
		
		float fullCirc= 6.3f;
		
		
		
		Point3D startPoint = new Point3D((float)Math.cos(0)*rad,(float)Math.sin(0)*rad,Z,center,angle);
		Point3D newPoint = null;
		Point3D prevPoint = startPoint;
		for (float i= 0; i< fullCirc; i+=(fullCirc/(pointNo*10))) {
			float X = (float)((Math.cos(i))*rad);
			float Y = (float)((Math.sin(i))*rad);
			newPoint = new Point3D(X,Y,Z,center,angle);
			
			Line3D line = new Line3D(newPoint,prevPoint);
			
			prevPoint = newPoint;
		}
		
		Line3D lineEnd = new Line3D(newPoint,startPoint);
	}
	
}
