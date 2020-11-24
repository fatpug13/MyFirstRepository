
import java.util.*;

public class Level1 {

	public static boolean LineAnalysis(String line) {

		boolean result = true;
		String pattern = "";
		int countPointInPattern = 0;

		for (int i = 0; i < line.length(); i++) {

			if (i == 0 && line.charAt(i) == '*') {
				pattern += line.charAt(i);
			} else if (line.charAt(i) == '.') {
				pattern += line.charAt(i);
				countPointInPattern += 1;
			} else if (line.charAt(i) == '*') {
				pattern += line.charAt(i);
				break;
			}
		}

		int countPointInLine = 0;
		for (int i = 0; i < line.length(); i++) {

			if (i == 0 && line.charAt(i) == '*') {
				countPointInLine = 0;
			} else if (line.charAt(i) == '.') {
				countPointInLine += 1;
			} else if (line.charAt(i) == '*') {
				if (countPointInLine == countPointInPattern) {
					result = true;
					countPointInLine = 0;
				} else {
					result = false;
					countPointInLine = 0;
					break;
				}
			}
		}

		return result;
	}
}
