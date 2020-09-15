import java.util.*;

public class Level1 {

	public static int[] SynchronizingTables(int N, int[] arrId, int[] arrSal) {

		Arrays.sort(arrSal);

		int result[] = new int[N];
		int sortAarrId[] = new int[N];

		for (int i = 0; i < arrId.length; i++) {
			sortAarrId[i] = arrId[i];
		}

		Arrays.sort(sortAarrId);

		for (int i = 0; i < arrId.length; i++) {
			for (int j = 0; j < sortAarrId.length; j++) {

				if (arrId[i] == sortAarrId[j]) {
					result[i] = arrSal[j];
				}

			}
		}

		return result;
	}
}
