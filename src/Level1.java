
import java.util.*;
import java.util.stream.IntStream;

public class Level1 {

	public static String MassVote(int N, int[] Votes) {

		var result = "";
		var sum = 0;
		
		sum = IntStream.of(Votes).sum();

		if (sum == 0) {
			result = "No winner";
		}
		else {

			double[] vot;
			
			if ((N % 2) == 0) {
				vot = new double[N];
			} else {
				vot = new double[N + 1];
			}

			String str = "";
			double voteDouble = 0;
			for (int i = 0; i < Votes.length; i++) {
				
				voteDouble = Votes[i] * 100.0 / sum;
				str = String.format("%.3f", voteDouble);
				double d = Double.parseDouble(str.replace(",", "."));
				vot[i] += d;
			}

			boolean noWin = false;
			int counter = 0;
			double res = 0;
			double a = 0;

			for (int i = 0; i < vot.length; i += 2) {
				
				if (i + 1 <= vot.length) {
					if (vot[i] > vot[i + 1]) {
						if (vot[i] != a) {
							if (vot[i] > res) {
								res = vot[i];
								counter = i + 1;
								noWin = false;
							} else if (vot[i] == res) {
								noWin = true;
							}
						} else {
							noWin = true;
						}
					} else if (vot[i] < vot[i + 1]) {
						if (vot[i + 1] != a) {
							if (vot[i + 1] > res) {
								res = vot[i + 1];
								if (i == 0) {
									counter = i + 2;
								} else {
									counter = i + 1;
								}
								noWin = false;
							} else if (vot[i] == res) {
								noWin = true;
							}
						} else {
							noWin = true;
						}
					} else {
						a = vot[i];
						if (res < a) {
							res = vot[i];
							noWin = true;
						}
					}
				}
			}

			if (noWin == true) {
				result = "No winner";
			} else if (res > 50) {
				result = "majority winner " + counter;
			} else if (res <= 50) {
				result = "minority winner " + counter;
			}
		}
		return result;
	}
}
