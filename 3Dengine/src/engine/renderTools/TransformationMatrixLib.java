package engine.renderTools;

public class TransformationMatrixLib {
	public float[][] rotationZ(float angle){
		
		float [][] rotationZ=
			{ { (float) Math.cos(angle), (float) -Math.sin(angle), 0 ,0},
			{ (float) Math.sin(angle), (float) Math.cos(angle), 0 ,0}, 
			{ 0, 0, 1 ,0},
			{0,0,0,1}};
			
			
		return rotationZ;
			
	}
	public float[][] rotationX(float angle){
		
		float [][] rotationX =
			{ { 1, 0, 0 ,0}, 
			{ 0, (float) Math.cos(angle), (float) -Math.sin(angle),0 },
			{ 0, (float) Math.sin(angle), (float) Math.cos(angle) ,0},
			{0,0,0,1}};
		
		return rotationX;
			
	}
	public float[][] rotationY(float angle){
		
		float [][] rotationY =
			{ { (float) Math.cos(angle), 0, (float) -Math.sin(angle),0 }, 
			{ 0, 1, 0 ,0},
			{ (float) Math.sin(angle), 0, (float) Math.cos(angle) ,0},
			{0,0,0,1}};
		return rotationY;
			
	}
}
