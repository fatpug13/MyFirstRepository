
import java.util.*;


public class Program {
	public static void main(String[] args) {
		// var a = 5;
		//int arr[] = new int[] { 10, -25, -45, -35, 5};
		//int arrSal[]= new int [] { 20000,100000,90000 };
		String s = "������� ";
		Boolean isEncode = false;
		//var S = "12345";
		//var subs = "12";
		//var M = 4;
		//var L = 6;

		// System.out.println(squirrel(a));
		// System.out.println(odometer(arr));
		// System.out.println(ConquestCampaign(N, M, L, arr));
		//System.out.println(Arrays.toString(MadMax(N, arr)));
		//System.out.println(Arrays.toString(SynchronizingTables(N, arrId, arrSal)));
		//System.out.println(PatternUnlock(N, arr));
		//System.out.println(Arrays.toString(WordSearch(N, S, subs)));
		//System.out.println(SumOfThe(N, arr));
		System.out.println(TheRabbitsFoot(s, isEncode));
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

	public static int [] WordSearch(int len, String s, String subs) {
		
		// �������� ������ �� �����. � ���������� ��������� ������ � ������� ������
		// ������ ����� � ��������� �������.
		String[] arrStr = s.split(" ");
		
		
		// ���� � ������������ ������� ���� ������
		if (arrStr.length <= 1) {
			var str = "";
			int[] arr;
			var steps = 0;
			
			// � ���� ������ ����� ������ ���������
			if (len > s.length()) {
				//���� ����� �������� ������ ��� ���� �����, ����� ��� �� ����� ������ �� ���� ���������
				arr = new int[arrStr.length];
			} else {
				// ���� ����� ������ �� ��� ����������� ��� ���� ������� ���� �� ������� ������� ����� ����� ��������
				arr = new int[arrStr.length + 1];
			}
			// ������� ��� ������ � ��������� ��������� � ������
			for (int k = 0; k < arr.length; k++) {

				for (int l = steps; l < arrStr[0].length(); l++) {
					
					str += arrStr[0].charAt(l);
					if (str.equals(subs)) {
						arr[k] = 1;							
					}
					
					// ������ ����� ������� �����
					if (l + 1 == len) {
						if (str.equals(subs)) {
							arr[k] = 1;							
						}
						// ������� ������
						str = "";
						steps = l + 1;
						break;
					}
					
					steps += 1;
				}
			}
			System.out.println(Arrays.toString(arrStr));
			return arr;
		}

		else {
		
		// ��������� ���������� ������ � ������������ � ��������.
		// � ������ �������� ����� ���� ������ �� ������ len ��������. �������� �����
		// ������ �� �������.
		String[] res = new String[arrStr.length];

		int counterStep = 0;
		int firstStep = 0;
		int j = 0;

		// ������� ������ ������, ��������� ��� ���� ������ �� �������� � ��������� �
		// ������ ������� ������� ������� �������� �� ������� �����. 
		//������� ����� ����� �������� �� ��������� len.

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
					// ������� ����� ��� ���������� �����.
					word = "";
				}
			}

		}

		System.out.println(Arrays.toString(res));

		return result;
		}	
	}
	
	public static int SumOfThe(int N, int[] data) {

		int num = 0;
		int sum = 0;

		for (int i = 0; i <= N; i++) {

			// ����� �������, ��� ��� ����� ���� ����� � �������. �������� ���
			num = data[i];
			// �������� ��� ����� � ������ �������
			int tmp = data[0];
			data[0] = num;
			data[i] = tmp;

			for (int j = 1; j < data.length; j++) {

				// ��������� ����� ���� ����� � �������
				sum += data[j];
			}
			// ������� ����� � ������ � ����� num
			if (num == sum) {
				// ������� ����
				break;
			}
			// ������� �����
			sum = 0;
		}
		// ������ ���������
		return num;
	}

	public static String TheRabbitsFoot(String s, Boolean encode) {

		// ������ ������� � ������ ��������� � ������ ����������
		var str = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				str += s.charAt(i);
			}
		}
		// ��������� ����� ����� � �������� �� ��� ���������� ������
		int N = str.length();
		double srt = Math.sqrt(N);

		// �������� �� 2� ������ ����� �������
		String result = String.format("%.2f", srt);
		System.out.println(result);

		// �� ������������ ��������� ����� �������� 2 ����� 
		var charA = ""; // ������ �������
		var charB = ""; // ������� �������

		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) != ',') {
				charA += result.charAt(i);
			}
			else {
				charB += result.charAt(i + 1);
				break;
			}
		}

		// ����������� � int
		int line = Integer.parseInt(charA);
		int column = Integer.parseInt(charB);

		// ���������� ������� ������� ���� ������ ���� �����
		int k = 1;
		while (column * line < N) {
			// ��������� ������ ���� ����� �� ������
			line += k;
			k++;
		}
		System.out.println(column);
		System.out.println(line);

		// ������ ����� ����������. �������� ��������� ������ �� ���� ���������. �������
		// � �������.
		String[][] matrix = new String[line][column];
		fillInSpace(matrix);
		
		if (encode == true) {
			// ������� ���� ����� � ������ (���������)
			var counter = 0;
			// ���� �� �������
			for (var i = 0; i < matrix.length; i++) {
				// ���� �� M ����������� (���������)
				for (var j = 0; j < matrix[i].length; j++) {

					if (counter < str.length()) {
						matrix[i][j] += str.charAt(counter);
						counter += 1;
					}
				}
			}
			// ������� ���� �����
			str = "";

			// ������ ������������� ��������� ������� � ���������
			for (int i = 0; i < column; i++) {
				for (int j = 0; j < line; j++) {

					str += matrix[j][i];
				}
				//������� ������
				str += " ";
			}
			return str;

		} else {
			// �������������� ������
			// ������� ������ � ��������� ������ 
			var counter = 0;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {

					if (counter < str.length()) {
						matrix[i][j] += str.charAt(counter);
						counter += 1;
					}

				}
			}

			System.out.println(Arrays.deepToString(matrix));

			// �������� ��� ���� ������ ���� ����� ���������� �������� �� ������ 
			// ��������� ������ ������ matrix ��� "�����"
			String[][] matrix2 = new String[line][column];
			fillInSpace(matrix2);

			var step = 0;
			for (int i = 0; i < column; i++) {
				for (int j = 0; j < line; j++) {

					if (matrix[j][i] != "") {
						if (step < str.length()) {
							matrix2[j][i] += str.charAt(step);
							step += 1;
						}
					}
				}
			}
			System.out.println(Arrays.deepToString(matrix2));

			// ������ ���������
			str = "";
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2[i].length; j++) {
					
					if (matrix2[i][j] != "") {
					str += matrix2[i][j];
					}
				}
			}

			return str;
		}
	}
	//������� ��������� ���������� �� ��������� ������ ���������
	public static String[][] fillInSpace(String[][] arrName) {

		// �������� ������ ��������� ������ ���
		for (int i = 0; i < arrName.length; i++) {
			for (int j = 0; j < arrName[i].length; j++) {
				arrName[i][j] = "";
			}
		}
		return arrName;
	}
}
