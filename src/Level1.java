
import java.util.*;

public class Level1 {

	public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {

		boolean result = true;

		String newS1 = "";
		newS1 = deleteSpace(S1, newS1);

		String newS2 = "";
		newS2 = deleteSpace(S2, newS2);

		int[] arr1 = new int[H1 * W1];
		int[] arr2 = new int[H2 * W2];
		ArrayList res = new ArrayList<>();

		if (arr2.length > arr1.length) {
			result = false;
		} else {

			fillArray(newS1, arr1);
			Arrays.sort(arr1);

			fillArray(newS2, arr2);
			Arrays.sort(arr2);

			int i = 0;
			int j = 0;

			while (i < arr1.length && j < arr2.length) {
				if (arr1[i] > arr2[j]) {
					j++;
				} else if (arr1[i] < arr2[j]) {
					i++;
				} else {
					res.add(arr1[i]);
					i++;
					j++;
				}
			}

			if (res.size() == arr2.length) {
				result = true;
			} else {
				result = false;
			}
		}

		return result;
	}

	public static void fillArray(String str, int[] array) {

		String substr = "";
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
			substr += str.charAt(i);
			k = Integer.parseInt(substr);
			array[i] = k;
			substr = "";
		}
	}

	public static String deleteSpace(String str, String newStr) {

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				newStr += str.charAt(i);
			}
		}
		return newStr;
	}
	
}
