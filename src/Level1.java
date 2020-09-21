import java.util.*;

public class Level1 {

	public static int[] WordSearch(int len, String s, String subs) {

		String[] arrStr = s.split(" ");

		if (arrStr.length <= 1) {
			var str = "";
			int[] arr = new int[arrStr.length + 1];

			for (int k = 0; k < arrStr.length; k++) {

				for (int l = 0; l < arrStr[k].length(); l++) {

					if (l == len) {
						if (str.equals(subs)) {
							arr[k] = 1;

							str = "";
						}
					}
					str += arrStr[k].charAt(l);
				}
			}
			return arr;
		}

		else {

			String[] res = new String[arrStr.length];

			int counterStep = 0;
			int firstStep = 0;
			int j = 0;

			for (int i = 0; i < res.length; i++) {

				for (; j < arrStr.length; j++) {
					counterStep = 0;
					firstStep = 0;

					if (arrStr[j].length() <= len) {

						if (res[i] == null) {
							res[i] = arrStr[j];
							res[i] += " ";
							firstStep += 1;

						} else {
							if (res[i].length() + arrStr[j].length() <= len) {
								if (res[i].equals(arrStr[j]) == false) {
									res[i] += arrStr[j];
									res[i] += " ";

									counterStep += 1;
								}
							} else if (res[i].length() + arrStr[j].length() > len) {
								break;
							}
						}
					}

				}

				if (firstStep == 1 && counterStep == 0) {
					j += 1;
				} else {
					j += counterStep;
				}

			}

			res = Arrays.stream(res).filter(d -> (d != null && d.length() > 0)).toArray(String[]::new);

			int[] result = new int[res.length];
			var word = "";

			for (int i = 0; i < res.length; i++) {

				for (int n = 0; n < res[i].length(); n++) {

					if (res[i].charAt(n) != ' ') {

						word += res[i].charAt(n);
					}

					if (res[i].charAt(n) == ' ') {

						if (word.equals(subs)) {
							result[i] = 1;
						}

						word = "";
					}
				}

			}

			return result;
		}
	}
}
