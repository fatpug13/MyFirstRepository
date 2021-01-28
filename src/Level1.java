
import java.util.*;

public class Level1 {

	public static String BalancedParentheses(int N) {

		String result = "";
		char[] str = new char[N * 2];
		ArrayList list = new ArrayList();
		addParenthesis(list, N, N, str, 0);

		for (int i = 0; i < list.size(); i++) {

			if (i + 1 == list.size()) {
				result += list.get(i);
			} else {
				result += list.get(i) + " ";
			}
		}

		return result;

	}

	public static void addParenthesis(ArrayList list, int leftRem, int rightRem, char[] str, int index) {

		if (leftRem < 0 || rightRem < leftRem) {
			return;
		}

		if (leftRem == 0 && rightRem == 0) {
			list.add(String.copyValueOf(str));
		} else {
			str[index] = '(';
			addParenthesis(list, leftRem - 1, rightRem, str, index + 1);

			str[index] = ')';
			addParenthesis(list, leftRem, rightRem - 1, str, index + 1);
		}
	}

}

