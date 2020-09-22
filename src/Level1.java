import java.util.*;

public class Level1 {

	public static int SumOfThe(int N, int[] data) {

		int num = 0;
		int sum = 0;

		for (int i = 0; i <= N; i++) {
			num = data[i];

			int tmp = data[0];
			data[0] = num;
			data[i] = tmp;

			for (int j = 1; j < data.length; j++) {
				sum += data[j];
			}

			if (num == sum) {

				break;
			}
			sum = 0;
		}

		return num;
	}

}
