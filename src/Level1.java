
import java.util.*;

public class Level1 {

	public static String BiggerGreater(String input) {

		String result = "";
		boolean allSymbolsAreTheSame = false;

		for (int i = 1; i < input.length(); i++) {

			if (input.charAt(i) != input.charAt(i - 1)) {
				allSymbolsAreTheSame = false;
				break;
			}
			allSymbolsAreTheSame = true;
		}

		if (allSymbolsAreTheSame == false) {

			String originalWord = input;
			String subStr = "";
			String[] arrSymbols = new String[originalWord.length()];
			ArrayList<String> arrMagicWords = new ArrayList<String>();
			ArrayList<String> MagWrd = new ArrayList<String>();

			for (int i = 0; i < originalWord.length(); i++) {
				subStr += originalWord.charAt(i);
				arrSymbols[i] = subStr;
				subStr = "";
			}

			replaceTwoSymbols(originalWord, arrMagicWords, arrSymbols);

			String previousMagicWrd = "";
			String currMagicWrd = "";
			int val1 = 0;
			int val2 = 0;
			int curValue = 0;

			for (int i = 0; i < arrMagicWords.size() - 1; i++) {

				currMagicWrd = arrMagicWords.get(i);
				curValue = originalWord.compareTo(currMagicWrd);

				if (curValue < 0) {
					MagWrd.add(currMagicWrd);
				}

			}

			if (MagWrd.size() == 1) {
				result = MagWrd.get(0);
			} else {

				for (int i = 1; i < MagWrd.size(); i++) {

					if (i == 1) {

						previousMagicWrd = MagWrd.get(0);
						currMagicWrd = MagWrd.get(i);
						val1 = currMagicWrd.compareTo(previousMagicWrd);

						if (val1 < 0) {
							result = currMagicWrd;
						} else if (val1 > 0) {
							result = previousMagicWrd;
						}

					} else {

						previousMagicWrd = MagWrd.get(i - 1);
						currMagicWrd = MagWrd.get(i);
						val1 = currMagicWrd.compareTo(previousMagicWrd);

						if (val1 < 0) {

						} else if (val1 > 0) {
							val2 = result.compareTo(previousMagicWrd);
							if (val2 < 0) {

							} else if (val2 > 0) {
								result = previousMagicWrd;
							}
						}
					}
				}
			}
		}
		return result;
	}

	public static ArrayList<String> replaceTwoSymbols(String word, ArrayList<String> magicWords,
			String[] arraySymbols) {

		int step = 2;
		int counter = 0;
		int resultCompare = 0;
		Boolean needIteration = true;
		String tmp = "";
		String magicWord = "";

		do {

			if (word.length() - step < 0) {
				step = 2;
				counter = word.length() - step;
			} else {
				counter = word.length() - step;
			}

			for (int i = 0; i < arraySymbols.length; i++) {

				if (i < counter) {
					magicWord += arraySymbols[i];
				} else if (i == counter) {
					tmp = arraySymbols[i];
				} else if (i == counter + 1) {
					magicWord += arraySymbols[i];
					magicWord += tmp;

					arraySymbols[i - 1] = arraySymbols[i];
					arraySymbols[i] = tmp;
				} else {
					magicWord += arraySymbols[i];
				}
			}

			step++;
			magicWords.add(magicWord);
			resultCompare = word.compareTo(magicWord);

			if (resultCompare == 0) {
				needIteration = false;
			}
			magicWord = "";

		} while (needIteration == true);

		return magicWords;
	}

}
