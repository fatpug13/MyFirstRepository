
import java.util.*;

public class Level1 {

public static String Keymaker(int k) {
		

		String result = "";
		int[] arr = new int[k];

		for(int i = 0; i < k; i++) {
			arr[i] = 0;
		}

		int N = 1;
		
		do {
			if (N == 1) {

				for (int i = 0; i < arr.length; i++) {
					arr[i] = 1;
				}

				N++;
			} else if (N == 2) {

				for (int i = 1; i < arr.length;) {
					arr[i] = 0;
					i += 2;
				}

				N++;
			} else {

				for (int i = N - 1; i < arr.length;) {
					
					if (arr[i] == 0) {
						arr[i] = 1;
					}else {
						arr[i] = 0;
					}
					i += N;
				}
				N++;
			}
		} while (N <= arr.length);

		for(int i = 0; i < arr.length; i++) {
			result += Integer.toString(arr[i]);
		}
		
		return result;
	}

}

