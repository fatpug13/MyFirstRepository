import java.util.*;

public class Level1 {

	public static int[] MadMax(int N, int[] Tele) {

		Arrays.sort(Tele);

		int[] leftPart = Arrays.copyOfRange(Tele, 0, Tele.length / 2);
		int[] rightPart = Arrays.copyOfRange(Tele, Tele.length / 2, Tele.length);

		for (int i = 0, j = rightPart.length - 1, tmp; i < j; i++, j--) {
			tmp = rightPart[i];
			rightPart[i] = rightPart[j];
			rightPart[j] = tmp;
		}

		int[] result = new int[leftPart.length + rightPart.length];

		int counter = 0;

		for (int i = 0; i < leftPart.length; i++) {
			result[i] = leftPart[i];
			counter++;
		}
		for (int j = 0; j < rightPart.length; j++) {
			result[counter++] = rightPart[j];
		}

		return result;
	}
}
