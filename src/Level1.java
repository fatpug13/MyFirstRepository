
import java.util.*;

public class Level1 {

	public static boolean Football(int F[], int N) {

		boolean result = false;

		if (N == 1) {
			result = true;
		} else {

			result = checkSortArray(F, result);

			if (result == false) {

				int countWrongSequence = 0;
				LinkedList<Integer> invalidIndexes = new LinkedList<Integer>();
				LinkedList<Integer> validIndexes = new LinkedList<Integer>();

				for (int i = 1; i < N; i++) {

					if (F[i] > F[i - 1]) {

						if (i + 1 == N) {

							validIndexes.add(i);
							invalidIndexes.add(i - 1);

						} else {

							validIndexes.add(i - 1);
						}

					} else if (F[i] < F[i - 1]) {

						countWrongSequence++;
						invalidIndexes.add(i - 1);

						if (i + 1 == N) {
							invalidIndexes.add(i);
						}
					}
				}

				if (countWrongSequence == 1 || countWrongSequence == 2) {

					outerloop: for (int i = 0; i < N; i++) {
						for (int j = N - 1; j >= 0; j--) {

							if (F[i] > F[j]) {
								int tmp = F[i];
								F[i] = F[j];
								F[i] = F[j];
								F[j] = tmp;
								break outerloop;
							}
						}
					}

					result = checkSortArray(F, result);

				} else if (countWrongSequence > 2) {

					int len = invalidIndexes.size();
					if (len == N) {

						for (int i = 0; i < N / 2; i++) {
							int temp = F[i];
							F[i] = F[N - 1 - i];
							F[N - 1 - i] = temp;
						}

						result = checkSortArray(F, result);

					} else {

						int counterInd = 0;
						for (int i = 1; i < invalidIndexes.size(); i++) {
							int curr = invalidIndexes.get(i);
							int prev = invalidIndexes.get(i - 1);
							if (prev + 1 != curr) {
								counterInd++;
							}
						}

						if (counterInd == 0) {

							int a = invalidIndexes.getFirst();
							int[] leftNoSort = new int[invalidIndexes.size()];
							int cntr = 0;

							for (int i = a; i < N; i++) {
								leftNoSort[cntr] = F[i];
								cntr++;
							}

							for (int i = 0; i < leftNoSort.length / 2; i++) {
								int temp = leftNoSort[i];
								leftNoSort[i] = leftNoSort[leftNoSort.length - 1 - i];
								leftNoSort[leftNoSort.length - 1 - i] = temp;
							}

							int[] rSort = new int[N];
							for (int i = 0; i < validIndexes.size(); i++) {
								rSort[validIndexes.get(i)] = F[validIndexes.get(i)];
							}

							int k = 0;
							for (int i = 0; i < rSort.length; i++) {
								if (rSort[i] == 0) {
									rSort[i] = leftNoSort[k];
									k++;
								}
							}

							result = checkSortArray(rSort, result);
						} else {
							result = false;
						}
					}
				}
			}
		}

		return result;

	}

	private static boolean checkSortArray(int[] F, boolean result) {

		for (int i = 0; i < F.length - 1; i++) {
			if (F[i + 1] < F[i]) {
				result = false;
				break;
			}
			result = true;
		}
		return result;

	}

}

