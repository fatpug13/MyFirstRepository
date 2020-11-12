
import java.util.*;

public class Level1 {

	public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {

		boolean result = true;

		String newS1 = "";
		newS1 = deleteSpace(S1, newS1);
		String newS2 = "";
		newS2 = deleteSpace(S2, newS2);

		String[][] map = new String[H1][W1];
		fillArray(map, newS1);
		String[][] groupingOfTanks = new String[H2][W2];
		fillArray(groupingOfTanks, newS2);

		ArrayList<Integer> res = new ArrayList<>();

		boolean marker = false;
		int a = 0;
		int b = 0;
		String strMap = "";
		String strGrTanks = "";

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {

				for (int k = 0; k < groupingOfTanks.length; k++) {
					for (int l = 0; l < groupingOfTanks[k].length; l++) {

						strMap = map[i][j];
						strGrTanks = groupingOfTanks[k][l];
						a = Integer.parseInt(strMap);
						b = Integer.parseInt(strGrTanks);

						if (a == b) {
							marker = true;
						}

						strMap = "";
						strGrTanks = "";
						a = 0;
						b = 0;

					}
				}

			}

			if (marker == true) {
				res.add(1);
			} else {
				res.add(0);
			}
		}

		for (int res1 : res) {
			if (res1 != 0) {
				result = true;
			} else {
				result = false;
				break;
			}
		}

		return result;
	}

	public static void fillArray(String[][] arr, String str) {

		String substr = "";
		int counterStr = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				substr += str.charAt(counterStr);
				arr[i][j] = substr;
				substr = "";
				counterStr += 1;
			}
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
