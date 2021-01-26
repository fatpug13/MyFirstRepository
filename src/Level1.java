
import java.util.*;

public class Level1 {

	public static boolean TransformTransform(int A[], int N) {

		boolean result = true;
		LinkedList<Integer> C = new LinkedList<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			C.add(A[i]);
		}

		C = transformR(transformR(C));

		return result = checkForParity(C);

	}

	private static boolean checkForParity(LinkedList<Integer> list) {

		int num = 0;
		for (Integer value : list) {
			num += value;

		}
		System.out.println(num);

		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static LinkedList<Integer> transformR(LinkedList<Integer> listA) {

		LinkedList<Integer> B = new LinkedList<Integer>();

		for (int i = 0; i <= listA.size() - 1; i++) {
			for (int j = 0; j <= listA.size() - 1 - i; j++) {

				int k = i + j;
				
				if (j == k) {
					B.addLast(listA.get(j));
				} else {
					findMaxValue(j, k, listA, B);
				}
			}
		}

		return B;
	}

	private static void findMaxValue(int j, int k, LinkedList<Integer> A, LinkedList<Integer> b) {

		int maxVal = 0;
		for (int i = j; i <= k; i++) {

			int value = A.get(i);
			if (maxVal < value) {
				maxVal = value;
			}
		}

		b.addLast(maxVal);

	}

}

