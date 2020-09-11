
import java.util.Arrays;


public class Program {

	public static void main(String[] args) {
		// var a = 5;
		int arr[] = new int[] { 1, 1, 1, 2, 1, 3, 2, 1, 2, 2, 2, 3};
		var N = 3;
		var M = 4;
		var L = 6;

		// System.out.println(squirrel(a));
		// System.out.println(odometer(arr));
		System.out.println(ConquestCampaign(N, M, L, arr));
	}

	public static boolean startsWith(String text, String substr)

	{

		var lengthtSubstr = substr.length() - 1;
		var resText = "";
		var resSubstr = "";

		for (var i = 0; i <= lengthtSubstr; i++) {

			resText += text.charAt(i);
			resSubstr += substr.charAt(i);

		}
		return resText.equals(resSubstr);
	}

	public static int squirrel(int N) {
		var result = 1;

		if (N == 0 || N == 1) {
			return result;
		} else {
			for (var i = 1; i <= N; i++) {
				result *= i;
			}

			var firstInteger = Integer.parseInt(Integer.toString(result).substring(0, 1));
			return firstInteger;
		}
	}

	public static int odometer(int[] oksana) {
		var distance = 0;
		var previousTime = 0;

		for (var i = 0; i <= oksana.length - 1;) {
			var v = oksana[i];
			var currentTime = oksana[i + 1];

			if (i == 0) {
				previousTime = 0;
			} else {
				previousTime = oksana[i - 1];
			}

			distance = v * (currentTime - previousTime) + distance;

			i = i + 2;

		}
		return distance;
	}

	public static  int ConquestCampaign(int N, int M, int L, int[] battalion) {
		
		// ������� ��������� ������ �� ��������� ��������
		int[][] battleground = new int[N][M];

		// ������� �� ��������� �����������. 1� ����
		for (var g = 0; g <= battalion.length - 1;) {

			var coordinateN = battalion[g];
			var coordinateM = battalion[g + 1];

			battleground[coordinateN - 1][coordinateM - 1] = 1;
			g = g + 2;

		}
		
		// ��������, �� ��������� �� ��� ���������� � 1� ����
		var currentDay = 1;
		if (M * N == L) {
			return currentDay = 1;
		} else {

			// �������� ��������� ���� (2�) � val - ������� ����
			currentDay = 2;
			var val = 0;

			// �������� ������ �� ������� ���
			do {
				// ������� ������ � �����. ���� �� N ����������� (�������)
				for (var i = 0; i < battleground.length; i++) {

					// ���� �� M ����������� (���������)
					for (var j = 0; j < battleground[i].length; j++) {

						// ������ ����������� ������� ������� � ������ ���� �������
						if (battleground[i][j] != 0) {

							// ������ ��������� ���������� � 4 ������������ (�������). ���� ������� ��������
							// �� ���� � ������� ����,
							// �� ����������� �� ����.
							if (battleground[i][j] < currentDay) {

								// ����� �� ������ �����
								// ������ � ������� �������?
								if (j - 1 >= 0) {
									// �������� ��������� �����?
									if (battleground[i][j - 1] == 0) {
										battleground[i][j - 1] = currentDay;
									}
								}
								// ����� �� ������ ������
								// ������ � ������� �������?
								if (j + 1 <= battleground[i].length - 1) {
									// �������� ��������� �����
									if (battleground[i][j + 1] == 0) {
										battleground[i][j + 1] = currentDay;
									}
								}
								// ����� ����
								// ������ � ������� �������?
								if (i + 1 <= battleground.length - 1) {
									// �������� ��������� �����?
									if (battleground[i + 1][j] == 0) {
										battleground[i + 1][j] = currentDay;
									}
								}
								// ����� �����
								// ������ � ������� �������?
								if (i - 1 >= 0) {
									// �������� ��������� �����?
									if (battleground[i - 1][j] == 0) {
										battleground[i - 1][j] = currentDay;
									}
								}
							}
						}

					}

				}

				// ���� � ������� ���� ����, ������ ��� ����� ��� ���� ���� ��� �������
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
			System.out.println(Arrays.deepToString(battleground));

			// ����� 1 ���� �.�. ���� ������� �� 2�� (� 1� ���� ���� �������)
			return currentDay - 1;
		}
	}
}
