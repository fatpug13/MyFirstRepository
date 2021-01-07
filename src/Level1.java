
import java.util.*;

public class Level1 {

	public static String[] TreeOfLife(int H, int W, int N, String[] tree) {

		String[] result = new String[H];
		int[][] treeDescription = new int[H][W];
		char chSymbol = ' ';
		int intSymbol = 0;

		for (var i = 0; i < treeDescription.length; i++) {
			for (var j = 0; j < treeDescription[i].length; j++) {

				chSymbol = tree[i].charAt(j);

				if (chSymbol == '+') {
					intSymbol = 1;
					treeDescription[i][j] = intSymbol;
				}
			}
		}

		int counterYears = 1;
		int valueLine = 0;
		int valueColumn = 0;
		LinkedList<Integer> coordinatesMaxValut = new LinkedList<>();

		do {

			for (var i = 0; i < treeDescription.length; i++) {
				for (var j = 0; j < treeDescription[i].length; j++) {
					treeDescription[i][j]++;
				}
			}

			if (counterYears % 2 == 0) {

				for (var i = 0; i < treeDescription.length; i++) {
					for (var j = 1; j < treeDescription[i].length; j++) {

						if (treeDescription[i][j] > treeDescription[i][j - 1]) {
							valueLine = i;
							valueColumn = j;
						} else if (treeDescription[i][j] < treeDescription[i][j - 1]) {
							valueLine = i;
							valueColumn = j - 1;
						}

					}

					coordinatesMaxValut.addLast(valueLine);
					coordinatesMaxValut.addLast(valueColumn);

				}

				for (var i = 0; i < treeDescription.length; i++) {
					for (var j = 0; j < treeDescription[i].length; j++) {

						if (j == 0) {
							valueLine = coordinatesMaxValut.pollFirst();
							valueColumn = coordinatesMaxValut.pollFirst();
						}

						if (treeDescription[i][j] != 0) {

							if (treeDescription[valueLine][valueColumn] == treeDescription[i][j]) {

								treeDescription[i][j] = 0;

								if (i - 1 >= 0) {
									treeDescription[i - 1][j] = 0;
								}

								if (i + 1 <= treeDescription.length - 1) {
									treeDescription[i + 1][j] = 0;
								}

								if (j + 1 <= treeDescription[i].length - 1) {
									treeDescription[i][j + 1] = 0;
								}

								if (j - 1 >= 0) {
									treeDescription[i][j - 1] = 0;
								}
							}
						}
					}
				}
			}

			counterYears++;

		} while (counterYears <= N);

		String str = "";
		for (var i = 0; i < treeDescription.length; i++) {
			for (var j = 0; j < treeDescription[i].length; j++) {

				if (treeDescription[i][j] != 0) {
					str += "+";
				} else {
					str += ".";
				}

			}
			result[i] = str;
			str = "";
		}

		return result;

	}

}
