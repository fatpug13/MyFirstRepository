
import java.util.*;

public class Level1 {

	public static String BigMinus(String s1, String s2) {

		var result = "";
		int k = 0;
		int[] arr1;
		int[] arr2;

		if (s1.length() > s2.length()) {

			int lenArr = s1.length() + 1;
			arr1 = new int[lenArr];
			arr2 = new int[lenArr];

			fillArrays(arr1, arr2, s1, s2);

		} else {

			int lenArr = s2.length() + 1;
			arr1 = new int[lenArr];
			arr2 = new int[lenArr];

			fillArrays(arr1, arr2, s2, s1);
		}

		for (int i = 1; i < arr1[0]; i++) {
			k = k + arr1[i] - arr2[i] + 10;
			arr1[i] = k % 10;
			if (k < 10) {
				k = -1;
			} else {
				k = 0;
			}
		}
		while (arr1[arr1[0]] == 0 && arr1[0] > 1) {
			arr1[0] = arr1[0] - 1;
		}

		result = "";
		for (int i = arr1.length - 1; i > 0; i--) {

			result += arr1[i];
		}

		return result;

	}

	public static void fillArrays(int[] array1, int[] array2, String str1, String str2) {

		var result = "";
		var tmp = 0;

		var counter = 0;
		array1[0] = str1.length();

		for (int i = str1.length() - 1; i >= 0; i--) {

			result += str1.charAt(i);
			tmp = Integer.parseInt(result);

			array1[counter + 1] = tmp;

			result = "";
			counter++;
		}

		counter = 0;
		array2[0] = str2.length();

		for (int j = str2.length() - 1; j >= 0; j--) {

			result += str2.charAt(j);
			tmp = Integer.parseInt(result);

			array2[counter + 1] = tmp;

			result = "";
			counter++;
		}

	}
}
