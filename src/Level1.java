import java.util.*;

public class Level1 {

public static int PrintingCosts(String Line) {
		
		// уберем пробелы так как значение пробела = 0.
		var str = "";
		for (int i = 0; i < Line.length(); i++) {
			if (Line.charAt(i) != ' ') {
				str += Line.charAt(i);
			}
		}

		// переберем строку без порбелов, отправл€€ каждый символ в функцию котора€
		// определ€ет, какое значение он имеет.
		var result = 0;
		var currentSymb = "";

		for (int i = 0; i < str.length(); i++) {
			
			//получим текущий символ в строке
			currentSymb += str.charAt(i);
			// получим значение и прибавим к результату
			result += getSymbolValue(currentSymb);
			// очистим переменную дл€ следующего символа
			currentSymb = "";

		}

		return result;
	}
	
	public static int getSymbolValue(String symb) {
		
		var result = 0;
		//создадим струтуру "раскладка символов" и заполним ее значени€ми.
		Map<String, Integer> characterLayouts = new HashMap<String, Integer>();
		
		characterLayouts.put("&", 24);
		characterLayouts.put(",", 7);
		characterLayouts.put("2", 22);
		characterLayouts.put("8", 23);
		characterLayouts.put(">", 10);
		characterLayouts.put("D", 26);
		characterLayouts.put("J", 18);
		characterLayouts.put("P", 23);
		characterLayouts.put("V", 19);
		characterLayouts.put("\\", 10);
		characterLayouts.put("b", 25);
		characterLayouts.put("h", 21);
		characterLayouts.put("n", 18);
		characterLayouts.put("t", 17);
		characterLayouts.put("z", 19);
		
		characterLayouts.put("!", 9);
		characterLayouts.put("'", 3);
		characterLayouts.put("-", 7);
		characterLayouts.put("3", 23);
		characterLayouts.put("9", 26);
		characterLayouts.put("?", 15);
		characterLayouts.put("E", 26);
		characterLayouts.put("Q", 31);
		characterLayouts.put("W", 26);
		characterLayouts.put("]", 18);
		characterLayouts.put("c", 17);
		characterLayouts.put("i", 15);
		characterLayouts.put("o", 20);
		characterLayouts.put("u", 17);
		characterLayouts.put("{", 18);
		
		characterLayouts.put("\"", 6);
		characterLayouts.put("(", 12);
		characterLayouts.put(".", 4);
		characterLayouts.put("4", 21);
		characterLayouts.put(":", 8);
		characterLayouts.put("@", 32);
		characterLayouts.put("F", 20);
		characterLayouts.put("L", 16);
		characterLayouts.put("R", 28);
		characterLayouts.put("X", 18);
		characterLayouts.put("^", 7);
		characterLayouts.put("d", 25);
		characterLayouts.put("j", 20);
		characterLayouts.put("p", 25);
		characterLayouts.put("v", 13);
		characterLayouts.put("|", 12);
		
		characterLayouts.put("#", 24);
		characterLayouts.put(")", 12);
		characterLayouts.put("/", 10);
		characterLayouts.put("5", 27);
		characterLayouts.put(";", 11);
		characterLayouts.put("A", 24);
		characterLayouts.put("G", 25);
		characterLayouts.put("M", 28);
		characterLayouts.put("S", 25);
		characterLayouts.put("Y", 14);
		characterLayouts.put("_", 8);
		characterLayouts.put("e", 23);
		characterLayouts.put("k", 21);
		characterLayouts.put("q", 25);
		characterLayouts.put("w", 19);
		characterLayouts.put("}", 18);
		
		characterLayouts.put("$", 29);
		characterLayouts.put("*", 17);
		characterLayouts.put("0", 22);
		characterLayouts.put("6", 26);
		characterLayouts.put("<", 10);
		characterLayouts.put("B", 29);
		characterLayouts.put("H", 25);
		characterLayouts.put("N", 25);
		characterLayouts.put("T", 16);
		characterLayouts.put("Z", 22);
		characterLayouts.put("`", 3);
		characterLayouts.put("f", 18);
		characterLayouts.put("l", 16);
		characterLayouts.put("r", 13);
		characterLayouts.put("x", 13);
		characterLayouts.put("~", 9);
		
		characterLayouts.put("%", 22);
		characterLayouts.put("+", 13);
		characterLayouts.put("1", 19);
		characterLayouts.put("7", 16);
		characterLayouts.put("=", 14);
		characterLayouts.put("C", 20);
		characterLayouts.put("I", 18);
		characterLayouts.put("O", 26);
		characterLayouts.put("U", 23);
		characterLayouts.put("[", 18);
		characterLayouts.put("a", 23);
		characterLayouts.put("g", 30);
		characterLayouts.put("m", 22);
		characterLayouts.put("s", 21);
		characterLayouts.put("y", 24);
		
		if (characterLayouts.get(symb) != null) {
			result = characterLayouts.get(symb);
		} else {
			result = 23;
		}
		
		return result;
		
	}
}
