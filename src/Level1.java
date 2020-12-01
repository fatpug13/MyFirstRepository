
import java.util.*;

public class Level1 {

	public static boolean MisterRobot(int N, int[] data) {

		boolean result = false;
		int ctr = N - 2;
		int takenElem = N - 2;
		int[] array2 = new int[3];
		
		int couterTry = N / 3;
		do {

			for (int i = 2; i >= 0; i--) {
				if (takenElem != 0) {
					array2[i] = data[takenElem];
					takenElem--;
				}
			}
			takenElem++;
			
			performLeftShift(array2);

			for (int i = 2; i >= 0; i--) {
				if (ctr != 0) {
					data[ctr] = array2[i];
					ctr--;
				}
			}
			ctr++;

			for (int i = 0; i < data.length - 1; i++) {
				if (data[i + 1] < data[i]) {
					result = false;
					break;
				}
				result = true;
			}

			couterTry--;

		} while (couterTry != 0);

		return result;
	}

	private static void performLeftShift(int[] arr) {

		int numOftry = 0;
		boolean needIteration = false;

		do {
			int tmp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			
			arr[arr.length - 1] = tmp;

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i + 1] < arr[i]) {
					needIteration = true;
					break;
				}
				needIteration = false;
			}
			numOftry++;

		} while (needIteration != false || numOftry < 3);
	}
}
