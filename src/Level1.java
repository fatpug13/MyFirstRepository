
public class Level1 {

	public static int ConquestCampaign(int N, int M, int L, int[] battalion) {

		int[][] battleground = new int[N][M];

		for (var g = 0; g <= battalion.length - 1;) {

			var coordinateN = battalion[g];
			var coordinateM = battalion[g + 1];

			battleground[coordinateN - 1][coordinateM - 1] = 1;
			g = g + 2;
		}

		var currentDay = 2;
		var val = 0;

		do {

			for (var i = 0; i < battleground.length; i++) {

				for (var j = 0; j < battleground[i].length; j++) {

					if (battleground[i][j] != 0) {

						if (battleground[i][j] < currentDay) {

							if (j - 1 >= 0) {

								if (battleground[i][j - 1] == 0) {
									battleground[i][j - 1] = currentDay;
								}
							}

							if (j + 1 <= battleground[i].length - 1) {

								if (battleground[i][j + 1] == 0) {
									battleground[i][j + 1] = currentDay;
								}
							}

							if (i + 1 <= battleground.length - 1) {

								if (battleground[i + 1][j] == 0) {
									battleground[i + 1][j] = currentDay;
								}
							}

							if (i - 1 >= 0) {

								if (battleground[i - 1][j] == 0) {
									battleground[i - 1][j] = currentDay;
								}
							}
						}
					}

				}

			}

			for (var i = 0; i < battleground.length; i++) {
				for (var j = 0; j < battleground[i].length; j++) {

					if (battleground[i][j] == 0) {
						val = val - 1;
						break;
					} else {
						val = 1;
					}

				}
			}

			currentDay = currentDay + 1;

		} while (val <= 0);

		return currentDay - 1;
	}

}
