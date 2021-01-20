
import java.util.*;

public class Level1 {

	public static void MatrixTurn(String Matrix[], int M, int N, int T) {
		
		
		int [][] originalMatrix = new int[M][N];
		int[][] rotatedMatrix = new int[M][N];
		
		for (var i = 0; i < originalMatrix.length; i++) {
			for (var j = 0; j < originalMatrix[i].length; j++) {
				originalMatrix[i][j] = Character.getNumericValue(Matrix[i].charAt(j));
			}
		}

		turnArray(originalMatrix, rotatedMatrix, M, N, T);

		String str = "";		
		for (var i = 0; i < originalMatrix.length; i++) {
			for (var j = 0; j < originalMatrix[i].length; j++) {			
				str += Integer.toString(originalMatrix[i][j]);
			}
			Matrix[i] = str;
			str = "";
		}

	}
	
	private static void turnArray(int[][] originalMatrix, int[][] rotatedMatrix, int M, int N, int T) {

		do {

			for (int k = 0; k < M / 2; k++) { 
				for (int j = k; j < N - 1 - k; j++) { 

					int top = originalMatrix[k][j];
					if (rotatedMatrix[k][j] == 0) {
						rotatedMatrix[k][j] = originalMatrix[k + 1][j];
					}
					if (rotatedMatrix[k][j + 1] == 0) {
						rotatedMatrix[k][j + 1] = top;
					}

					if (M % 2 == 0) {

						if (j < M / 2) {
							
							int right = originalMatrix[j][N - 1 - k];
							if (rotatedMatrix[j][N - 1 - k] == 0) {
								rotatedMatrix[j][N - 1 - k] = originalMatrix[j][N - 2 - k];
							}
							if (j + 1 < M) {
								rotatedMatrix[j + 1][N - 1 - k] = right;
							}
						}

					} else {
						
						if (j <= M / 2) {
							
							int right = originalMatrix[j][N - 1 - k];
							if (rotatedMatrix[j][N - 1 - k] == 0) {
								rotatedMatrix[j][N - 1 - k] = originalMatrix[j][N - 2 - k];
							}
							if (j + 1 < M) {
								rotatedMatrix[j + 1][N - 1 - k] = right;
							}
						}
					}

					int bottom = originalMatrix[M - 1 - k][N - 1 - j];
					if (rotatedMatrix[M - 1 - k][N - 1 - j] == 0) {
						rotatedMatrix[M - 1 - k][N - 1 - j] = originalMatrix[M - 2 - k][N - 1 - j];
					}
					if (rotatedMatrix[M - 1 - k][N - 2 - j] == 0) {
						rotatedMatrix[M - 1 - k][N - 2 - j] = bottom;
					}

					if (M % 2 == 0) {

						if (j < M / 2) {
							
							int left = originalMatrix[M - 1 - j][k];
							if (rotatedMatrix[M - 1 - j][k] == 0) {
								rotatedMatrix[M - 1 - j][k] = originalMatrix[M - 1 - k][j + 1];
							}
							if (j < M) {
								rotatedMatrix[M - 2 - j][k] = left;
							}
						}
					} else {
						
						if (j <= M / 2) {
							int left = originalMatrix[M - 1 - j][k];
							if (rotatedMatrix[M - 1 - j][k] == 0) {
								rotatedMatrix[M - 1 - j][k] = originalMatrix[M - 1 - k][j + 1];
							}
							if (j < M) {
								rotatedMatrix[M - 2 - j][k] = left;
							}
						}	
					}					
				}
			}

			for (var i = 0; i < originalMatrix.length; i++) {
				for (var j = 0; j < originalMatrix[i].length; j++) {
					
					if (M / 2 == 1) {

						if (rotatedMatrix[i][j] != 0) {
							originalMatrix[i][j] = rotatedMatrix[i][j];
							rotatedMatrix[i][j] = 0;
						}
						
					} else {
						originalMatrix[i][j] = rotatedMatrix[i][j];
						rotatedMatrix[i][j] = 0;
					}					
				}
			}

			T--;

		} while (T > 0);
		
	}

}
