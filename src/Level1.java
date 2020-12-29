
import java.util.*;

public class Level1 {

	public static boolean SherlockValidString(String s) {

		boolean result = false;
		int[] arr = new int[255];
		ArrayList<Integer> countSymbols = new ArrayList<>();
		boolean everyoneIsEqual = true;
		int maxIndexSymb = 0;
		int minIndexSymb = 0;
		int symb = 0;

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++;
		}

		for (int i = 0; i < 255; i++) {
			if (arr[i] > 0) {
				countSymbols.add(arr[i]);
			}
		}

		for (int i = 1; i < countSymbols.size(); i++) {

			if (countSymbols.get(i) < countSymbols.get(i - 1)) {
				everyoneIsEqual = false;

				if (i == 1) {
					maxIndexSymb = countSymbols.indexOf(countSymbols.get(i - 1));
					minIndexSymb = countSymbols.indexOf(countSymbols.get(i));
				} else {
					if (countSymbols.get(maxIndexSymb) < countSymbols.get(i - 1)) {
						maxIndexSymb = countSymbols.indexOf(countSymbols.get(i - 1));
					} else {
						minIndexSymb = countSymbols.indexOf(countSymbols.get(i));
					}
				}
			} else if (countSymbols.get(i) > countSymbols.get(i - 1)) {
				everyoneIsEqual = false;

				if (i == 1) {
					maxIndexSymb = countSymbols.indexOf(countSymbols.get(i));
					minIndexSymb = countSymbols.indexOf(countSymbols.get(i - 1));
				} else {
					if (countSymbols.get(maxIndexSymb) < countSymbols.get(i)) {
						maxIndexSymb = countSymbols.indexOf(countSymbols.get(i));
					} else {
						minIndexSymb = countSymbols.indexOf(countSymbols.get(i - 1));
					}
				}
			} else {

			}
		}

		if (everyoneIsEqual == true) {
			result = true;
		} else {

			symb = countSymbols.get(maxIndexSymb);
			symb -= 1;
			countSymbols.set(maxIndexSymb, symb);

			result = checkSymbols(result, countSymbols);

			if (result == false) {

				symb = countSymbols.get(maxIndexSymb);
				symb += 1;
				countSymbols.set(maxIndexSymb, symb);

				symb = countSymbols.get(minIndexSymb);
				symb -= 1;
				if (symb != 0) {
					countSymbols.set(minIndexSymb, symb);
				} else {
					countSymbols.remove(minIndexSymb);
				}

				result = checkSymbols(result, countSymbols);
			}
		}

		return result;

	}

	public static boolean checkSymbols(boolean checkResult, ArrayList<Integer> countSymbols) {

		for (int i = 1; i < countSymbols.size(); i++) {
			if (countSymbols.get(i) == countSymbols.get(i - 1)) {
				checkResult = true;
			} else {
				checkResult = false;
				break;
			}
		}

		return checkResult;

	}

}
