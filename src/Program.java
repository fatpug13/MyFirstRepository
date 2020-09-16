import java.util.*;

public class Program {

	public static void main(String[] args) {
		// var a = 5;
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 2, 7, 8, 9 };
		//int arrSal[]= new int [] { 20000,100000,90000 };
		var N = 9;
		//var M = 4;
		//var L = 6;

		// System.out.println(squirrel(a));
		// System.out.println(odometer(arr));
		// System.out.println(ConquestCampaign(N, M, L, arr));
		//System.out.println(Arrays.toString(MadMax(N, arr)));
		//System.out.println(Arrays.toString(SynchronizingTables(N, arrId, arrSal)));
		System.out.println(PatternUnlock(N, arr));
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
		
		// создаем двумерный массив по пришедшим размерам
		int[][] battleground = new int[N][M];

		// Высадка по начальным координатам. 1й день
		for (var g = 0; g <= battalion.length - 1;) {

			var coordinateN = battalion[g];
			var coordinateM = battalion[g + 1];

			battleground[coordinateN - 1][coordinateM - 1] = 1;
			g = g + 2;

		}
		
		// проверим, не захвачены ли все территории в 1й день
		var currentDay = 1;
		if (M * N == L) {
			return currentDay = 1;
		} else {

			// наступил следующий день (2й) и val - условие выхода из цикла
			currentDay = 2;
			var val = 0;

			// Начинаем захват со второго дня
			do {
				// обойдем массив в цикле. Цикл по N координатам (строкам)
				for (var i = 0; i < battleground.length; i++) {

					// цикл по M координатам (столбцамы)
					for (var j = 0; j < battleground[i].length; j++) {

						// Найдем заполненные элменты массива в первый день высадки
						if (battleground[i][j] != 0) {

							// Захват территори происходит в 4 направлениях (крестом). Если элемент содержит
							// не ноль и текущий день,
							// то захватывать не надо.
							if (battleground[i][j] < currentDay) {

								// сдвиг по строке влево
								// Индекс в границе массива?
								if (j - 1 >= 0) {
									// значение заполнено нулем?
									if (battleground[i][j - 1] == 0) {
										battleground[i][j - 1] = currentDay;
									}
								}
								// сдвиг по строке вправо
								// Индекс в границе массива?
								if (j + 1 <= battleground[i].length - 1) {
									// значение заполнено нулем
									if (battleground[i][j + 1] == 0) {
										battleground[i][j + 1] = currentDay;
									}
								}
								// сдвиг вниз
								// Индекс в границе массива?
								if (i + 1 <= battleground.length - 1) {
									// значение заполнено нулем?
									if (battleground[i + 1][j] == 0) {
										battleground[i + 1][j] = currentDay;
									}
								}
								// сдвиг вверх
								// Индекс в границе массива?
								if (i - 1 >= 0) {
									// значение заполнено нулем?
									if (battleground[i - 1][j] == 0) {
										battleground[i - 1][j] = currentDay;
									}
								}
							}
						}

					}

				}

				// Если в массиве есть ноль, значит нам нужен еще один день для захвата
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

			// минус 1 день т.к. цикл начался со 2го (в 1й день была высыдка)
			return currentDay - 1;
		}
	}
	
	public static  int [] MadMax(int N, int [] Tele) {
		
		// отсортируем массив по возрастанию
		Arrays.sort(Tele);
		System.out.println(Arrays.toString(Tele));
		
		// Разделим массив на две части
		// Создаем временный массив. Левая часть
		int[] leftPart = Arrays.copyOfRange(Tele, 0, Tele.length / 2);
		System.out.println(Arrays.toString(leftPart));

		// Создаем временный массив. Правая часть
		int[] rightPart = Arrays.copyOfRange(Tele, Tele.length / 2, Tele.length);

		// Отсортируем правую часть по убыванию
		for (int i = 0, j = rightPart.length - 1, tmp; i < j; i++, j--) {
			tmp = rightPart[i];
			rightPart[i] = rightPart[j];
			rightPart[j] = tmp;
		}
		System.out.println(Arrays.toString(rightPart));

		// Соединим разделенные массивы в один
		int[] result = new int[leftPart.length + rightPart.length];
		
		// Чтобы запомнить на каком элемете мы остановились после записи левой части в результ. массив
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
		
		// Нельзя трогать массив сотрудников. Отсортируем по возрастанию массив зарплат
		Arrays.sort(arrSal);
		
		// его будем возхвращать
		int result[] = new int [N];
		
		// Перепишем массив айди сотрудников в другой массив
		int sortAarrId[] = new int [N];
		
		for (int i = 0; i < arrId.length; i ++) {
			sortAarrId[i] = arrId[i];
		}
		// Отсортируем массив айди сотрудников по возрастанию
		Arrays.sort(sortAarrId);
		
		// Теперь массив зарплат и массив айди сопоставлен.
		// обойдем массив arrId и на каждой итерации будем сравнивать значение из arrId и arrayId и если они равны тогда
		// запишем в результирующий массив res значение из массива зарплат arrSal под индексом соответствующий arrId.
		
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

		// Обойдем массив hits и посчитаем результат
		for (int i = 0; i < hits.length - 1; i++) {

			// Если хоть одно из условий стработает это значит, мы перемещаемся по диагонали
			// Получается прямоугольный треугольник.
			// Найдем гипотенузу т.к. нам неизвестно расстояние между точками по диагонали.
			// Известно лишь расстояние по
			// вертикали и по горизонтали, оно равно 1. Будем считать их катетами. 1 в
			// степени 2 + 1 в степени 2 = 2.
			// Нам нужно извлечь квадратный корень из 2.

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
				// идем по вертикали или горизонтали
				onlyInt = onlyInt + 1;
			}

		}

		// Итого
		result = result + onlyInt;

		System.out.println(result);

		// Округлим до 5 знаков после запятой, преобразуя результат в строку.
		String res = String.format("%.5f", result);

		// Окончательный результат
		var finalResult = "";
		// обойдем результат и уберем "0" и ",".
		for (int i = 0; i < res.length(); i++) {
			if (res.charAt(i) != '0' && res.charAt(i) != ',') {
				finalResult += res.charAt(i);
			}
		}

		return finalResult;
	}

}
