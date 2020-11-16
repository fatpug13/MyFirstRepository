
import java.util.*;

public class Level1 {

	public static int MaximumDiscount(int N, int[] price) {

		int result = 0;
		Arrays.sort(price);

		if (N == 3) {
			result = price[0];
		} else if (N > 3) {

			int countFreeProd = N / 3;
			int discount = 0;

			for (int i = 0; i < countFreeProd; i++) {
				discount += price[i];
			}

			int anotherDiscount = 0;

			for (int i = N - 3; i >= 0;) {

				if (countFreeProd != 0) {
					anotherDiscount += price[i];
				}

				countFreeProd--;
				i -= 3;
			}

			if (discount > anotherDiscount) {
				result = discount;
			} else {
				result = anotherDiscount;
			}

		} else {

			result = 0;
		}

		return result;
	}
}
