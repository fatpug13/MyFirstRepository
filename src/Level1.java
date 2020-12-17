
import java.util.*;

public class Level1 {

	static boolean undoComm = false;
	static boolean clearHistory = false;
	static int counterIter = 1;
	static LinkedList<String> historyCommand1And2 = new LinkedList<String>();
	static LinkedList<String> historyAllCommand = new LinkedList<String>();

	public static String BastShoe(String command) {

		String result = "";
		char numbCommand = ' ';
		String param = "";

		for (int i = 0; i < command.length(); i++) {
			if (i == 0) {
				numbCommand = command.charAt(i);
			} else {
				if (i == 1) {

				} else if (i == 2) {
					if (command.charAt(i) != ' ') {
						param += command.charAt(i);
					}
				} else {
					param += command.charAt(i);
				}
			}
		}

		if (counterIter == 1) {
			historyAllCommand.addLast("");
		}

		String word = "";
		String currentCommand = "";
		int indexCommand = 0;

		switch (numbCommand) {
		case '1':

			word = historyAllCommand.getLast();
			result = addText(param, word);

			if (undoComm == true) {
				historyCommand1And2.clear();
				historyCommand1And2.addLast(result);
				historyCommand1And2.addLast(word);
				clearHistory = true;
			} else {
				historyCommand1And2.addLast(result);
			}

			historyAllCommand.addLast(result);
			undoComm = false;

			break;
		case '2':

			word = historyAllCommand.getLast();
			result = dellSymbol(param, word);

			if (undoComm == true) {
				historyCommand1And2.clear();
				historyCommand1And2.addLast(result);
				historyCommand1And2.addLast(word);
				clearHistory = true;
			} else {
				historyCommand1And2.addLast(result);
			}

			historyAllCommand.addLast(result);
			undoComm = false;

			break;
		case '3':

			word = historyAllCommand.getLast();
			result = getSymbol(param, word);
			
			undoComm = false;			
			clearHistory = false ;
			

			break;
		case '4':

			if (clearHistory == true) {
				result = historyCommand1And2.getLast();
			} else {
				currentCommand = historyAllCommand.getLast();
				indexCommand = historyCommand1And2.lastIndexOf(currentCommand);

				if (indexCommand - 1 > 0) {
					result = historyCommand1And2.get(indexCommand - 1);
				} else {
					result = historyCommand1And2.getFirst();
				}
			}

			historyAllCommand.addLast(result);
			undoComm = true;

			break;
		case '5':

			if (clearHistory == true) {
				result = historyCommand1And2.getFirst();
			} else {
				currentCommand = historyAllCommand.getLast();
				indexCommand = historyCommand1And2.lastIndexOf(currentCommand);
				if (indexCommand + 1 < historyCommand1And2.size()) {
					result = historyCommand1And2.get(indexCommand + 1);
				} else {
					result = historyCommand1And2.getLast();
				}
			}

			historyAllCommand.addLast(result);

			break;

		default:

			result = historyAllCommand.getLast();
		}

		counterIter++;
		return result;
	}

	public static String addText(String s1, String s2) {

		String result = "";
		if (s2.isEmpty()) {
			result = s1;
		} else {
			result = s2;
			for (int i = 0; i < s1.length(); i++) {
				result += s1.charAt(i);
			}
		}

		return result;
	}

	public static String dellSymbol(String countSymbols, String s2) {

		String result = "";
		int countSy = Integer.parseInt(countSymbols);

		if (countSy <= s2.length()) {
			for (int i = 0; i < s2.length() - countSy; i++) {
				result += s2.charAt(i);
			}
		} else {

		}

		return result;
	}

	public static String getSymbol(String indexSymbol, String s2) {

		String result = "";
		int numbSymb = Integer.parseInt(indexSymbol);
		if (numbSymb < s2.length()) {
			result += s2.charAt(numbSymb);
		} else {
		}

		return result;
	}

}
