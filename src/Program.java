import java.util.*;



public class Program {

	public static void main(String[] args) {
		// var a = 5;
		//int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 2, 7, 8, 9 };
		//int arrSal[]= new int [] { 20000,100000,90000 };
		var N = 13;
		var S = "��� �������� ������������� ��� �������� �������";
		var subs = "���";
		//var M = 4;
		//var L = 6;

		// System.out.println(squirrel(a));
		// System.out.println(odometer(arr));
		// System.out.println(ConquestCampaign(N, M, L, arr));
		//System.out.println(Arrays.toString(MadMax(N, arr)));
		//System.out.println(Arrays.toString(SynchronizingTables(N, arrId, arrSal)));
		//System.out.println(PatternUnlock(N, arr));
		System.out.println(Arrays.toString(WordSearch(N, S, subs)));
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

			// �������� ��������� ���� (2�) � val - ������� ������ �� �����
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
	
	public static  int [] MadMax(int N, int [] Tele) {
		
		// ����������� ������ �� �����������
		Arrays.sort(Tele);
		System.out.println(Arrays.toString(Tele));
		
		// �������� ������ �� ��� �����
		// ������� ��������� ������. ����� �����
		int[] leftPart = Arrays.copyOfRange(Tele, 0, Tele.length / 2);
		System.out.println(Arrays.toString(leftPart));

		// ������� ��������� ������. ������ �����
		int[] rightPart = Arrays.copyOfRange(Tele, Tele.length / 2, Tele.length);

		// ����������� ������ ����� �� ��������
		for (int i = 0, j = rightPart.length - 1, tmp; i < j; i++, j--) {
			tmp = rightPart[i];
			rightPart[i] = rightPart[j];
			rightPart[j] = tmp;
		}
		System.out.println(Arrays.toString(rightPart));

		// �������� ����������� ������� � ����
		int[] result = new int[leftPart.length + rightPart.length];
		
		// ����� ��������� �� ����� ������� �� ������������ ����� ������ ����� ����� � �������. ������
		int counter = 0;

		for (int i = 0; i < leftPart.length; i++) {
			result[i] = leftPart[i];
			counter++;
		}
		for (int j = 0; j < rightPart.length; j++) {
			result[counter++] = rightPart[j];
		}
		System.out.println(Arrays.toString(result));

		return result;
	}

	public static int [] SynchronizingTables(int N, int [] arrId, int [] arrSal) {
		
		// ������ ������� ������ �����������. ����������� �� ����������� ������ �������
		Arrays.sort(arrSal);
		
		// ��� ����� �����������
		int result[] = new int [N];
		
		// ��������� ������ ���� ����������� � ������ ������
		int sortAarrId[] = new int [N];
		
		for (int i = 0; i < arrId.length; i ++) {
			sortAarrId[i] = arrId[i];
		}
		// ����������� ������ ���� ����������� �� �����������
		Arrays.sort(sortAarrId);
		
		// ������ ������ ������� � ������ ���� �����������.
		// ������� ������ arrId � �� ������ �������� ����� ���������� �������� �� arrId � arrayId � ���� ��� ����� �����
		// ������� � �������������� ������ res �������� �� ������� ������� arrSal ��� �������� ��������������� arrId.
		
		for (int i = 0; i < arrId.length; i++) {
			for (int j = 0; j < sortAarrId.length; j ++) {
				
				if (arrId[i] == sortAarrId[j]) {
					result[i] = arrSal[j];
				}
				
			}
		}
		
		
		return result;
	}
	
	public static String PatternUnlock(int N, int[] hits) {

		double result = 0;
		double hypot = 0;
		int onlyInt = 0;

		// ������� ������ hits � ��������� ���������
		for (int i = 0; i < hits.length - 1; i++) {

			// ���� ���� ���� �� ������� ���������� ��� ������, �� ������������ �� ���������
			// ���������� ������������� �����������.
			// ������ ���������� �.�. ��� ���������� ���������� ����� ������� �� ���������.
			// �������� ���� ���������� ��
			// ��������� � �� �����������, ��� ����� 1. ����� ������� �� ��������. 1 �
			// ������� 2 + 1 � ������� 2 = 2.
			// ��� ����� ������� ���������� ������ �� 2.

			if (hits[i] == 6 && hits[i + 1] == 2 || hits[i] == 2 && hits[i + 1] == 6) {

				hypot = Math.sqrt(2);
				result = result + hypot;
			} else if (hits[i] == 2 && hits[i + 1] == 7 || hits[i] == 7 && hits[i + 1] == 2) {

				hypot = Math.sqrt(2);
				result = result + hypot;
			} else if (hits[i] == 9 && hits[i + 1] == 2 || hits[i] == 2 && hits[i + 1] == 9) {

				hypot = Math.sqrt(2);
				result = result + hypot;
			} else if (hits[i] == 2 && hits[i + 1] == 4 || hits[i] == 4 && hits[i + 1] == 2) {

				hypot = Math.sqrt(2);
				result = result + hypot;
			} else if (hits[i] == 5 && hits[i + 1] == 3 || hits[i] == 3 && hits[i + 1] == 5) {

				hypot = Math.sqrt(2);
				result = result + hypot;
			} else if (hits[i] == 8 && hits[i + 1] == 3 || hits[i] == 3 && hits[i + 1] == 8) {

				hypot = Math.sqrt(2);
				result = result + hypot;
			} else if (hits[i] == 5 && hits[i + 1] == 1 || hits[i] == 1 && hits[i + 1] == 5) {

				hypot = Math.sqrt(2);
				result = result + hypot;
			} else if (hits[i] == 8 && hits[i + 1] == 1 || hits[i] == 1 && hits[i + 1] == 8) {

				hypot = Math.sqrt(2);
				result = result + hypot;
			} else {
				// ���� �� ��������� ��� �����������
				onlyInt = onlyInt + 1;
			}

		}

		// �����
		result = result + onlyInt;

		System.out.println(result);

		// �������� �� 5 ������ ����� �������, ���������� ��������� � ������.
		String res = String.format("%.5f", result);

		// ������������� ���������
		var finalResult = "";
		// ������� ��������� � ������ "0" � ",".
		for (int i = 0; i < res.length(); i++) {
			if (res.charAt(i) != '0' && res.charAt(i) != ',') {
				finalResult += res.charAt(i);
			}
		}

		return finalResult;
	}

	public static int [] WordSearch (int len, String s, String subs) {
		
		// �������� ������ �� �����. � ���������� ��������� ������ � ������� ������
		// ������ ����� � ��������� �������.
		String[] arrStr = s.split(" ");

		// ��������� ���������� ������ � ������������ � ��������.
		// � ������ �������� ����� ���� ������ �� ������ len ��������. �������� �����
		// ������ �� �������.
		String[] res = new String[arrStr.length];

		int counterStep = 0;
		int firstStep = 0;
		int j = 0;

		// ������� ������ ������, ��������� ��� ���� ������ �� �������� � ��������� �
		// ������ ������� ������� �������
		// �������� �� ������� �����. ������� ����� ����� �������� �� ��������� len.

		for (int i = 0; i < res.length; i++) {

			for (; j < arrStr.length; j++) {
				counterStep = 0;
				firstStep = 0;
				// ����� ����� ������ ��������� ��������� ��������
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
								// �������� ��������� ����� �� ���������� �������
								counterStep += 1;
							}
						} else if (res[i].length() + arrStr[j].length() > len) {
							break;
						}
					}
				}

			}
			// �� ����� ������ ���� �������� ����� � ������ �� �����. ������� �� 1
			if (firstStep == 1 && counterStep == 0) {
				j += 1;
			} else {
				j += counterStep;
			}

		}

		// ������ null �������� �� �������
		res = Arrays.stream(res).filter(d -> (d != null && d.length() > 0)).toArray(String[]::new);
		//
		int[] result = new int[res.length];
		var word = "";

		// ������� ���������� ������ � ������ � ��� ������ �����.
		for (int i = 0; i < res.length; i++) {

			// ������� ������ ������ �������� � �������.
			for (int n = 0; n < res[i].length(); n++) {
				// �� ����� ��������� ������� � �����
				if (res[i].charAt(n) != ' ') {
					// �� ������ ���������� �����.
					word += res[i].charAt(n);
				}
				// ���� ����� ���� ������, ������ ����� �����.
				if (res[i].charAt(n) == ' ') {
					// ��������, ���� ����� �� ����������.
					if (word.equals(subs)) {
						result[i] = 1;
					}
					// ������� ����� ��� ���������� �������
					word = "";
				}
			}

		}

		System.out.println(Arrays.toString(res));

		return result;
	}
	

	// ������� 1

	// var gap = 0;
	// var step = 0;
	// var multiLine = "";
	// var word = "";
	// var counter = 0;
	// var arrCounter = 0;
	// var begin = 0;
	// String [] res = new String [20];

	// ������� ������ � �������� �� �� �����
	// for (int i = 0; i < s.length(); i ++) {
	// �������� �� ����� ������� ��� ��������� ������
	// if (s.charAt(i) == ' ') {
	// gap = i;
	// }

	// if(len == step ) {

	// ������� �����
	// ���� ������ �� ������, ����� �������� �����
	// if (s.charAt(i) == ' ') {

	// for (int j = begin; j <= i; j ++) {
	// word += s.charAt(j);
	// }
	// ������� ����� � ������
	// res[arrCounter] = word;
	// �������� ������� ��� ������ � ������
	// arrCounter += 1;
	// ������ � ������ ������� ����� ���������� ��������� �����
	// begin = i;
	// ������� ������� �����
	// step = 0;
	// ������� �����
	// word = "";
	// }
	// else {
	// ������ �����. ������� �� ���������� �������
	// ������ �����

	// for (int j = begin; j <= gap; j ++) {
	// word += s.charAt(j);
	// }
	// ������� ����� � ������
	// res[arrCounter] = word;
	// �������� ������� ��� ������ � ������
	// arrCounter += 1;
	// ������ � ������ ������� ����� ���������� ��������� �����
	// begin = gap;
	// ������� ������� �����
	// step = 0;
	// ������� �����
	// word = "";
	// ������� i
	// int num = len - gap;
	// i = i - gap;
	// }
	// }

	// step = step + 1;

	// }
	// System.out.println(Arrays.toString(res));

	// ������� 2

	// boolean take1 = false;
	// boolean take2 = false;

	// for (int i = 0; i < arrStr.length; ) {

	// take1 = false;
	// take2 = false;

	// if (arrStr[i].length() <= len) {
	// res[arrCounter] = arrStr[i];
	// }

	// �� ����� �� �������?
	// if (arrStr[i].length() + arrStr[i + 1].length() <= arrStr.length) {
	// ��� ������
	// if (arrStr[i].length() + arrStr[i + 1].length() <= len) {
	// res[arrCounter] = arrStr[i] + arrStr[i + 1];
	// ������� ����� �� ������ ��������
	// take1 = true;
	// }
	// }
	// �� ����� �� �������?
	// if (arrStr[i].length() + arrStr[i + 1].length() + arrStr[i + 2].length() <=
	// arrStr.length) {
	// ��� ������
	// if (arrStr[i].length() + arrStr[i + 1].length() + arrStr[i + 2].length() <=
	// len) {
	// res[arrCounter] = arrStr[i] + arrStr[i + 1] + arrStr[i + 2].length();
	// take2 = true;
	// }
	// }

	// if (take1 == true) {
	// i += 2;
	// } else if (take2 == true) {
	// i += 2;
	// } else {
	// i += 1;
	// }
	// arrCounter += 1;
	// }

}
