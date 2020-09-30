import java.util.*;

public class Level1 {

	public static String TheRabbitsFoot(String s, Boolean encode) {

		var str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				str += s.charAt(i);
			}
		}

		int N = str.length();
		double srt = Math.sqrt(N);

		String result = String.format("%.2f", srt);

		var charA = "";
		var charB = "";

		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) != ',') {
				charA += result.charAt(i);
			} else {
				charB += result.charAt(i + 1);
				break;
			}
		}

		int line = Integer.parseInt(charA);
		int column = Integer.parseInt(charB);

		int k = 1;
		while (column * line < N) {
			
			line += k;
			k++;
		}

		String[][] matrix = new String[line][column];
		fillInSpace(matrix);
		
		if (encode == true) {
		
			var counter = 0;
			for (var i = 0; i < matrix.length; i++) {
				for (var j = 0; j < matrix[i].length; j++) {

					if (counter < str.length()) {
						matrix[i][j] += str.charAt(counter);
						counter += 1;
					}
				}
			}
			
			str = "";
			for (int i = 0; i < column; i++) {
				for (int j = 0; j < line; j++) {

					str += matrix[j][i];
				}

				str += " ";
			}
			return str;

		} else {
 
			var counter = 0;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {

					if (counter < str.length()) {
						matrix[i][j] += str.charAt(counter);
						counter += 1;
					}

				}
			}

			String[][] matrix2 = new String[line][column];
			fillInSpace(matrix2);

			var step = 0;
			for (int i = 0; i < column; i++) {
				for (int j = 0; j < line; j++) {

					if (matrix[j][i] != "") {
						if (step < str.length()) {
							matrix2[j][i] += str.charAt(step);
							step += 1;
						}
					}
				}
			}

			str = "";
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2[i].length; j++) {
					
					str += matrix2[i][j];
				}
			}

			return str;
		}
	}

	private static String[][] fillInSpace(String[][] arrName) {

		for (int i = 0; i < arrName.length; i++) {
			for (int j = 0; j < arrName[i].length; j++) {
				arrName[i][j] = "";
			}
		}
		return arrName;
	}
}
