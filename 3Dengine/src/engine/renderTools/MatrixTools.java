package engine.renderTools;

import engine.Objects3D.Point3D;

public class MatrixTools {
	public TransformationMatrixLib transLib = new TransformationMatrixLib();

	public float[][] matrixMult(float[][] matrix1, float[][] matrix2) {
		int colsMat1 = matrix1[0].length;
		int rowsMat1 = matrix1.length;
		int colsMat2 = matrix2[0].length;
		int rowsMat2 = matrix2.length;
		if (colsMat1 != rowsMat2) {
			System.out.println("MATRICES ARE NOT OF THE SAME ROW COLOMN COMP. COLOMNS: " + colsMat1 + " and ROWS: " + rowsMat2);
			return null;
		}
		float[][] result = new float[rowsMat1][colsMat2];
		for (int i = 0; i < rowsMat1; i++) {
			for (int j = 0; j < colsMat2; j++) {
				float sum = 0;
				for (int k = 0; k < colsMat1; k++) {
					sum += matrix1[i][k] * matrix2[k][j];
				}
				result[i][j] = sum;
			}

		}
		return result;
	}

	public void matrixToPoint3D(float[][] result, Point3D point) {
		point.vertex3D[0][0] = result[0][0];
		point.vertex3D[1][0] = result[1][0];
		if (result.length > 2) {
			point.vertex3D[2][0] = result[2][0];
		}
	}

	public float[][] point3DToMatrix(Point3D point) {
		float[][] resultFloat = { { point.vertex3D[0][0] }, { point.vertex3D[1][0] }, { point.vertex3D[2][0] } };
		return resultFloat;
	}
	
	public float[][] calculateDepth(float[][] coordMatrix) {
		
		coordMatrix[0][0] = coordMatrix[0][0]/coordMatrix[0][3];
		coordMatrix[1][0] = coordMatrix[1][0]/coordMatrix[0][3];
		coordMatrix[2][0] = coordMatrix[2][0]/coordMatrix[0][3];
		
		return coordMatrix;
	} 
}
