
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;





public class Program {
	//Для функции BastShoe
	static boolean undoComm = false;
	static int counterIter = 1;
	static LinkedList<String> historyCommand1And2 = new LinkedList<String>();
	static LinkedList<String> historyAllCommand = new LinkedList<String>();
	//
	public static void main(String[] args) throws IOException {

		/*
		 * Вызов функций.
		 */
//		String arr[] = new String[] {"123456", "234567", "345678", "456789"};
//		int arr[] = new int[] {3, 2, 1};
		int arr[] = new int[] {5,4,3,2,1};
//		var M = 4;
		var N = 5;
//		var T = 2;
//		String str = "**";
//		var a = 5;
//		int[][] arr = new int[][] { { 3, 6, 2 }, { 6, 2, 2 } };
//		var N = "1 Привет";
//		int arr[] = new int[]{1,3,4,5,6,3,3,3,3,3};
//		String arr[] = new String[] {"платье1 5", "сумка32 2","платье1 1","сумка23 2","сумка128 9"};
//		String s1 = "123";
//		String s2 = "132";
//		Boolean octal = false;
//		var S = "12345";
//		var S1 = "1234 2345 0987";
//		var S2 = "34 98";
//		var H1 = 3;
//		var W1 = 4;
//		var H2 = 2;
//		var W2 = 2;
//		System.out.println(squirrel(a));
//		System.out.println(odometer(arr));
//		System.out.println(ConquestCampaign(N, M, L, arr));
//		System.out.println(Arrays.toString(MadMax(N, arr)));
//		System.out.println(Arrays.toString(SynchronizingTables(N, arrId, arrSal)));
//		System.out.println(PatternUnlock(N, arr));
//		System.out.println(Arrays.toString(WordSearch(N, S, subs)));
//		System.out.println(SumOfThe(N, arr));
//		System.out.println(TheRabbitsFoot(s, isEncode));
//		System.out.println(PrintingCosts(s));
//		System.out.println(BigMinus(s1, s2));
//		System.out.println(MassVote(N, arr));
//		System.out.println(Arrays.toString(UFO(N, arr, octal)));
//		System.out.println(Unmanned(L, N, arr));
//		System.out.println(TankRush(H1, W1, S1, H2, W2, S2));
//		System.out.println(MaximumDiscount(N, arr));
//		System.out.println(LineAnalysis(str));
//		System.out.println(MisterRobot(N, arr));
//		System.out.println(Arrays.toString(ShopOLAP(N, arr)));
//		System.out.println(BastShoe(sc.nextLine()));
//		System.out.println(BiggerGreater(sc.nextLine()));
//		System.out.println(SherlockValidString(sc.nextLine()));
//		System.out.println(Arrays.toString(TreeOfLife(3,4, 4, arr)));
//		MatrixTurn(arr,M,N,T);
//		System.out.println(TransformTransform(arr, N));
//		System.out.println(BalancedParentheses(N));
		System.out.println(Football(arr, N));

//		Scanner sc = new Scanner("xyz\n" + "xyzaa\n" + "xxyyz\n" + "xyzzz\n" + "xxyyza\n" + "xxyyzabc\n"+ "xx\n"); 
//		//"xyzzz\n" + "xxyyza \n" + "xxyyzabc\n"+ "xx\n" + 
//
//		while (sc.hasNext()) {
//			System.out.println(SherlockValidString(sc.nextLine()));
//
//		}
//		sc.close();
		
	}

	public static int squirrel(int N) {
		/*
		 * ... вернуть строкой первое число факториала ...
		 */

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

		/*
		 * Поездка на мотоцикле Олег катает Оксану на мотоцикле. Счётчик километража на
		 * мотоцикле не работает, но Оксана следит за временем в поездке, и за текущей
		 * скоростью. Олег хочет установить рекорд дальности совместной поездки, и
		 * просит Оксану выяснить километраж. Функция int odometer(int [] oksana)
		 * получает параметром массив N целых чисел (N >= 2) с индексацией с нуля, в
		 * котором каждый чётный элемент содержит скорость в километрах в час, а каждый
		 * нечётный элемент содержит время, прошедшее с начала поездки, в часах.
		 * Возвращает функция общее пройденное расстояние. Например, на входе массив
		 * [10,1,20,2], на выходе расстояние 30.
		 * 
		 */

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

	public static int ConquestCampaign(int N, int M, int L, int[] battalion) {

		/*
		 * Освобождение Государства Квадратов Государство Кругов подготовило группу
		 * элитных десантников, которые должны в кратчайший срок спасти соседнюю
		 * братскую страну -- Государство Квадратов, где внезапно начались гражданские
		 * бунты против интернета. Территория Государства Квадратов представляет собой
		 * прямоугольник из NxM квадратных областей, где каждая область имеет координаты
		 * 1 .. N , 1 .. M. Десантники в день 1 высаживаются в L областей, заданных их
		 * координатами (x1, y1), (x2,y2), ... , (xl, yl) и защищают их от бунтовщиков.
		 * На следующий день (день 2) они захватывают все соседние области, прилегающие
		 * к этим областям с четырёх сторон (по вертикали и горизонтали), и далее каждый
		 * следующий день этот процесс повторяется, пока не будут взяты под контроль все
		 * бунтующие области без исключения. Генштаб Государства Кругов требует точный
		 * план освобождения Государства Квадратов -- на какой день оно будет полностью
		 * контролироваться десантниками. Например: В первый день под контроль взяты две
		 * области (заштрихованы); во второй -- 8 областей (две с первого дня, сплошные
		 * синие, и шесть в текущий день, заштрихованы). В третий день (результирующее
		 * значение -- 3) вся территория Государства Квадратов оказывается под контролем
		 * десантников. Функция int ConquestCampaign(int N, int M, int L, int []
		 * battalion) получает первыми двумя параметрами размер Государства Квадратов
		 * NxM, а battalion содержит массив из L*2 целых чисел (L >= 1) с индексацией с
		 * нуля, в котором каждый чётный элемент содержит очередную координату области
		 * высадки по первому измерению N, а каждый нечётный элемент содержит очередную
		 * координату области высадки по второму измерению M. Не исключено, что в связи
		 * с неразберихой в командовании координаты областей высадки могут
		 * дублироваться. На примере с картинки параметры будут такими: N = 3, M = 4, L
		 * = 2, battalion = [2,2, 3,4] Возвращает функция день, начиная с 1, когда все
		 * области будут взяты под контроль.
		 * 
		 */

		// создаем двумерный массив по пришедшим размерам
		int[][] battleground = new int[N][M];

		// высадка по начальным координатам. 1й день
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

							// Захват территори происходит в 4 направления (крестом). Если элемент содержит
							// не ноль и текущий день, то захватывать не надо.
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
									// значение заполнено нулем?
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

	public static int[] MadMax(int N, int[] Tele) {

		/*
		 * Бортовой софт Перехватчика генерирует телеметрический массив --
		 * неповторяющиеся целые числа в диапазоне от 0 до 255, общим количеством N
		 * (длина массива), которое всегда нечётно. В общем случае эти значения в
		 * массиве будут случайно перемешаны. 1 <= N <= 127 Для достижения максимального
		 * количества оборотов двигателю требуется корректный стартовый импульс. Он
		 * представляет собой массив, центральным элементом которого будет максимальное
		 * его значение, все левые элементы упорядочены по возрастанию (причём первый
		 * левый элемент -- самый минимальный в массиве), а все правые -- по убыванию.
		 * Например, на входе массив из семи элементов, N=7: 1 2 3 4 5 6 7 Эти элементы
		 * могут быть случайно перемешаны. На выходе должно быть: 1 2 3 7 6 5 4 Функция
		 * int [] MadMax(int N, int [] Tele) получает на вход массив Tele из N чисел, и
		 * возвращает результирующий массив-импульс.
		 * 
		 */

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

		// Чтобы запомнить на каком элемете мы остановились после записи левой части в
		// результ. массив
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

	public static int[] SynchronizingTables(int N, int[] arrId, int[] arrSal) {

		/*
		 * Взятый на прошлой неделе на работу джуниор Олег случайно удалил в базе
		 * таблицу, в которой хранилась информация о взаимосвязях учётных номеров
		 * сотрудников и их зарплат. Только вы помните на память алгоритм этой связи;
		 * требуется срочно восстановить таблицу и сформировать ведомость зарплат в
		 * точном соответствии зарплаты и номера сотрудника. Номера сотрудников -- это
		 * целые положительные числа. Они некоторым особо упорядоченным способом
		 * хранятся в списке сотрудников; номер каждого сотрудника уникален,
		 * повторяющихся нету. Пример списка сотрудников: [50, 1, 1024] Зарплаты -- тоже
		 * целые положительные числа. Они хранятся в отдельном списке зарплат, по
		 * размеру равном списку сотрудников, но могут повторяться по значениям. Пример
		 * списка зарплат: [20000, 100000, 90000] Известно, что список сотрудников
		 * однозначно соответствует списку зарплат, если отсортировать по возрастанию
		 * список номеров и список зарплат. То есть номеру 50 соответствует зарплата
		 * 90000, номеру 1 - 20000, номеру 1024 -- 100000. Ваша задача -- перестроить
		 * список зарплат, не трогая список номеров, так, чтобы соблюдалось правильное
		 * соответствие номер-зарплата. В данном примере список зарплат должен
		 * получиться таким: [90000, 20000, 100000] Функция int []
		 * SynchronizingTables(int N, int [] ids, int [] salary) получает параметром N
		 * длину обоих массивов. Параметр ids -- массив, содержащий номера сотрудников,
		 * параметр salary -- массив, содержащий зарплаты. Возвращает функция массив,
		 * содержащий переупорядоченные зарплаты.
		 * 
		 */

		// Нельзя отсортировать массив сотрудников. Отсортируем по возрастанию массив
		// зарплат
		Arrays.sort(arrSal);

		// Результат запишем в массив result
		int result[] = new int[N];

		// Запишем в новый массив айди сотрудников.
		int sortAarrId[] = new int[N];

		for (int i = 0; i < arrId.length; i++) {
			sortAarrId[i] = arrId[i];
		}
		// Отсортируем его
		Arrays.sort(sortAarrId);

		// Теперь массив зарплат и массив айди сотрудников сопоставлен.
		// обойдем массив arrId и на каждой итерации будем сравнивать значени из arrId
		// и sortAarrayId и если они равны тогда
		// запишем в массив result значение из массива зарплат arrSal под
		// индексом соответствующий arrId.

		for (int i = 0; i < arrId.length; i++) {
			for (int j = 0; j < sortAarrId.length; j++) {

				if (arrId[i] == sortAarrId[j]) {
					result[i] = arrSal[j];
				}

			}
		}

		return result;
	}

	public static String PatternUnlock(int N, int[] hits) {

		/*
		 * Разблокировка мобильных телефонов Код блокировки мобильных телефонов не умеют
		 * взламывать даже спецслужбы, однако хакерская группировка Анонимусы-80
		 * добралась до исходников операционной системы, и выяснила способ его почти
		 * мгновенного взлома. Оказывается, достаточно лишь посчитать длину линии,
		 * рисуемой в процессе взлома кода, после чего округлить её до пятого знака, и
		 * нажать пальцем на соответствующие цифры, пропуская нули, как телефон
		 * разблокируется. Ломаная линия разброкировки представляет собой
		 * последовательность цифр от 1 до 9, соответствующих точкам на этой картинке,
		 * причем гарантируется, что от точки переход совершается только к её ближайшим
		 * соседям (нету перепрыгиваний, например из точки 8 в точку 5). Расстояние
		 * между точками по вертикали или горизонтали считается единичным. На рисунке
		 * представлена такая последовательность: 1 2 3 4 5 6 2 7 8 9 Её длина
		 * приблизительно равняется 1 + 1 + 1 + 1 + 1 + 1.41.. + 1.41.. + 1 + 1 =
		 * 9.82843 (точность требуется пять цифр после запятой) Результат: строка
		 * "982843" Если бы результат получился, например, 10.012, то результирующая
		 * строка получилась бы "112" (все нули удаляются). Функция string
		 * PatternUnlock(int N, int [] hits) получает параметром N длину массива с
		 * кодами разблокировки, а сам массив hits содержит последовательность кодов
		 * разблокировки -- номера точек в диапазоне от 1 до 9. Возвращает функция
		 * строку, как в примере выше.
		 * 
		 */

		double result = 0;
		double hypot = 0;
		int onlyInt = 0;

		// Обойдём массив hits и посчитаем результат
		for (int i = 0; i < hits.length - 1; i++) {

			/*
			 * Если хоть одно из условий сработает то значит, мы перемещаемся по диагонали
			 * Получается прямоугольный треугольник. Найдём гипотенузу т.к. нам неизвесстно
			 * расстонием между точками по диагонали. Известно лишь расстояние по вертикали
			 * и горизонтали, оно равно 1. Будем считать их катетами. 1 в степени 2 1 в
			 * степени 2 = 2. Нужно извлечь квадратный корень из 2.
			 */
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
				// идем по ветикали или горизонтали
				onlyInt = onlyInt + 1;
			}

		}

		result = result + onlyInt;

		System.out.println(result);

		String res = String.format("%.5f", result);

		var finalResult = "";

		for (int i = 0; i < res.length(); i++) {
			if (res.charAt(i) != '0' && res.charAt(i) != ',') {
				finalResult += res.charAt(i);
			}
		}

		return finalResult;
	}

	public static int[] WordSearch(int len, String s, String subs) {

		/*
		 * Конкурент Google Ваш стартап получил миллионные инвестиции на создание нового
		 * поискового движка. Требуется срочно реализовать базовый алгоритм поиска,
		 * чтобы отчитаться перед инвесторами. На вход алгоритма поступает текстовая
		 * строка достаточно большой длины. Все слова в ней разделены ровно одним
		 * пробелом. Алгоритм обрабатывает строку в два шага: 1) строка разбивается на
		 * набор строк через выравнивание по заданной ширине. Разбивать строку
		 * разрешается только в местах пробелов, слова надо переносить целиком.
		 * Например, имеется строка 1) строка разбивается на набор строк через
		 * выравнивание по заданной ширине. и задана ширина разбивки 12. Тогда на первом
		 * шаге будет получена такая последовательность строк: 1) строка разбивается на
		 * набор строк через выравнивание по заданной ширине. Пустые строки в такой
		 * разбивке полностью исключаются. Если ширина разбивки меньше какого-то слова,
		 * то это слово разбивается на несколько (с переносом на следующую строку). 2)
		 * Каждая строка проверяется на наличие в ней заданного целого слова
		 * (ограниченного либо пробелами, либо началом/концом строки). Результат работы
		 * алгоритма -- последовательность целых чисел 1 или 0, которые показывают,
		 * имеется ли в соответствующей строке запрошенное слово. Например, для слова
		 * "строк" результат будет таким: 0 0 0 1 0 0 0. Функция int [] WordSearch(int
		 * len, string s, string subs) получает параметром len ширину выравнивания, саму
		 * строку в параметре s, и проверяемое слово в параметре subs. Возвращает
		 * функция массив целых чисел, содержащий 1 или 0 (признаки нахождения слова в
		 * соответствующей строке).
		 * 
		 */

		// разобьем строку на слова. В результате получится массив в котором каждая
		// строка лежит в отдельном индексе.
		String[] arrStr = s.split(" ");

		// Если в получившемся массиве одна строка
		if (arrStr.length <= 1) {
			var str = "";
			int[] arr;
			var steps = 0;

			// в этот массив будем писать результат
			if (len > s.length()) {
				arr = new int[arrStr.length];
			} else {
				// если длина разбивки больше чем само слово,
				// тогда нам не нужен массив из двух элементов
				arr = new int[arrStr.length + 1];
			}

			// обойдем эту строку и перепишем результат в массив
			for (int k = 0; k < arr.length; k++) {

				for (int l = steps; l < arrStr[0].length(); l++) {

					str += arrStr[0].charAt(l);
					if (str.equals(subs)) {
						arr[k] = 1;
					}

					// Пришло время разбить слово
					if (l + 1 == len) {
						if (str.equals(subs)) {
							arr[k] = 1;
						}

						// очистим строку
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

			// Перепишем полученный массив в соответствии с заданием.
			// В каждом элементе может быть строки не больше len символов.
			// Обрезать слова только по пробелу.
			String[] res = new String[arrStr.length];

			int counterStep = 0;
			int firstStep = 0;
			int j = 0;

			// обходим пустой массив, перебирая при этом массив со строками и добавляем в
			// каждый элемент пустого массива значение из массива строк.
			// Смотрим чтобы длина значения не превышало len.
			for (int i = 0; i < res.length; i++) {

				for (; j < arrStr.length; j++) {
					counterStep = 0;
					firstStep = 0;

					// длина слова меньше заданного количесва символов
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
									// добавили очередное слово со следующего индекса
									counterStep += 1;
								}
							} else if (res[i].length() + arrStr[j].length() > len) {
								break;
							}
						}
					}

				}
				// на самом первом шаге записали слово и больше не лезет. сдвинем на 1
				if (firstStep == 1 && counterStep == 0) {
					j += 1;
				} else {
					j += counterStep;
				}

			}

			// уберем null значения из массива
			res = Arrays.stream(res).filter(d -> (d != null && d.length() > 0)).toArray(String[]::new);

			int[] result = new int[res.length];
			var word = "";

			// Обойдем полученный массив и найдем в нем нужное слово.
			for (int i = 0; i < res.length; i++) {

				// Обойдем циклом каждое значение в массиве.
				for (int n = 0; n < res[i].length(); n++) {
					// не будем добавлять проблеы к слову
					if (res[i].charAt(n) != ' ') {
						// по буквам составляем слово.
						word += res[i].charAt(n);
					}
					// Если перед нами пробел, значит конец слова.
					if (res[i].charAt(n) == ' ') {
						// Проверим, наше слово на совпадение.
						if (word.equals(subs)) {
							result[i] = 1;
						}
						// осводим место для следующего слова
						word = "";
					}
				}

			}

			System.out.println(Arrays.toString(res));
			return result;
		}
	}

	public static int SumOfThe(int N, int[] data) {

		/*
		 * Искусственный интеллект для Оксаны Оксана работает бухгалтером и каждый день
		 * выгружает из компьютера сводку за прошедшие сутки, которая содержит все
		 * приходы и расходы организации и итог. В сводке записаны только целые числа, и
		 * точно известно, что самое последнее число есть сумма всех предыдущих чисел.
		 * Например, варианты сводок: 100 -50 10 -25 90 -35 90 5 -25 10 -35 -45 Эти
		 * сводки Оксана красиво оформляет в отчёте так: +100 - 50 + 10 - 25 + 90 - 35 =
		 * +90 или так: +5 - 25 + 10 - 35 = -45 Но однажды, придя на работу, Оксана
		 * обнаружила, что компьютер заразился вирусом и принялся из вредности путать
		 * числа в сводке. Например, вместо 5 -25 10 -35 -45 он выдаёт явно ошибочное 10
		 * -25 -45 -35 5 ! Оксана попросила программиста Олега, специализирующегося на
		 * искусственном интеллекте, помочь ей срочно подготовить правильные отчёты.
		 * Помогите Оксане -- напишите алгоритм, который будет находить в сводке число,
		 * равное сумме всех остальных чисел. Функция int SumOfThe(int N, int []
		 * data)получает параметром N длину всей сводки (N >= 2), и далее в массиве
		 * длиной N хранится сама сводка (целые числа). Возвращает функция целое число
		 * из сводки, которое равно сумме всех остальных чисел.
		 * 
		 */

		int num = 0;
		int sum = 0;

		for (int i = 0; i <= N; i++) {

			// будем считать, что это сумма всех чисел в массиве. проверим это
			num = data[i];
			// поместим это число в начало массива
			int tmp = data[0];
			data[0] = num;
			data[i] = tmp;

			for (int j = 1; j < data.length; j++) {
				// посчитаем сумму всех числе в массиве
				sum += data[j];
			}
			// сравним сумму с числом в перем num
			if (num == sum) {
				// прервем цикл
				break;
			}

			sum = 0;
		}

		return num;
	}

	public static String TheRabbitsFoot(String s, Boolean encode) {

		/*
		 * Миссия невыполнима: Красный портфель Итан Хант с невероятным трудом
		 * пробирается в секретное хранилище данных Синдиката, в подводный бункер под
		 * электростанцией. На добытой им флешке хранятся детали банковских счетов
		 * верхушки Синдиката на сумму несколько миллиардов долларов, однако она закрыта
		 * "красным портфелем" -- очень сложной технологией шифрования. Ваша миссия:
		 * реализовать алгоритм шифрования "Красного портфеля", который не под силу даже
		 * специалистам MI-6. На вход программы подаётся строка текста, состоящая из
		 * строчных букв и пробелов. Из строки удаляются все пробелы и определяется её
		 * длина N. На основании N вычисляется размер матрицы, в которую будет упакован
		 * исходный текст: из N извлекается квадратный корень, и его нижняя граница
		 * берётся как число строк матрицы, а верхняя граница -- как число столбцов.
		 * Если их произведение меньше N, увеличивайте количество строк. Например, есть
		 * строка текста отдай мою кроличью лапку Она преобразуется в
		 * отдаймоюкроличьюлапку Длина этой строки -- 21, квадратный корень -- 4.58. 21
		 * элемент в матрицу размером 4x5 элементов не упаковывается, значит, берём
		 * матрицу 5x5: отдай моюкр оличь юлапк у И наконец выдаём зашифрованный
		 * результат, выдавая символы по столбцам сверху вниз и слева направо, и
		 * разделяя столбцы пробелами: омоюу толл дюиа акчп йрьк Напишите код,
		 * зашифровывающий текстовое сообщение, и декодировщик, расшифровывающий его.
		 * Функция string TheRabbitsFoot(string s, bool encode) получает исходную строку
		 * s и либо зашифровывает её (encode = true), либо расшифровывает (encode =
		 * false), только конечно без исходных пробелов.
		 */

		// Удалим пробелы в строке переписав в другую переменную
		var str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				str += s.charAt(i);
			}
		}
		// Определим длину слова и вычислим из нее квадратный корень
		int N = str.length();
		double srt = Math.sqrt(N);

		// Округлим до 2х знаков после запятой
		String result = String.format("%.2f", srt);
		System.out.println(result);

		// из округленного результат нужно получить 2 цифры
		var charA = ""; // нижняя граница
		var charB = ""; // верхняя граница

		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) != ',') {
				charA += result.charAt(i);
			} else {
				charB += result.charAt(i + 1);
				break;
			}
		}

		// преобразуем в int
		int line = Integer.parseInt(charA);
		int column = Integer.parseInt(charB);

		// Необходимо создать матрицу куда влезет наше слово
		int k = 1;
		while (column * line < N) {
			// Добавляем строку пока слово не влезет
			line += k;
			k++;
		}
		System.out.println(column);
		System.out.println(line);

		// Теперь слово помещается. Созданим двумерный массив по этим значениям.
		String[][] matrix = new String[line][column];
		fillInSpace(matrix);

		if (encode == true) {
			// Запишем наше слово в массив (зашифруем)
			var counter = 0;
			// цикл по строкам
			for (var i = 0; i < matrix.length; i++) {
				// цикл по M координатам (столбцамы)
				for (var j = 0; j < matrix[i].length; j++) {

					if (counter < str.length()) {
						matrix[i][j] += str.charAt(counter);
						counter += 1;
					}
				}
			}
			// очистим наше слово
			str = "";

			// вернем зашифрованный результат строкой с пробелами
			for (int i = 0; i < column; i++) {
				for (int j = 0; j < line; j++) {
					if (matrix[j][i] != "") {
						str += matrix[j][i];
					}
				}
				// Добавим пробел. Чтобы избежать добавление пробела в
				// конце последнего столбца, добавим проверку.
				if (i + 1 != column) {
					str += " ";
				}
			}
			return str;

		} else {
			// расшифровываем строку
			// запишем строку в двумерный массив
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

			// Создадим еще один массив куда будем записывать значения из строки
			// используя первый массив matrix как "карту"
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

			// вернем результат
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

	public static String[][] fillInSpace(String[][] arrName) {
		/*
		 * Функция заполняет переданный ей двумерный массив пробелами
		 */

		// Заполним массив пробелами вместо null
		for (int i = 0; i < arrName.length; i++) {
			for (int j = 0; j < arrName[i].length; j++) {
				arrName[i][j] = "";
			}
		}
		return arrName;
	}

	public static int PrintingCosts(String Line) {

		/*
		 * Экономим тонер Ваш босс очень экономный человек. Он намерен ввести в
		 * организации очень строгие требования по расходованию тонера в принтерах. Для
		 * этого он хочет выявить сотрудников, которые пишут тексты, требующие
		 * повышенного расхода тонера. Ваша задача -- написать драйвер, который
		 * перехватывает текст, отсылаемый на принтер, и скрытно записывает в базу
		 * количество тонера, требуемого для его печати. Каждый символ требует свой
		 * объём тонера. Пробел, очевидно, вообще не расходует ресурсы, а вот например
		 * амперсанд @ подразумевает расход аж 32 условных единиц тонера. В документации
		 * к принтеру имеется таблица раскладки символов ASCII и соответствующего им
		 * объёма тонера. Используйте её, чтобы оценить расход тонера на печатаемый
		 * текст. (пробел) 0 ! 9 " 6 # 24 $ 29 % 22 & 24 ' 3 ( 12 ) 12 * 17 + 13 , 7 - 7
		 * . 4 / 10 0 22 1 19 2 22 3 23 4 21 5 27 6 26 7 16 8 23 9 26 : 8 ; 11 < 10 = 14
		 * > 10 ? 15 @ 32 A 24 B 29 C 20 D 26 E 26 F 20 G 25 H 25 I 18 J 18 K 21 L 16 M
		 * 28 N 25 O 26 P 23 Q 31 R 28 S 25 T 16 U 23 V 19 W 26 X 18 Y 14 Z 22 [ 18 \ 10
		 * ] 18 ^ 7 _ 8 ` 3 a 23 b 25 c 17 d 25 e 23 f 18 g 30 h 21 i 15 j 20 k 21 l 16
		 * m 22 n 18 o 20 p 25 q 25 r 13 s 21 t 17 u 17 v 13 w 19 x 13 y 24 z 19 { 18 |
		 * 12 } 18 ~ 9 Функция int PrintingCosts(string Line) получает на вход строку
		 * Line. На выходе формируется расход тонера по этой строке, который получается
		 * как сумма расходов тонера по всем символам строки. Если встречается символ,
		 * не учитываемый таблицей из документации, используйте значение 23.
		 * 
		 */

		// уберем пробелы так как значение пробела = 0.
		var str = "";
		for (int i = 0; i < Line.length(); i++) {
			if (Line.charAt(i) != ' ') {
				str += Line.charAt(i);
			}
		}

		// переберем строку без порбелов, отправляя каждый символ в функцию которая
		// определяет, какое значение он имеет.
		var result = 0;
		var currentSymb = "";

		for (int i = 0; i < str.length(); i++) {

			// получим текущий символ в строке
			currentSymb += str.charAt(i);
			// получим значение и прибавим к результату
			result += getSymbolValue(currentSymb);
			// очистим переменную для следующего символа
			currentSymb = "";

		}

		return result;
	}

	public static int getSymbolValue(String symb) {

		/*
		 * Функция возвращает нужное количество тонера, для переданного в неё символа.
		 */

		var result = 0;

		// создадим струтуру "раскладка символов" и заполним ее значениями.
		Map<String, Integer> characterLayouts = new HashMap<String, Integer>();

		characterLayouts.put("&", 24);
		characterLayouts.put(",", 7);
		characterLayouts.put("2", 22);
		characterLayouts.put("8", 23);
		characterLayouts.put(">", 10);
		characterLayouts.put("D", 26);
		characterLayouts.put("J", 18);
		characterLayouts.put("P", 23);
		characterLayouts.put("V", 19);
		characterLayouts.put("\\", 10);
		characterLayouts.put("b", 25);
		characterLayouts.put("h", 21);
		characterLayouts.put("n", 18);
		characterLayouts.put("t", 17);
		characterLayouts.put("z", 19);

		characterLayouts.put("!", 9);
		characterLayouts.put("'", 3);
		characterLayouts.put("-", 7);
		characterLayouts.put("3", 23);
		characterLayouts.put("9", 26);
		characterLayouts.put("?", 15);
		characterLayouts.put("E", 26);
		characterLayouts.put("Q", 31);
		characterLayouts.put("W", 26);
		characterLayouts.put("]", 18);
		characterLayouts.put("c", 17);
		characterLayouts.put("i", 15);
		characterLayouts.put("o", 20);
		characterLayouts.put("u", 17);
		characterLayouts.put("{", 18);

		characterLayouts.put("\"", 6);
		characterLayouts.put("(", 12);
		characterLayouts.put(".", 4);
		characterLayouts.put("4", 21);
		characterLayouts.put(":", 8);
		characterLayouts.put("@", 32);
		characterLayouts.put("F", 20);
		characterLayouts.put("L", 16);
		characterLayouts.put("R", 28);
		characterLayouts.put("X", 18);
		characterLayouts.put("^", 7);
		characterLayouts.put("d", 25);
		characterLayouts.put("j", 20);
		characterLayouts.put("p", 25);
		characterLayouts.put("v", 13);
		characterLayouts.put("|", 12);

		characterLayouts.put("#", 24);
		characterLayouts.put(")", 12);
		characterLayouts.put("/", 10);
		characterLayouts.put("5", 27);
		characterLayouts.put(";", 11);
		characterLayouts.put("A", 24);
		characterLayouts.put("G", 25);
		characterLayouts.put("M", 28);
		characterLayouts.put("S", 25);
		characterLayouts.put("Y", 14);
		characterLayouts.put("_", 8);
		characterLayouts.put("e", 23);
		characterLayouts.put("k", 21);
		characterLayouts.put("q", 25);
		characterLayouts.put("w", 19);
		characterLayouts.put("}", 18);

		characterLayouts.put("$", 29);
		characterLayouts.put("*", 17);
		characterLayouts.put("0", 22);
		characterLayouts.put("6", 26);
		characterLayouts.put("<", 10);
		characterLayouts.put("B", 29);
		characterLayouts.put("H", 25);
		characterLayouts.put("N", 25);
		characterLayouts.put("T", 16);
		characterLayouts.put("Z", 22);
		characterLayouts.put("`", 3);
		characterLayouts.put("f", 18);
		characterLayouts.put("l", 16);
		characterLayouts.put("r", 13);
		characterLayouts.put("x", 13);
		characterLayouts.put("~", 9);

		characterLayouts.put("%", 22);
		characterLayouts.put("+", 13);
		characterLayouts.put("1", 19);
		characterLayouts.put("7", 16);
		characterLayouts.put("=", 14);
		characterLayouts.put("C", 20);
		characterLayouts.put("I", 18);
		characterLayouts.put("O", 26);
		characterLayouts.put("U", 23);
		characterLayouts.put("[", 18);
		characterLayouts.put("a", 23);
		characterLayouts.put("g", 30);
		characterLayouts.put("m", 22);
		characterLayouts.put("s", 21);
		characterLayouts.put("y", 24);

		if (characterLayouts.get(symb) != null) {
			result = characterLayouts.get(symb);
		} else {
			result = 23;
		}

		return result;

	}

	public static String BigMinus(String s1, String s2) {

		/*
		 * Райнехарт и мистер Андерсон РАЙНЕХАРТ Наша компания - ведущая компания по
		 * разработке программного обеспечения в мире. И это все благодаря тому, что
		 * каждый отдельный служащий понимает, что он - часть целого. Таким образом,
		 * если служащий имеет проблему, это означает, что вся компания имеет проблему.
		 * Пока ваша самая большая проблема, мистер Андерсон, что вы не выполнили в срок
		 * рабочее задание. Пришло время делать выбор, мистер Андерсон. Либо вы сейчас
		 * же реализуете вычисление разностей BigInteger, либо вы будете вынуждены
		 * искать другую работу. Я ясно выражаюсь? Требуется вычислить разницу между
		 * двумя целыми неотрицательными числами, заданными своим строковым
		 * представлением (например, "1234567890" и "321"). Числа задаются в диапазоне
		 * от 0 до 10^16 (включительно). В некоторых языках есть поддержка так
		 * называемых BigInteger, которые потенциально не ограничены диапазонами, однако
		 * арифметические операции над ними выполняются не процессором, а эмуляционным
		 * кодом. По сути, для этих операций просто вызываются функции стандартных
		 * библиотек. Возможно, в выбранном вами языке имеется поддержка BigInteger,
		 * однако в данной миссии надо обойтись без них. Придумайте, как вычислять
		 * разность для любых заданных значений. Функция string BigMinus(string s1,
		 * string s2) получает на вход два числа в формате строки (числа всегда
		 * корректные -- набор цифр), и возвращает абсолютное значение (модуль) разности
		 * -- первое число s1 минус второе число s2, также в формате строки. Например,
		 * BigMinus("1234567891", "1") = "1234567890" BigMinus("1", "321") = "320"
		 * 
		 */

		var result = "";
		int k = 0;
		int[] arr1 = null;
		int[] arr2 = null;

		// строка которая длинее, запишем в первый массив
		// т.к. нам можно возвращать результат без минуса
		if (s1.length() > s2.length()) {

			// заполним массив 1 первой строкой а массив 2 втророй строкой

			// проинициализируем массивы
			int lenArr = s1.length() + 1;
			arr1 = new int[lenArr];
			arr2 = new int[lenArr];

			// заполним массивы
			fillArrays(arr1, arr2, s1, s2);

		} else if (s1.length() < s2.length()) {

			// заполним массив 1 второй строкой а массив 2 первой строкой

			// проинициализируем массивы
			int lenArr = s2.length() + 1;
			arr1 = new int[lenArr];
			arr2 = new int[lenArr];

			// заполним массивы. Если вторая строка длинее, поменяем ее местами
			// с первой строкой при вызове функции
			fillArrays(arr1, arr2, s2, s1);

		} else {

			// значит длина одинаковая
			// сравним каждую цифру
			var str = "";
			var numArr1 = 0;
			var numArr2 = 0;

			for (int i = 0; i < s1.length(); i++) {

				// полуим цифру из строки для сравнения
				str += s1.charAt(i);
				numArr1 = Integer.parseInt(str);
				str = "";
				str += s2.charAt(i);
				numArr2 = Integer.parseInt(str);
				str = "";

				if (numArr1 > numArr2) {
					// проинициализируем массивы
					int lenArr = s1.length() + 1;
					arr1 = new int[lenArr];
					arr2 = new int[lenArr];

					// заполним массивы
					fillArrays(arr1, arr2, s1, s2);
					break;
				}
				if (numArr1 < numArr2) {
					// проинициализируем массивы
					int lenArr = s2.length() + 1;
					arr1 = new int[lenArr];
					arr2 = new int[lenArr];

					fillArrays(arr1, arr2, s2, s1);
					break;
				}
			}
		}

		// если все цифры равны тогда запишем первую строку в первый массив
		if (arr1 == null) {
			// проинициализируем массивы
			int lenArr = s1.length() + 1;
			arr1 = new int[lenArr];
			arr2 = new int[lenArr];

			// заполним массивы
			fillArrays(arr1, arr2, s1, s2);
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		// вычитание
		for (int i = 1; i <= arr1[0]; i++) {
			k = k + arr1[i] - arr2[i] + 10;
			arr1[i] = k % 10;
			if (k < 10) {
				k = -1;
			} else {
				k = 0;
			}
		}
		// положим длину получившегося значения в нулеовй элемент массива
		// для того чтобы знать сколько цифр возвращать
		while (arr1[arr1[0]] == 0 && arr1[0] > 1) {
			arr1[0] = arr1[0] - 1;
		}

		// обойдем первый массив с конца и вернем результат строкой, исключив первый
		// элемент в массиве
		result = "";

		for (int i = arr1[0]; i > 0; i--) {

			result += arr1[i];
		}

		System.out.println(Arrays.toString(arr1));

		// для проверки результат
		BigInteger x = new BigInteger("6854561894561845645615615625");
		BigInteger y = new BigInteger("6854561894561845645615615615");
		BigInteger z = x.subtract(y);
		System.out.println(z);
		//

		return result;

	}

	public static void fillArrays(int[] array1, int[] array2, String str1, String str2) {

		/*
		 * Функция заполняет массивы цифрами, преобразованные из строк.
		 */

		var result = "";
		var tmp = 0;
		var counter = 0;

		// запишем первую строку в первый массив

		// в нулевой элемент положим общее количество цифр в строке 1
		array1[0] = str1.length();
		// запишем первую строку в превый массив с конца
		for (int i = str1.length() - 1; i >= 0; i--) {

			// преобразуем строку в число
			result += str1.charAt(i);
			tmp = Integer.parseInt(result);

			array1[counter + 1] = tmp;

			result = "";
			counter++;
		}

		// запишем вторую строку во второй массив

		// обнулим счетчик
		counter = 0;
		// в нулевой элемент положим общее количество цифр в строке 2
		array2[0] = str2.length();

		// запишем вторую строку во второй массив с конца
		for (int j = str2.length() - 1; j >= 0; j--) {

			// преобразуем строку в число
			result += str2.charAt(j);
			tmp = Integer.parseInt(result);

			array2[counter + 1] = tmp;

			result = "";
			counter++;
		}

	}

	public static String MassVote(int N, int[] Votes) {

		/*
		 * 146% Поступил крупный заказ на автоматизацию процесса подсчёта результатов
		 * выборов. В систему поступает количество голосов, отданных за каждого из
		 * кандидатов. Она должна обработать их и определить один из трёх вариантов
		 * результата: - победитель, набравший больше всех голосов и при этом более 50%
		 * голосов; - победитель, набравший больше всех голосов и при этом менее или
		 * ровно 50% голосов; - перевыборы (выявлено несколько победителей с одинаковым
		 * количеством голосов). Например, список голосов, отданных за пятерых
		 * кандидатов, первый случай: 60, 10, 10, 15, 5. Победил первый кандидат с
		 * результатом 60%. Cписок голосов, отданных за трёх кандидатов, второй случай:
		 * 10, 15, 10. Победил второй кандидат с результатом 42.85%. Перевыборы, четыре
		 * кандидата: 111, 111, 110, 110 Точность результата округляется до трёх знаков
		 * после запятой. Функция string MassVote(int N, int [] Votes) получает на вход
		 * количество кандидатов N >= 1 и массив, содержащий N голосов, отданных за
		 * соответствующих кандидатов. На выходе формируется строка в одном из трёх
		 * форматов: 1) "majority winner K" если имеется победитель с номером K (начиная
		 * с 1), набравший более 50% голосов. Для случая 60, 10, 10, 15, 5 строка примет
		 * вид majority winner 1 2) "minority winner K" если имеется победитель с
		 * номером K (начиная с 1), набравший менее 50% голосов. Для случая 10, 15, 10
		 * строка примет вид minority winner 2 3) "no winner" если победителя не
		 * выявлено.
		 * 
		 */

		var result = "";
		// определим сумму всех элементов в массиве
		var sum = 0;
		sum = IntStream.of(Votes).sum();
		System.out.println(sum);

		// Если сумма всех элементов равна нулю
		// значит победителей нет. вернем массив
		if (sum == 0) {
			result = "No winner";
		}

		else {

			// создадим массив типа double
			double[] vot;
			if ((N % 2) == 0) {
				vot = new double[N];
			} else {
				vot = new double[N + 1];
			}

			// посчитаем голоса а результат запишем в новый массив
			String str = "";
			double voteDouble = 0;

			for (int i = 0; i < Votes.length; i++) {
				// считаем
				voteDouble = Votes[i] * 100.0 / sum;
				// округляем
				str = String.format("%.3f", voteDouble);
				// строку в число заменяя запятую на точку
				double d = Double.parseDouble(str.replace(",", "."));
				// запишем в массив
				vot[i] += d;
			}
			System.out.println(Arrays.toString(vot));

			// определим победителя

			/*
			 * Идея такая, массив всегда должен быть четным, чтобы сравнивать элементы по
			 * парам. Обход массива с нуля, сравниваем два элемента, если они равны пишем
			 * результат в перем а (использую эту перем для того чтобы понять были ли
			 * одинаковые значения) и res если нулевой элемент больше первого элемента или
			 * наоборот, запишем больший элемент в переменную res а дальше выполняем
			 * проверки c перем. а и с последующими элементами.
			 */

			boolean noWin = false;
			int counter = 0;
			double res = 0;
			double a = 0;

			// цикл по четным элементам массива
			for (int i = 0; i < vot.length; i += 2) {
				// массив не кончился
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
								if (i + 2 == vot.length) {
									counter = i + 2;
								}
								noWin = false;
							} else if (vot[i + 1] == res) {
								noWin = true;
							}
						} else {
							noWin = true;
						}
					} else {
						// в этой паре нет победителя
						a = vot[i];
						if (res < a) {
							res = vot[i];
							noWin = true;
						}
					}
				}
			}

			System.out.println(res);
			System.out.println(counter);

			// вернем результат
			if (noWin == true) {
				result = "no winner";
			} else if (res > 50) {
				result = "majority winner " + counter;
			} else if (res <= 50) {
				result = "minority winner " + counter;
			}

		}
		return result;
	}

	public static int[] UFO(int N, int[] data, boolean octal) {

		/*
		 * Сигналы НЛО Британские учёные перехватили трафик переговоров двух НЛО,
		 * шпионящих за Землёй. Как выяснилось, сигналы первой НЛО передаются в
		 * восьмеричной системе счисления, а сигналы второй НЛО передаются в
		 * шестнадцатеричной системе счисления. Для быстрой расшифровки их переговоры
		 * надо представить в более привычной землянам десятичной системе счисления.
		 * Срочно требуется конвертор для разных систем счисления. Функция int []
		 * UFO(int N, int [] data, bool octal) получает на вход длину N цифровой записи
		 * трафика, сам трафик (последовательность положительных чисел) в массиве data,
		 * и флажок octal, который задаёт систему счисления входных данных: восьмеричная
		 * если octal = true, и шестнадцатеричная в противном случае. Если числа
		 * подаются в восьмеричной системе счисления, гарантируется, что в них не будет
		 * цифр 8 и 9. Функция возвращает массив длины N, содержащий исходные числа,
		 * преобразованные в десятичную систему счисления. Например, если на вход
		 * подаётся массив из двух чисел 1234,1777 с флажком octal = false, то результат
		 * будет 4660,6007. А если флажок для данного массива будет true, то результат
		 * будет 668,1023.
		 */

		int[] result = new int[N];
		int value = 8;

		if (octal == true) {
			convert(result, data, value);
		} else {
			value = 16;
			convert(result, data, value);
		}

		return result;
	}

	public static void convert(int[] result, int[] data, int value) {

		/*
		 * Функция преопразует переданные ей значение в восьмеричной или
		 * шестнадцатеричной системе исчисления, находящиеся в массиве. Результат работы
		 * функции - заполненный массив со значениями в десятичной системе исчисления.
		 */

		int k = 0;
		String str = "";

		for (int i = 0; i < data.length; i++) {
			str = Integer.toString(data[i]);
			k = Integer.parseInt(str, value);
			result[i] = k;
		}
	}

	public static int Unmanned(int L, int N, int[][] track) {

		/*
		 * 
		 */

		int travelTime = 0;
		boolean redSignal = true;

		// данные о каждом светофоре будем записывать в этот массив
		int[] lights = new int[3];
		int haveLights = 0;
		int counterLightsRed = 0;
		int counterLightsGreen = 0;
		int way = 0;

		// счетчик светофоров
		int counterLights = 0;
		// получить данные о светофоре
		getLightsInfo(track, lights);

		// вернулся массив заполннеый данными первого светофора
		// определим переменные данными светофора
		for (int i = 0; i < lights.length; i++) {
			if (i == 0) {
				haveLights = lights[i];
			}
			if (i == 1) {
				counterLightsRed = lights[i];
			}
			if (i == 2) {
				counterLightsGreen = lights[i];
			}
		}
		counterLights += 1;

		do {

			// на текущем шаге есть светофор?
			if (haveLights == way) {
				// ехеть можно только на зеленный
				if (redSignal == true) {
					// ждем когда загорится зеленый
					counterLightsRed--;
				} else {
					// горит зеленый, можно ехать
					if (counterLightsGreen != 0) {
						counterLightsGreen--;
					}
					// добавим путь
					way++;
				}
			} else {
				// прибавим счетчик пути
				way++;
				// отнимим счетчик светофоров, так как они работают с общим счетчиком
				if (redSignal == true) {
					// значит горит красный отнимим значение у карсного сигнала светофора
					if (counterLightsRed != 0) {
						counterLightsRed--;
					}
				} else {
					// горит зеленый отнимим у зеленого
					counterLightsGreen--;
				}
			}

			// пришло ли время переключить светофоры?
			if (counterLightsRed == 0) {
				// включаем зеленый
				redSignal = false;
				// обнуляем счетчик красного света
				counterLightsRed = lights[1];
			}
			if (counterLightsGreen == 0) {
				redSignal = true;
				counterLightsGreen = lights[2];
			}

			// общее количество итераций и будет результат
			travelTime += 1;

			// мы проехали текущий светофор?
			if (way > haveLights) {
				// есть еще светофоры на нашем пути?
				if (counterLights < N) {
					// получим данные о новом светофоре на нашем пути
					getLightsInfo(track, lights);
					// переопределим наши переменные.
					for (int i = 0; i < lights.length; i++) {
						if (i == 0) {
							haveLights = lights[i];
						}
						if (i == 1) {
							counterLightsRed = lights[i];
						}
						if (i == 2) {
							counterLightsGreen = lights[i];
						}
					}

					// счетчик светофоров
					counterLights += 1;

					// вычислим какой сигнал светофора должен быть
					// так как все светофоры работают одновременно
					// на первой итерации светофор горит красными
					redSignal = true;
					for (int i = 0; i < travelTime; i++) {
						if (redSignal == true) {
							if (counterLightsRed == 0) {
								redSignal = false;
								counterLightsRed = lights[1];
								counterLightsGreen--;
							} else {
								counterLightsRed--;
							}
						} else {
							if (counterLightsGreen == 0) {
								redSignal = true;
								counterLightsGreen = lights[2];
								counterLightsRed--;
							} else {
								counterLightsGreen--;
							}
						}
					}
				}
			}

		} while (way != L);

		return travelTime;
	}

	public static int[] getLightsInfo(int[][] data, int[] lights) {

		/*
		 * Функция получает данные о светофоре, которые содержаться в массиве data,
		 * определяет какой сигнал светофора горит на текущей итерации. Результат работы
		 * записывается в массив lights.
		 */

		int haveLights = 0;
		int redLights = 0;
		int greenLights = 0;

		// обойдем массив data и запишем в переменные данные светофора,
		// заменяя уже записанные данные нулем 0.

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] != 0) {
					// где находится светофор
					if (j == 0) {
						lights[j] = data[i][j];
						haveLights = data[i][j];
						data[i][j] = 0;
					}
					// длительность красного сигнала
					if (j == 1) {
						lights[j] = data[i][j];
						redLights = data[i][j];
						data[i][j] = 0;
					}
					// длительность зеленого сигнала
					if (j == 2) {
						lights[j] = data[i][j];
						greenLights = data[i][j];
						data[i][j] = 0;
					}
				}
			}
			if (haveLights != 0 && redLights != 0 && greenLights != 0) {

				break;
			}
		}
		return lights;
	}

	public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {

		/*
		 * Танковый раш Разведчики выяснили, что неведомый клан готовит внезапный
		 * массивный прорыв премиум-танков. У нашей арты будет возможность произвести
		 * только один залп. Ваша задача: выявить местонахождение группировки танков на
		 * карте. На входе два массива (карта и группировка танков), каждый описывается
		 * одинаково: количество строк, количество столбцов и набор строк, разделённых
		 * пробелом. Каждый символ строки описывает один элемент карты. Например, дана
		 * карта: 1234 2345 0987 Этот массив размером 3*4 будет представлен на вводе
		 * так: 3 4 1234 2345 0987 Второй массив представляется аналогично первому.
		 * Задача: проверить, входит ли второй массив в первый (в двумерном виде).
		 * Например, второй массив может быть таким: 34 98 или 2 2 34 98 Он входит в
		 * состав первого массива. Функция bool TankRush(int H1, int W1, string S1, int
		 * H2, intW2, string S2) первыми тремя параметрами получает исходную карту, а
		 * следующими тремя -- карту, которая ищется в исходной. TankRush возвращает
		 * true, если вторая карта содержится в первой.
		 */

		boolean result = true;

		// Удалим проблеы в словах
		// для массива map
		String newS1 = "";
		newS1 = deleteSpace(S1, newS1);
		// для массива groupingOfTanks
		String newS2 = "";
		newS2 = deleteSpace(S2, newS2);

		// создадим массивы по пришедшим данным и заполним их.
		String[][] map = new String[H1][W1];
		fillArray(map, newS1);
		String[][] groupingOfTanks = new String[H2][W2];
		fillArray(groupingOfTanks, newS2);

		// результат цикла пишем сюда.
		ArrayList<Integer> res = new ArrayList<>();

		System.out.println(Arrays.deepToString(map));
		System.out.println(Arrays.deepToString(groupingOfTanks));

		// проверим входит ли массив groupingOfTanks в массив map.
		// если все элменты массива groupingOfTanks содержатся в массиве map (в каждой
		// строке)
		// тогда возврат истина иначе ложь

		boolean marker = false;

		int a = 0;
		int b = 0;

		String strMap = "";
		String strGrTanks = "";

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {

				for (int k = 0; k < groupingOfTanks.length; k++) {
					for (int l = 0; l < groupingOfTanks[k].length; l++) {

						// получим текущее значение из каждого массива
						strMap = map[i][j];
						strGrTanks = groupingOfTanks[k][l];
						// строку в число
						a = Integer.parseInt(strMap);
						b = Integer.parseInt(strGrTanks);

						if (a == b) {
							marker = true;
						}

						// очистим переменные для следующего значения.
						strMap = "";
						strGrTanks = "";
						a = 0;
						b = 0;

					}
				}

			}

			if (marker == true) {
				res.add(1);
			} else {
				res.add(0);
			}
		}

		System.out.println(res);

		// обойдем коллекцию, если встретиться 0 вернем false
		for (int res1 : res) {
			if (res1 != 0) {
				result = true;
			} else {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void fillArray(String[][] arr, String str) {

		/*
		 * Функция заполняет двумерный массив arr строкой str, разбивая ее на символы.
		 */

		String substr = "";
		int counterStr = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				substr += str.charAt(counterStr);
				arr[i][j] = substr;
				substr = "";
				counterStr += 1;
			}
		}
	}

	public static String deleteSpace(String str, String newStr) {
		/*
		 * Функция удалаяет пробелы в строке str и возвращает строку newStr без
		 * пробелов.
		 */
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				newStr += str.charAt(i);
			}
		}
		return newStr;
	}

	public static int MaximumDiscount(int N, int[] price) {

		/*
		 * Шопоголики Оксана -- шопоголик. Она постоянно выискивает магазины, где
		 * предлагаются различные скидки, и совершает на них опустошающие набеги.
		 * Недавно Оксана нашла отличный маркет, где предлагается соблазнительный
		 * сервис: если покупаются три предмета, то третий (самый дешёвый) можно
		 * получить бесплатно. Например, купив три предмета за 400, 300 и 250 долларов,
		 * Оксана заплатит всего 700 долларов, так как третий, самый дешёвый, получит
		 * бесплатно. * Если за один раз покупается больше трёх предметов, то количество
		 * бесплатных покупок равно общему числу предметов, делённому нацело на три.
		 * Например, при покупке 7 и 8 предметов, два предмета из них (самые дешёвые)
		 * Оксана получает бесплатно. * Однако если разбивать такие "длинные"
		 * приобретения на более короткие, можно получить ощутимо большую выгоду. *
		 * Например, Оксана купила разом семь предметов: 400, 350, 300, 250, 200, 150 и
		 * 100 долларов, из которых два самых дешёвых (150 и 100) достаются бесплатно.
		 * Однако если бы она сперва купила три предмета 400, 350 и 300, потом три 250,
		 * 200 и 150, и потом последний за 100, то бесплатными для неё стали бы товары
		 * по 300 и 150 долларов. * Разработайте для Оксаны стратегию получения
		 * максимальной скидки, когда известен весь перечень товаров (цены на них
		 * следуют в случайном порядке). * Функция int MaximumDiscount(int N, int []
		 * price) получает на вход количество предметов N и список их цен. Возвращает
		 * она максимально возможную величину скидки.
		 */

		int result = 0;

		// отсортируем массив price по возр.
		Arrays.sort(price);
		// System.out.println(Arrays.toString(price));

		if (N == 3) {
			// 0й элемент массива, это возможная выгода при таком количестве покупок.
			result = price[0];
		} else if (N > 3) {

			// посчитаем сколько мы можем забрать товаров бесплатно
			int countFreeProd = N / 3;
			// System.out.println(countFreeProd);
			// посчитаем нашу скидку
			int discount = 0;
			for (int i = 0; i < countFreeProd; i++) {
				discount += price[i];
			}
			// System.out.println(discount);

			// можем увеличить нашу скидку?
			// обойдем массив с конца и посчитаем каждый третий элемент
			// затем сравним что получилось с перем discount
			int anotherDiscount = 0;

			for (int i = N - 3; i >= 0;) {

				// System.out.println(price[i]);

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
			// нет скидки
			result = 0;
		}

		return result;
	}

	public static boolean LineAnalysis(String line) {

		/*
		 * 
		 * Машинное распознавание паттернов Олег получил инвестиции на стартап по
		 * машинному обучению, и занимается распознаванием закономерностей в тексте. Его
		 * первый продукт будет анализировать текст, преобразованный из изображений
		 * точек и звёздочек, которые рисуют первоклассники в тетрадках.
		 * Последовательности всегда составлены по общему шаблону, но первоклассники
		 * пока часто ошибаются, и забывают поставить точку, рисуют лишнюю звёздочку, и
		 * т. п. На вход программы поступают строки, состоящие из символов "." и "*",
		 * всегда начинающиеся и завершающиеся звёздочкой. В них всегда повторяется
		 * единый шаблон, например: *..*..*..*..*..*..* Такой пример считается
		 * корректным. Однако первоклассники иногда ошибаются, и могут написать такие
		 * ошибочные строки: *..*...*..*..*..*..* ..*..*..*..*..**..* Ещё примеры
		 * корректных строк: * *** *.......*.......* ** *.* Функция bool
		 * LineAnalysis(string line) получает на вход строку для анализа и возвращает
		 * логическое true/false, обозначающее корректность строки.
		 */

		boolean result = true;

		// определим шаблон который используется в строке

		// Каждая строка начинается и заканчивается "*". Посчитаем сколько точек между
		// звездочками.
		String pattern = "";
		int countPointInPattern = 0;
		for (int i = 0; i < line.length(); i++) {

			if (i == 0 && line.charAt(i) == '*') {
				pattern += line.charAt(i);
			} else if (line.charAt(i) == '.') {
				pattern += line.charAt(i);
				countPointInPattern += 1;
			} else if (line.charAt(i) == '*') {
				pattern += line.charAt(i);
				break;
			}

		}

		System.out.println(countPointInPattern);
		System.out.println(pattern);

		// обойдем строку еще раз и сравинм количество точек во всей строке между "*" и
		// количестовм точек в шаблоне.
		int countPointInLine = 0;
		for (int i = 0; i < line.length(); i++) {

			if (i == 0 && line.charAt(i) == '*') {
				countPointInLine = 0;
			} else if (line.charAt(i) == '.') {
				countPointInLine += 1;
			} else if (line.charAt(i) == '*') {
				if (countPointInLine == countPointInPattern) {
					result = true;
					countPointInLine = 0;
				} else {
					result = false;
					countPointInLine = 0;
					break;
				}
			}
		}

		return result;
	}

	public static boolean MisterRobot(int N, int[] data) {

		/*
		 * Хакер Эллиот (Мистер Робот) подбирает код для проникновения в хранилище
		 * данных "Стальная гора". Он собирается взломать систему климат-контроля, чтобы
		 * уничтожить все магнитные ленты Корпорации Зла. Помогите Эллиоту подобрать
		 * подходящий смарт-контроллер, который бы допускал потенциальную возможность
		 * взлома. Для анализа поступает массив, в котором случайно перемешаны числа от
		 * 1 до N (без пропусков), N > 4. Например, N=7 [1,3,4,5,6,2,7]
		 * 
		 * Хакерская утилита может делать только одну операцию: брать любые три идущие
		 * подряд элемента массива, и сдвигать их по кругу влево произвольное количество
		 * раз. Но эту операцию она может выполнять неограниченное количество раз.
		 * 
		 * Например:
		 * 
		 * [1,3,4,5,6,2,7] [5,6,2] -> [6,2,5] -> [2,5,6] [1,3,4,2,5,6,7] [3,4,2] ->
		 * [4,2,3] -> [2,3,4] [1,2,3,4,5,6,7] OK
		 * 
		 * Задача: определить, можно ли с помощью этой операции превратить массив в
		 * упорядоченный по возрастанию. Программа должна работать быстро (укладываться
		 * в 1 секунду при N ~= 10).
		 * 
		 * Функция
		 * 
		 * bool MisterRobot(int N, int [] data)
		 * 
		 * получает значение N и сам массив, и возвращает true, если этот массив
		 * возможно упорядочить вышеописанным способом.
		 */

		// запомним занчения в начале выполнения кода
		long start = System.currentTimeMillis();

		boolean result = false;
		int ctr = N - 2;
		int takingElem = N - 2;
		int[] array2 = new int[3];

		// сколько раз можно взять 3 элемента из массива?
		int couterTry = N / 3;
		System.out.println(N / 3);

		do {
			// взять три элемента из массива
			for (int i = 2; i >= 0; i--) {
				if (takingElem != 0) {
					array2[i] = data[takingElem];
					takingElem--;
				}
			}
			// Нам нужно захватить один элемент из прошлой итерации цикла do
			takingElem++;
			System.out.println(Arrays.toString(array2));

			// передать массив с тремя элементами в функцию сдвига по куругу.
			performLeftShift(array2);
			System.out.println(Arrays.toString(array2));

			// вставить в массив
			for (int i = 2; i >= 0; i--) {
				if (ctr != 0) {
					data[ctr] = array2[i];
					ctr--;
				}
			}
			// так как при вставке в массив брали элемент который использовали в предыдущей
			// итерации цикла do
			ctr++;
			// проверить остортирован ли весь массив. если истина вернуть истина
			for (int i = 0; i < data.length - 1; i++) {
				if (data[i + 1] < data[i]) {
					result = false;
					break;
				}
				result = true;
			}

			System.out.println(Arrays.toString(data));

			// уменьшим количество попыток
			couterTry--;

		} while (couterTry != 0);

		// выводим время выполнения программы
		System.out.println("Время выполнение программы: " + (System.currentTimeMillis() - start) + " Мсек");
		return result;
	}

	public static void performLeftShift(int[] arr) {

		/*
		 * Функция выполняет сдвиг элементов влево по кругу а затем проверяет
		 * остортирован ли массив по возрастанию. После того как все элменты прошли 1
		 * круг и если элементы в нем не отсортированы по возрастанию, заканчивает
		 * работу.
		 */
		int numOftry = 0;
		boolean needIteration = false;

		do {
			int tmp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = tmp;
			// массив отсортировани по возрастанию?
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i + 1] < arr[i]) {
					needIteration = true;
					break;
				}
				needIteration = false;
			}
			numOftry++;

		} while ((needIteration != false) && (numOftry < 3));
	}

	public static String[] ShopOLAP(int N, String[] items) {

		/*
		 * Интернет-магазин "Платья и Сумки" быстро расширяется, и его создатели
		 * заинтересованы в подробной аналитической отчётности о продажах товара. К
		 * сожалению, первая версия магазина была сделана очень криво, поэтому данные
		 * хранятся в системе в виде, плохо подходящем для обработки. Так, каждая запись
		 * о продаже представляет собой строку формата
		 * 
		 * название-товара количество-проданных-штук
		 * 
		 * например:
		 * 
		 * платье1 5 сумка32 2 платье1 1 сумка23 2 сумка128 4
		 * 
		 * Названия товаров могут повторяться.
		 * 
		 * Ваша задача: сгруппировать продажи по названиям товаров, расположив в
		 * результирующем списке товары, отсортированные по количеству продаж. Если эти
		 * количества для каких-то товаров совпадут, названия товаров должны следовать в
		 * порядке лексикографического возрастания.
		 * 
		 * Например, вышеприведённый пример преобразуется в такой результат:
		 * 
		 * платье1 6 сумка128 4 сумка23 2 сумка32 2
		 * 
		 * Функция
		 * 
		 * string [] ShopOLAP(int N, string [] items)
		 * 
		 * получает на вход N >= 1 строк о товарах в вышеприведённом формате, и выдаёт
		 * массив длиной M <= N, содержащий сводку по продажам в сгруппированном виде.
		 */

		String[] result = null;

		// создадим струтуру имя товара - кол-во проданных штук, которая автоматически
		// будет отсортирована компаратором.
		TreeMap<String, Integer> productSales = new TreeMap<>();

		// обйдем каждый элемент массива собирая нименование товара по символам, при
		// встрече с пробелом, запишем наименование товара в структуру а после,
		// добавим количество проданных штук.

		String nameProd = "";
		String priceStr = "";
		boolean fullName = false;
		int currentValue = 0;
		for (int i = 0; i < items.length; i++) {

			for (int j = 0; j < items[i].length(); j++) {
				// получим символ
				if (fullName == false) {
					if (items[i].charAt(j) != ' ') {
						nameProd += items[i].charAt(j);
					} else {
						// встретили пробел
						fullName = true;
					}
				} else {
					priceStr += items[i].charAt(j);
				}
			}
			// преобразуем перем priceStr в число
			int price = Integer.parseInt(priceStr);
			// добавим данные в структуру
			if (productSales.containsKey(nameProd) == true) {
				// прибавим к имеющемуся значению
				currentValue = productSales.get(nameProd);
				price += currentValue;
				// добавим запись
				productSales.put(nameProd, price);
			} else {
				productSales.put(nameProd, price);
			}
			// очистим переменные для нового элемента
			nameProd = "";
			priceStr = "";
			price = 0;
			fullName = false;
		}

		// отсортируем мапу, переписав ее в ArrayList
		List list = new ArrayList(productSales.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				return b.getValue().compareTo(a.getValue());
			}
		});

		// инициализируем массив
		result = new String[list.size()];
		String str = "";
		String product = "";
		// перепишем лист в массив игнорируя знак =.
		for (int i = 0; i < list.size(); i++) {
			str += list.get(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '=') {
					product += " ";
				} else {
					product += str.charAt(j);
				}
			}
			result[i] = product;
			product = "";
			str = "";
		}

		return result;
	}

	public static String BastShoe(String command) {

		/*
		 * В рамках проекта тотального импортозамещения решено полностью с нуля
		 * переписать весь офисный софт в стране. Вы получили подряд с бюджетом миллион
		 * рублей по созданию оригинального текстового редактора "Лапоть". Закодируйте
		 * его максимально компактно!
		 * 
		 * "Лапоть" поддерживает пять операций:
		 * 
		 * 1. Добавить(S) -- в конец текущей строки (исходно пустая) добавляется строка
		 * S;
		 * 
		 * 2. Удалить(N) -- удалить N символов из конца текущей строки. Если N больше
		 * длины текущей строки, удаляем из неё все символы;
		 * 
		 * 3. Выдать(i) -- выдать i-й символ текущей строки (индексация начинается с
		 * нуля) в формате строки (строковый тип). Если индекс за пределами строки,
		 * возвращайте пустую строку;
		 * 
		 * 4. Undo() -- отмена последней операции 1 или 2; отмена должна уметь
		 * выполняться при необходимости неограниченное число раз;
		 * 
		 * 5. Redo() -- выполнить заново последнюю отменённую с помощью Undo операцию;
		 * Redo должна уметь выполняться при необходимости неограниченное число раз.
		 * Если после Undo выполняется операция 1 или 2, то -- предыдущая цепочка
		 * операций для Undo обнуляется (откатить можно только последнюю операцию 1 или
		 * 2); -- Redo более становится нечего откатывать.
		 * 
		 * На вход редактора подаётся одна строка, первый символ которой -- номер
		 * операции (1-5) и через пробел, при необходимости, параметр соответствующей
		 * операции.
		 * 
		 * Например:
		 * 
		 * 1 Привет В текущей строке будет "Привет" 1 , Мир! Привет, Мир! 1 ++ Привет,
		 * Мир!++ 2 2 Привет, Мир! 4 Привет, Мир!++ 4 Привет, Мир! 1 * Привет, Мир!* 4
		 * Привет, Мир! 4 Привет, Мир! 4 Привет, Мир! 3 6 , 2 100
		 * 
		 * 1 Привет Привет 1 , Мир! Привет, Мир! 1 ++ Привет, Мир!++ 4 Привет, Мир! 4
		 * Привет 5 Привет, Мир! 4 Привет 5 Привет, Мир! 5 Привет, Мир!++ 5 Привет,
		 * Мир!++ 5 Привет, Мир!++ 4 Привет, Мир! 4 Привет 2 2 Прив 4 Привет 5 Прив 5
		 * Прив 5 Прив
		 * 
		 * Функция
		 * 
		 * string BastShoe(string command)
		 * 
		 * получает на вход строку в формате "N параметр", где N -- код операции (1-5),
		 * и возвращает текущую строку, или символ в формате строки, если команда
		 * Выдать(), или пустую строку в случае её ошибки. Например,
		 * BastShoe("1 Привет") = "Привет"
		 * 
		 * Если команда задана некорректно, Лапоть ничего не делает (просто возвращает
		 * текущую строку без изменений).
		 */

		String result = "";
		// Определим какое действие нам необходимо выполнить
		// обойдем строку вытащим номер команды и строку
		char numbCommand = ' ';
		String param = "";
		
		for (int i = 0; i < command.length(); i++) {
			// первый символ строки - номер команды
			if (i == 0) {
				numbCommand = command.charAt(i);
			} else {
				if (i == 1) {
					// пробел не нужен ничего не пишем
				} else if (i == 2) {
					// есть пробел
					if (command.charAt(i) != ' ') {
						// добавим символ в слово
						param += command.charAt(i);
					}
				} else {
					// все остальные символы д
					param += command.charAt(i);
				}
			}
		}
		
		//начальное заполнение коллекции на первой итерации
		if (counterIter == 1) {
			historyAllCommand.addLast("");
		}

		String word = "";
		String currentCommand = "";
		int indexCommand = 0;
		
		// какую команду бдуем исполнять?
		switch (numbCommand) {
		case '1':
			// в конец текущей строки (исходно пустая) добавляется строка str
			
			word = historyAllCommand.getLast();
			result = addText(param, word);
			
			if (undoComm == true) {
				// если последняя операции была 4, очистим коллекцию с операциями
				// очистим текущую цепочку команд
				historyCommand1And2.clear();
				//добавим предыдущую команду
				historyCommand1And2.addLast(word);
				// добавим исполняемую
				historyCommand1And2.addLast(result);
			} else {
				historyCommand1And2.addLast(result);
			}

			historyAllCommand.addLast(result);
			undoComm = false;

			break;
		case '2':
			// удалить N символов из конца текущей строки. Если N больше
			// * длины текущей строки, удаляем из неё все символы
			
			word = historyAllCommand.getLast();
			result = dellSymbol(param, word);

			if (undoComm == true) {
				// если последняя операции была 4, очистим коллекцию с операциями
				// очистим текущую цепочку команд
				historyCommand1And2.clear();
				//добавим предыдущую команду
				historyCommand1And2.addLast(word);
				// добавим исполняемую
				historyCommand1And2.addLast(result);				
			} else {			
				historyCommand1And2.addLast(result);
			}

			historyAllCommand.addLast(result);
			undoComm = false;

			break;
		case '3':
			// Выдать(i) -- выдать i-й символ текущей строки (индексация начинается с нуля)
			// в формате строки (строковый тип). Если индекс за пределами строки,
			// возвращайте пустую строку;
			
			word = historyAllCommand.getLast();
			result = getSymbol(param, word);
			
			undoComm = false;			
			
			break;
		case '4':
			// отмена последней операции 1 или 2; отмена должна уметь выполняться при
			// необходимости неограниченное число раз Если после Undo выполняется операция 1
			// или 2, то предыдущая цепочка операций для Undo обнуляется (откатить можно
			// только последнюю операцию 1 или 2);

			currentCommand = historyAllCommand.getLast();
			indexCommand = historyCommand1And2.lastIndexOf(currentCommand);

			if (indexCommand - 1 > 0) {
				result = historyCommand1And2.get(indexCommand - 1);
			} else {
				result = historyCommand1And2.getFirst();
			}

			historyAllCommand.addLast(result);
			undoComm = true;

			break;
		case '5':
			// выполнить заново последнюю отменённую с помощью Undo операцию; Redo должна
			// уметь выполняться при необходимости неограниченное число раз.

			// получим последнюю команду
			currentCommand = historyAllCommand.getLast();
			// найти текущую операцию в списке комманд и получить следующую
			indexCommand = historyCommand1And2.lastIndexOf(currentCommand);
			if (indexCommand + 1 < historyCommand1And2.size()) {
				result = historyCommand1And2.get(indexCommand + 1);
			} else {
				result = historyCommand1And2.getLast();
			}

			historyAllCommand.addLast(result);
			undoComm = false;
			
			break;

		default:
			// если команда задана некорректно, возвращаем текущую команду
			result = historyAllCommand.getLast();
		}

		counterIter++;
		return result;
	}

	public static String addText(String s1, String s2) {
		
		/*
		 * Функция добавляет текст содержащийся в перем s1 в конец строки перем s2 
		 * и результат записывает в перем result.
		 */
		
		String result = "";
		if (s2.isEmpty()) {
			result = s1;
		} else {
			// допишем в конец строки новое слово
			result = s2;
			for (int i = 0; i < s1.length(); i++) {
				result += s1.charAt(i);
			}

		}

		return result;
	}

	public static String dellSymbol(String countSymbols, String s2) {
		
		/*
		 * Функция удаляет заданное в перем countSymbols кол-во символов из перем s2.
		 * Результат записывается в перем result.
		 */
		
		String result = "";
		// преробразуем строку в число
		int countSy = Integer.parseInt(countSymbols);

		if (countSy <= s2.length()) {
			// удалим с конца строки нужное кол-во символов
			for (int i = 0; i < s2.length() - countSy; i++) {
				result += s2.charAt(i);
			}

		} else {
			// вернем пустую перем result
		}

		return result;
	}

	public static String getSymbol(String indexSymbol, String s2) {
		
		/*
		 * Функция получет символ из перем s2, индекс которого задан в перем indexSymbol.
		 * Результат записывается в перем result. 
		 */

		String result = "";
		int numbSymb = Integer.parseInt(indexSymbol);
		if (numbSymb < s2.length()) {
			// получим необходимый символ
			result += s2.charAt(numbSymb);
		} else {
			// вернем пустую перем result
		}

		return result;
	}
	
	public static String BiggerGreater(String input) {
		
		/*
		 * Гарри Поттер идёт в первый класс Хогвартса
		 * 
		 * Казалось бы, чего тут сложного -- выучил несколько колдовских слов, произнёс,
		 * и... никакого эффекта. Именно поэтому в специальных учебных заведениях
		 * наподобие Хогвартса вербальную магию изучают годами. Дело в том, что в
		 * волшебных учебниках написаны слова заклинания, которые сами по себе не
		 * работают. Их надо уметь преобразовывать в действующую магию с помощью
		 * специальных алгоритмов. Давайте познакомимся с одним из них.
		 * 
		 * У нас имеется не-магическое слово -- стандартная последовательность русских и
		 * английских букв (строковый тип). Такие слова в любом языке программирования
		 * можно сравнивать, используя обычный лексикографический порядок, когда "а"
		 * меньше чем "я", "a" меньше чем "z" и т. д.
		 * 
		 * Задача: преобразовать такое слово в магическое с помощью любого числа
		 * перестановок двух любых букв в слове, либо убедиться, что получить магическое
		 * слово невозможно.
		 * 
		 * Итоговое слово должно отвечать двум требованиям: 1) оно лексикографически
		 * больше, чем исходное слово; 2) оно наименьшее из всех лексикографически
		 * больших слов, которые можно получить перестановкой пары букв.
		 * 
		 * Тестовые примеры:
		 * 
		 * "ая" преобразовываем в "яа" "fff" - невозможно преобразовать "нклм" в "нкмл"
		 * "вибк" в "викб" "вкиб" в "ибвк"
		 * 
		 * Функция
		 * 
		 * string BiggerGreater(string input)
		 * 
		 * получает на вход исходную строку длиной 2 или более русских или английских
		 * строковых (маленьких) букв, и возвращает итоговое магическое слово. Если
		 * получить его невозможно, возвращается пустая строка. Например,
		 * BiggerGreater("вибк") = "викб"; BiggerGreater("fff") = "".
		 */
		
		String result = "";
		boolean allSymbolsAreTheSame = false;

		// сравним каждое значение в строке
		for (int i = 1; i < input.length(); i++) {

			if (input.charAt(i) != input.charAt(i - 1)) {
				// символы не одинаковые, будем преобразовывать в магическое слово
				allSymbolsAreTheSame = false;
				break;
			}
			// все символы в строке одинаковые, магии не будет.
			allSymbolsAreTheSame = true;
		}

		
		if (allSymbolsAreTheSame == false) {
			// Преобразуем в магическое слово.

			String originalWord = input;
			String subStr = "";
			String[] arrSymbols = new String[originalWord.length()];
			ArrayList<String> arrMagicWords = new ArrayList<String>();
			ArrayList<String> MagWrd = new ArrayList<String>();

			// строку в массив
			for (int i = 0; i < originalWord.length(); i++) {
				subStr += originalWord.charAt(i);
				arrSymbols[i] = subStr;
				subStr = "";
			}

			replaceTwoSymbols(originalWord, arrMagicWords, arrSymbols);			
			System.out.println(arrMagicWords.toString());

			// Сравним магические слова в 2 этапа:
			String previousMagicWrd = "";
			String currMagicWrd = "";
			int val1 = 0;
			int val2 = 0;
			int curValue = 0;

			// первый этап сравнения. Запишем в ArrayList те, которые меньше нуля т.е.
			// аргумент является строкой лексически большей, чем originalWord.
			
			for (int i = 0; i < arrMagicWords.size() - 1; i++) {

				currMagicWrd = arrMagicWords.get(i);
				curValue = originalWord.compareTo(currMagicWrd);
				
				if (curValue < 0) {
					MagWrd.add(currMagicWrd);
				}

			}
			System.out.println(MagWrd.toString());
			
			//проверим количество магических слов
			if(MagWrd.size() == 1) {
				//вернем результат
				result = MagWrd.get(0);
			}else {
			
			// второй этап сравнения. Выберим из ArrayList тот, который меньше всех.
			
			for (int i = 1; i < MagWrd.size(); i++) {

				if (i == 1) {
					
					previousMagicWrd = MagWrd.get(0);
					currMagicWrd = MagWrd.get(i);
					val1 = currMagicWrd.compareTo(previousMagicWrd);

					if (val1 < 0) {
						// аргумент больше чем currMagicWrd. Нам нужен наименьший
						result = currMagicWrd;
					} else if (val1 > 0) {
						// аргумент меньше чем currMagicWrd. Это наш.
						result = previousMagicWrd;
					}

				} else {
					
					previousMagicWrd = MagWrd.get(i - 1);
					currMagicWrd = MagWrd.get(i);
					val1 = currMagicWrd.compareTo(previousMagicWrd);

					if (val1 < 0) {
						// аргумент больше чем currMagicWrd. Нам нужен наименьший

					} else if (val1 > 0) {
						// аргумент меньше чем currMagicWrd. Это наш. Сравним с result
						val2 = result.compareTo(previousMagicWrd);

						if (val2 < 0) {
							// аргумент больше чем result. Нам нужен наименьший
							// не меняем result
						} else if (val2 > 0) {
							// аргумент меньше чем result. Это наш.
							result = previousMagicWrd;

						}
					}
				}
			}
		}
		}
		return result;
	}
	
	public static ArrayList<String> replaceTwoSymbols(String word, ArrayList<String> magicWords, String[] arraySymbols) {
		
		/*
		 * Функция выполняет поочередную перестановку 2х символов в массиве
		 * arraySymbols. В результате получается новое слово которое записывается в
		 * ArrayList magicWords. Перестановка продолжается до тех пор, пока в результате
		 * перестановок не будет получено такое же слово как в перем word. Перестановка
		 * символов начинается с конца массива .
		 */
		
		int step = 2;
		int counter = 0;
		int resultCompare = 0;
		Boolean needIteration = true;
		String tmp = "";
		String magicWord = "";

		do {

			if (word.length() - step < 0) {
				// значит находимся за пределами длины слова
				// начнем с конца.
				step = 2;
				counter = word.length() - step;
			} else {
				// длина слова еще позволяет нам идти к началу строки.
				counter = word.length() - step;
			}

			for (int i = 0; i < arraySymbols.length; i++) {

				if (i < counter) {
					magicWord += arraySymbols[i];
				} else if (i == counter) {
					// запомним результат. Он нам понадобится на следующей итерации.
					tmp = arraySymbols[i];

				} else if (i == counter + 1) {

					magicWord += arraySymbols[i];
					magicWord += tmp;
					// так же перестраиваем массив
					arraySymbols[i - 1] = arraySymbols[i];
					arraySymbols[i] = tmp;

				} else {
					magicWord += arraySymbols[i];
				}

			}
			// увеличим шаг
			step++;
			// запишем в структуру
			magicWords.add(magicWord);
			// сравним магическое слово с исходным
			resultCompare = word.compareTo(magicWord);

			if (resultCompare == 0) {
				// значит магическое слово полностью идентично исходному
				// дальнейшая перестановка символов не имеет значение
				needIteration = false;
			}

			// очистим слово
			magicWord = "";

		} while (needIteration == true);

		
		return magicWords;
		
	}
	
	public static boolean SherlockValidString(String s) {
		
		/*
		 * Шерлок Холмс и механическая шкатулка
		 * 
		 * Сама суть этой загадки и то возбужденное состояние, в котором пребывал клиент
		 * Холмса, придавали этому делу необычный характер. Да и, кроме предстоящего
		 * расследования, мастерство моего друга, его умение удивительно быстро
		 * овладевать ситуацией и на основании тщательных наблюдений и простой логики
		 * делать поразительные по своей точности выводы зачаровывали меня. Изучать
		 * систему его работы и приемы, с помощью которых он в два счета распутывал
		 * сложнейшие загадки, для меня было настоящим удовольствием.
		 * 
		 * Шерлок Холмс в свободное время упражняется в проверке валидных паролей к его
		 * новой механической шкатулке. Пароли строятся из латинских букв и считаются
		 * валидными, если в соответствующей строке пароля все буквы встречаются
		 * одинаковое количество раз. Кроме того, разрешается удалить одну любую букву,
		 * чтобы выполнилось условие равенства частоты всех букв.
		 * 
		 * Например, строка xyz будет валидна, и строка xyzaa будет валидна (можно
		 * удалить одну a), и строка xxyyz будет валидна (можно удалить z). А строка
		 * xyzzz, или строка xxyyza или строка xxyyzabc невалидны.
		 * 
		 * Напишите функцию, проверяющую строку на валидность.
		 * 
		 * Функция
		 * 
		 * boolean SherlockValidString(string s)
		 * 
		 * получает на вход исходную строку длиной 2 или более английских букв, и
		 * возвращает true, если строка валидна.
		 */
		
		boolean result = false;

		// строку в массив
		char[] chArr = s.toCharArray();

		// массив цифр. Каждый символ соответствует числу.
		// сюда пишем результат преобразования Char в число.
		// Т.е. символ a = 97, z = 122 и т.д..
		int[] arr = new int[255];
		ArrayList<Integer> countSymbols = new ArrayList<>();
		boolean everyoneIsEqual = true;
		int maxIndexSymb = 0;
		int minIndexSymb = 0;
		int symb = 0;

		System.out.println(Arrays.toString(chArr));

		// заполним массив номерами символов из строки
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++;
		}

		// проверим сколько раз встречаются символы в слове
		for (int i = 0; i < 255; i++) {
			if (arr[i] > 0) {
				countSymbols.add(arr[i]);
				System.out.println((char) i + " встречается " + arr[i] + " раз");
			}
		}

		// Если все символы встречаются одинаковое количесвто раз значит пароль валидный
		// вернем истину
		
		for (int i = 1; i < countSymbols.size(); i++) {

			if (countSymbols.get(i) < countSymbols.get(i - 1)) {
				everyoneIsEqual = false;

				if (i == 1) {
					// на первой итерации
					maxIndexSymb = countSymbols.indexOf(countSymbols.get(i - 1));

					minIndexSymb = countSymbols.indexOf(countSymbols.get(i));
				} else {

					if (countSymbols.get(maxIndexSymb) < countSymbols.get(i - 1)) {
						maxIndexSymb = countSymbols.indexOf(countSymbols.get(i - 1));

					} else {
						minIndexSymb = countSymbols.indexOf(countSymbols.get(i));
					}
				}
			} else if (countSymbols.get(i) > countSymbols.get(i - 1)) {
				everyoneIsEqual = false;

				if (i == 1) {
					// на первой итерации
					maxIndexSymb = countSymbols.indexOf(countSymbols.get(i));

					minIndexSymb = countSymbols.indexOf(countSymbols.get(i - 1));
				} else {
					if (countSymbols.get(maxIndexSymb) < countSymbols.get(i)) {
						maxIndexSymb = countSymbols.indexOf(countSymbols.get(i));

					} else {
						minIndexSymb = countSymbols.indexOf(countSymbols.get(i - 1));
					}
				}
			} else {
				// равны. все ок
				// everyoneIsEqual изначально в значении true.
			}
		}
		
		
		if (everyoneIsEqual == true) {
			// Если после проверки все символы равны, вернем результат.
			result = true;
		} else {
			// иначе удалим один символ (будем удалять самый наибольший и самый наимешьний).
			// После каждого удаления символа проверим, все ли символы встречаются
			// одинаковое количество раз.

			// вычтим у наибольшего символа 1.
			symb = countSymbols.get(maxIndexSymb);
			symb -= 1;
			countSymbols.set(maxIndexSymb, symb);

			// проверим, одинаковое ли кол-во символов теперь?
			result = checkSymbols(result, countSymbols);

			if (result == false) {
				//если после удаление символа все символы неодинаковы, возможно
				//поможет удаление наименьшего символа.

				// вернем в исходное состояние ArrayList
				symb = countSymbols.get(maxIndexSymb);
				symb += 1;
				countSymbols.set(maxIndexSymb, symb);

				// Вычтим из наименьшего символа единицу
				symb = countSymbols.get(minIndexSymb);
				symb -= 1;
				if (symb != 0) {
					countSymbols.set(minIndexSymb, symb);
				} else {
					countSymbols.remove(minIndexSymb);
				}

				// проверим, одинаковое ли кол-во символов теперь?
				result = checkSymbols(result, countSymbols);
			}
		}

		return result;

	}
	
	public static boolean checkSymbols(boolean checkResult, ArrayList<Integer> countSymbols) {
		
		/*
		 * Функция выполняет поочередное сравнение символов в массиве. Если все символы равны друг другу
		 * возвращается истина. 
		 */

		for (int i = 1; i < countSymbols.size(); i++) {
			if (countSymbols.get(i) == countSymbols.get(i - 1)) {
				checkResult = true;
			} else {
				checkResult = false;
				break;
			}
		}

		return checkResult;

	}

	public static String[] TreeOfLife(int H, int W, int N, String [] tree) {
		
		/*
		 * 
		 * Древо Жизни Андрассил
		 * 
		 * Только в Изумрудном Сне существует Древо Жизни Андрассил. Племена фурболгов,
		 * живущие в гигантском пне Нордскола, из поколения в поколение передают легенду
		 * об этом дереве, которое когда-нибудь вернётся в реальность и очистит мирные
		 * земли от порчи Древних Богов.
		 * 
		 * Главный шаман фурболгов хранит манускрипт, описывающий схему развития
		 * Андрассила. Смоделируйте её на компьютере, чтобы всегда можно было узнать, на
		 * каком году в каком состоянии оно будет находиться.
		 * 
		 * Дерево описывается массивом размером HxW. Каждый элемент массива принимает
		 * значение либо 0 (пусто), либо 1 (ветка дерева). При этом у каждого
		 * элемента-ветки имеется дополнительная характеристика, равная сроку её жизни в
		 * годах.
		 * 
		 * Исходные данные: размер массива, количество лет для моделирования, и
		 * начальная структура дерева в виде текстового изображения (списка текстовых
		 * строк).
		 * 
		 * Например, размер 3x4, моделируем 12 лет, каждый пустой элемент задаётся
		 * символом ".", каждая ветка -- символом "+" (её возраст считается равным 1
		 * году):
		 * 
		 * 3 4 12
		 * 
		 * .+.. ..+. .+..
		 * 
		 * Каждый год дерево перерождается по следующему алгоритму: - в "первый"
		 * (чётный) год все ветки стареют на один год, и все пустые клетки заполняются
		 * новыми корнями с возрастом 1 год (визуально всё заполнено символами "+"); -
		 * во "второй" (нечётный) год все ветки стареют на один год; ветки, возраст
		 * которых три или более лет, погибают, уничтожая также четыре окружающие ветки
		 * (если они существуют) -- по горизонтали и вертикали.
		 * 
		 * Процесс гибели веток с соседями происходит одновременно, т.е. надо учитывать,
		 * что каждая ветка с возрастом 3+ лет обязательно уничтожает окружающие ветки
		 * (нельзя удалять ветки-соседи простым перебором, потому что соседи тоже в свою
		 * очередь могут удалять своих соседей).
		 * 
		 * В примере для наглядности заменим ветки на числа с возрастом веток.
		 * 
		 * Исходное дерево:
		 * 
		 * .1.. ..1. .1..
		 * 
		 * Прошёл 1-й "чётный" год:
		 * 
		 * 1211 1121 1211
		 * 
		 * 2-й "нечётный" год:
		 * 
		 * 2322 2232 2322
		 * 
		 * Уничтожение:
		 * 
		 * ...2 2... ...2
		 * 
		 * 3-й "чётный" год (по чётным годам старые ветки не уничтожаются):
		 * 
		 * 1113 3111 1113
		 * 
		 * 4-й "нечётный" год:
		 * 
		 * 2224 4222 2224
		 * 
		 * Уничтожение:
		 * 
		 * .2.. ..2. .2..
		 * 
		 * и т. д.
		 * 
		 * Напишите программу, которая моделирует N лет развития дерева, и выводит его
		 * результирующую форму -- список/массив строк (используются только символы "."
		 * и "+").
		 * 
		 * Функция
		 * 
		 * string [] TreeOfLife(int H, int W, int N, string [] tree)
		 * 
		 * получает высоту H (количество строк) и ширину W (длина строк) дерева,
		 * количество лет моделирования N и сам список строк, задающий начальное дерево
		 * с помощью "." и "+".
		 * 
		 * Например, исходный пример:
		 * 
		 * TreeOfLife(3,4, 12, [".+..","..+.",".+.."])
		 * 
		 */
		
		
		String[] result = new String[H];
		//начальное заполнение
		//H - строки W - столбцы
		int[][] treeDescription = new int[H][W];
		char chSymbol =' ';
		int intSymbol = 0;
		
		// заполним двумерный массив
		for (var i = 0; i < treeDescription.length; i++) {
			for (var j = 0; j < treeDescription[i].length; j++) {

				chSymbol = tree[i].charAt(j);

				if (chSymbol == '+') {
					intSymbol = 1;
					treeDescription[i][j] = intSymbol;
				}
			}
		}
		
		//начальное заполнение
		System.out.println("Начальное заполнение " + Arrays.deepToString(treeDescription));
		
		//Моделирование развития дерева
		//начинаем с четного года
		int counterYears = 1;
		int valueLine = 0;
		int valueColumn = 0;
		LinkedList<Integer> coordinatesMaxValut = new LinkedList<>();
		int maxVal = 0;
		
		do {
			
			//на каждом году жизни увеличиваем время жизни дерева на 1.
			for (var i = 0; i < treeDescription.length; i++) {
				for (var j = 0; j < treeDescription[i].length; j++) {
					
					treeDescription[i][j]++;
	
				}
			}
			
			System.out.println("Прошел 1 год: " + Arrays.deepToString(treeDescription));
			//если счетчик лет - четное число, будем уничтожать ветки
			//т.к. в условии задачи четные числа - нечетный год.
			if(counterYears % 2 == 0) {
				
				//найдем индексы максимальных значений.
				for (var i = 0; i < treeDescription.length; i++) {
					for (var j = 1; j < treeDescription[i].length; j++) {
										
						if(treeDescription[i][j] > treeDescription[i][j - 1]) {
							valueLine = i;
							valueColumn = j;
						}else if (treeDescription[i][j] < treeDescription[i][j - 1]){
							valueLine = i;
							valueColumn = j - 1;
							}
						
						}
					//запишем координаты макс занчения
					coordinatesMaxValut.addLast(valueLine);
					coordinatesMaxValut.addLast(valueColumn);
					
					}
				
				//удалим максимальные значения и те которые рядом с ним
				
				for (var i = 0; i < treeDescription.length; i++) {
					for (var j = 0; j < treeDescription[i].length; j++) {

						// координаты макс значения для текуей строки
						if (j == 0) {
							valueLine = coordinatesMaxValut.pollFirst();
							valueColumn = coordinatesMaxValut.pollFirst();
							
							maxVal = treeDescription[valueLine][valueColumn];
						}

						if (treeDescription[i][j] != 0) {
							// это макс в тек строке?
							if (maxVal == treeDescription[i][j] && maxVal >= 3) {
								// удаляем крестом

								// текущую
								treeDescription[i][j] = 0;
								
								// вверх
								if (i - 1 >= 0) {
									// можно удалять?
									if(maxVal != treeDescription[i - 1][j]) {
									treeDescription[i - 1][j] = 0;
									}
									
								}
								// вниз
								if (i + 1 <= treeDescription.length - 1) {
									// можно удалять
									if (maxVal != treeDescription[i + 1][j]) {										
									treeDescription[i + 1][j] = 0;
									}
									
								}
								// вправо
								if (j + 1 <= treeDescription[i].length - 1) {
									
									if(maxVal != treeDescription[i][j + 1]) {										
									treeDescription[i][j + 1] = 0;
									}
								}
								// влево
								if (j - 1 >= 0) {

									if (maxVal != treeDescription[i][j - 1]) {
										treeDescription[i][j - 1] = 0;
									}								
								}
							}
						}
					}
				
				}	
				
				System.out.println("Уничтожение "+ Arrays.deepToString(treeDescription));

			}
			
			counterYears++;
			System.out.println("Итог "+ Arrays.deepToString(treeDescription));
			
		}while(counterYears <= N);
		
		//моделирование окончено. Вернем резултат в виде "." и "+"
		String str = "";
		for (var i = 0; i < treeDescription.length; i++) {
			for (var j = 0; j < treeDescription[i].length; j++) {
				
				if (treeDescription[i][j] != 0) {
					str += "+";
				}else {
					str += ".";
				}
				
			}
			
			result[i] = str;
			str = "";
		}
		
		
		return result;		
	}
	
	public static void MatrixTurn(String Matrix[], int M, int N, int T) {
		
		/*
		 * 
		 * Матрица: Вращение
		 * 
		 * К сожалению, никто не может объяснить, что такое Матрица. Ты должен сам
		 * увидеть это.
		 * 
		 * На вход поступает Матрица размером MxN:
		 * 
		 * 1 2 3 4 5 6 
		 * 2 3 4 5 6 7 
		 * 3 4 5 6 7 8 
		 * 4 5 6 7 8 9
		 * 
		 * Ты должен научиться вращать Матрицу относительно её центра по часовой
		 * стрелке.
		 * 
		 * Например, вращение на один шаг:
		 * 
		 * 2 1 2 3 4 5 
		 * 3 4 3 4 5 6 
		 * 4 5 6 7 6 7 
		 * 5 6 7 8 9 8
		 * 
		 * Функция
		 * 
		 * void MatrixTurn(string Matrix[], int M, int N, int T)
		 * 
		 * получает на вход (по ссылке) массив строк (M строк, каждая длиной N; M >= 2,
		 * N >= 2), и вращает его относительно центра по часовой стрелке на T шагов (T
		 * >= 1), как описано выше. То есть результат поворота (повёрнутая матрица)
		 * оказывается в исходном массиве Matrix, переданном в функцию по ссылке как
		 * аргумент.
		 * 
		 * Минимальное значение из чисел M,N обязательно чётно.
		 * 
		 * Пример вызова:
		 * 
		 * MatrixTurn(["123456", "234567", "345678", "456789"], 4,6, 3)
		 * 
		 */
		
		
		//Двумерный массив по пришедшим данным
		int [][] originalMatrix = new int[M][N];
		//Вспомогательный массив для результата сдвига
		int[][] rotatedMatrix = new int[M][N];
		
		//Заполним двумерный массив данными из массива matrix
		for (var i = 0; i < originalMatrix.length; i++) {
			for (var j = 0; j < originalMatrix[i].length; j++) {

				originalMatrix[i][j] = Character.getNumericValue(Matrix[i].charAt(j));
				
			}
		}
		
		System.out.println("исходный " + Arrays.deepToString(originalMatrix));
		//Выполним сдвиг на нужное количество шагов
		turnArray(originalMatrix, rotatedMatrix, M, N, T);
		
		System.out.println("результат " + Arrays.deepToString(originalMatrix));
		
		//Заполним одномерный массив matrix результатом сдвига из originalMatrix
		String str = "";
		
		for (var i = 0; i < originalMatrix.length; i++) {
			for (var j = 0; j < originalMatrix[i].length; j++) {
				
				str += Integer.toString(originalMatrix[i][j]);
  
			}
			Matrix[i] = str;
			str = "";
		}
		
		System.out.println("в одномерном массиве " + Arrays.toString(Matrix));
	}
	
	private static void turnArray(int[][] originalMatrix, int[][] rotatedMatrix, int M, int N, int T) {

		/*
		 * Функция вращает прямоугольную  матрицу по часовой стрелки на
		 * заданное Т шагов. Результат вращения записывается в вспомогательную матрицу
		 * rotatedMatrix. После окончания цикла, результат сдвига переписывается в
		 * originalMatrix для последующего сдвига.
		 */

		do {

			for (int k = 0; k < M / 2; k++) { // border -> center
				for (int j = k; j < N - 1 - k; j++) { // left -> right

					// Строка верх
					int top = originalMatrix[k][j];
					if (rotatedMatrix[k][j] == 0) {
						rotatedMatrix[k][j] = originalMatrix[k + 1][j];
					}
					if (rotatedMatrix[k][j + 1] == 0) {
						rotatedMatrix[k][j + 1] = top;
					}

					// Правая сторона
					if (M % 2 == 0) {

						if (j < M / 2) {
							
							int right = originalMatrix[j][N - 1 - k];
							if (rotatedMatrix[j][N - 1 - k] == 0) {
								rotatedMatrix[j][N - 1 - k] = originalMatrix[j][N - 2 - k];
							}
							if (j + 1 < M) {
								rotatedMatrix[j + 1][N - 1 - k] = right;
							}
						}

					} else {
						if (j <= M / 2) {
							
							int right = originalMatrix[j][N - 1 - k];
							if (rotatedMatrix[j][N - 1 - k] == 0) {
								rotatedMatrix[j][N - 1 - k] = originalMatrix[j][N - 2 - k];
							}
							if (j + 1 < M) {
								rotatedMatrix[j + 1][N - 1 - k] = right;
							}
						}
					}
	
					// Строка низ
					int bottom = originalMatrix[M - 1 - k][N - 1 - j];
					if (rotatedMatrix[M - 1 - k][N - 1 - j] == 0) {
						rotatedMatrix[M - 1 - k][N - 1 - j] = originalMatrix[M - 2 - k][N - 1 - j];
					}
					if (rotatedMatrix[M - 1 - k][N - 2 - j] == 0) {
						rotatedMatrix[M - 1 - k][N - 2 - j] = bottom;
					}

					// Левая сторона
					if (M % 2 == 0) {

						if (j < M / 2) {
							
							int left = originalMatrix[M - 1 - j][k];
							if (rotatedMatrix[M - 1 - j][k] == 0) {
								// сдвинутый элемент в крайний левый угол нового массива
								rotatedMatrix[M - 1 - j][k] = originalMatrix[M - 1 - k][j + 1];
							}
							if (j < M) {
								// крайний левый элемент оригинальной матрицы записывается со сдвигом на 1
								rotatedMatrix[M - 2 - j][k] = left;
							}
						}
					} else {
						
						if (j <= M / 2) {
							int left = originalMatrix[M - 1 - j][k];
							if (rotatedMatrix[M - 1 - j][k] == 0) {
								rotatedMatrix[M - 1 - j][k] = originalMatrix[M - 1 - k][j + 1];
							}
							if (j < M) {
								rotatedMatrix[M - 2 - j][k] = left;
							}
						}	
					}
					

				}
			}

			System.out.println("результат сдвига " + Arrays.deepToString(rotatedMatrix));

			// перепишем массив originalMatrix
			for (var i = 0; i < originalMatrix.length; i++) {
				for (var j = 0; j < originalMatrix[i].length; j++) {
					
					if (M / 2 == 1) {
						// значит нет внутреннего слоя. сдвиг был выполнен только по внешнему
						// необходимо записать число которое в середине.
						// Например матрица 3х4 - цикла по внутреннему слою не будет.
						if (rotatedMatrix[i][j] != 0) {
							originalMatrix[i][j] = rotatedMatrix[i][j];
							rotatedMatrix[i][j] = 0;
						}
					} else {
						originalMatrix[i][j] = rotatedMatrix[i][j];
						rotatedMatrix[i][j] = 0;
					}
					
				}
			}
			System.out.println("запись в исходную " + Arrays.deepToString(originalMatrix));
			T--;

		} while (T > 0);
		
	}
	
	public static boolean TransformTransform(int A[], int N) {
		
		/* 
		 * Чубакка и гравитационные колодцы
		 * 
		 * "Тысячелетний сокол" капитана Соло преодолевает 35 тысяч парсеков за
		 * считанные дни. Однако гранд-адмирал Империи Траун активизировал
		 * "звездные разрушители", оснащенные генераторами гравитационных колодцев,
		 * которые формируют в гиперпространстве гравитационные тени-помехи.
		 * 
		 * Чтобы оперативно выявлять подобные космические аномалии, Чубакке требуется
		 * срочно пропатчить бортовой софт "Сокола" -- реализовать специальную
		 * трансформирующую трансформацию, которая должна за разумное время
		 * преобразовывать входной массив карты гиперпрыжка и выявлять её ключевой ключ
		 * -- секретное значение, четность которого свидетельствует о наличии на
		 * маршруте имперских помех.
		 * 
		 * На входе одномерный массив A (индексация начинается с нуля) случайных
		 * положительных целых чисел (возможно, повторяющихся).
		 * 
		 * Трансформирующая трансформация S массива A происходит так:
		 * 
		 * 0. Выходной массив/список B исходно пуст.
		 * 
		 * 1. Организуем первый цикл для i, начиная с 0 и до длины массива A минус 1.
		 * 
		 * 2. Организуем внутри первого цикла второй цикл для j, начиная с 0 и до длины
		 * массива A минус i минус 1.
		 * 
		 * 3. Рассчитываем значение k = i + j.
		 * 
		 * 4. Из поддиапазона A[ j..k ] выбираем максимальное значение и записываем в
		 * конец списка B.
		 * 
		 * По завершении всех циклов список B считаем трансформирующей трансформацией,
		 * которую назовём S(A). Говоря программистским языком, есть функция S(A),
		 * которая возвращает список B.
		 * 
		 * 5. Ключевой ключ находится суммированием всех элементов списка, получаемого
		 * двойной трансформацией S(S(A)) (результат первой трансформации подаётся на
		 * вход второй трансформации).
		 * 
		 * Реализуйте алгоритм поиска ключевого ключа и выводите true, если он чётный.
		 * 
		 * Функция
		 * 
		 * boolean TransformTransform(int A[], int N)
		 * 
		 * получает на вход массив из N (N >= 1) целых положительных чисел и возвращает
		 * true, если сумма всех значений результата двойной трансформации A чётная. 
		 */

		boolean result = true;
		// преобразуем массив А в LinkedList
		LinkedList<Integer> C = new LinkedList<Integer>();
		for (int i = 0; i < A.length; i++) {
			C.add(A[i]);
		}

		// подадим на вход нашей функции LinkedList
		C = transformR(transformR(C));

		// Результат двойной трансформации
		for (Integer s : C) {
			System.out.println(s);
		}

		// Подсчитаем сумму всех элементов в коллекции
		return result = checkForParity(C);

		//return result;
		
	}

	private static boolean checkForParity(LinkedList<Integer> list) {

		/*
		 * Функция выполняет суммирование всех элементов в коллекции. Результат работы -
		 * Истина если сумма всех элементов четная, Ложь в проивном случае.
		 */

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

		/*
		 * Функция выполняет обход коллекции listA двумя циклами, с последующей записью
		 * результата сложения индексов внешнего и внутреннего цикла в коллекцию B.
		 */

		LinkedList<Integer> B = new LinkedList<Integer>();

		// 1. цикл по i с 0 до a.lenght - 1.
		for (int i = 0; i <= listA.size() - 1; i++) {

			// 2.цикл для j с 0 до A.length - 1 - i.
			for (int j = 0; j <= listA.size() - 1 - i; j++) {

				// 3. рассчитываем значение k = i+j.
				int k = i + j;
				// System.out.println(k);

				// 4. определим наибольшее значение в массиве а в диапазоне
				// от j до k и запишем в конец масива.
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

		/*
		 * Функция выполняет поиск и запись наибольшего значения из коллекции А, в
		 * коллекцию В.
		 */

		int maxVal = 0;
		for (int i = j; i <= k; i++) {

			int value = A.get(i);
			if (maxVal < value) {
				maxVal = value;
			}
		}

		b.addLast(maxVal);

	}
	
	public static String BalancedParentheses(int N) {
		
		/*
		 * 
		 * Саурон и многомерное Кольцо Всевластья
		 * 
		 * Оказывается, Саурон, некогда правивший всем Мордором, развоплотился не
		 * навсегда.
		 * 
		 * Он вновь готовит легионы орков, а Ородруин непрерывно засыпает все
		 * окрестности чёрным пеплом. Единственный способ противостоять растущей власти
		 * Саурона -- изобрести заклинание генерации многомерного Кольца Всевластья,
		 * дабы полностью и окончательно развоплотить Саурона по всему Иномирью.
		 * 
		 * Напишите рекурсивную функцию, которая выдаёт все корректные сбалансированные
		 * комбинации круглых скобок.
		 * 
		 * На вход функции поступает количество открывающих скобок.
		 * 
		 * Например,
		 * 
		 * 1 = "()" 2 = "(())" "()()"
		 * 
		 * Внешне и внутренне несбалансированные комбинации считаются ошибочными:
		 * 
		 * "()))" ")(()" "(()" -- неверно
		 * 
		 * Функция
		 * 
		 * string BalancedParentheses(int N)
		 * 
		 * получает на вход количество открывающих скобок N (N >= 1) и возвращает
		 * строку, в которой через пробел записаны все сгенерированные комбинации скобок
		 * (в произвольном порядке).
		 * 
		 * Например,
		 * 
		 * BalancedParentheses(1) = "()" BalancedParentheses(2) = "(()) ()()"
		 * 
		 */
	
		String result = "";
		//в массиве будем собирать возможные комбинации
		//N*2 т.к. нам нужные корректные пары скобок
		char[] str = new char[N * 2];
		//комбинацию из массива будем переписывать в коллекцию
		ArrayList list = new ArrayList();
		addParenthesis(list, N, N, str, 0);
		
		//Вернем результат.
		//Перепишем лист в строку добавляя проблеы
		for (int i = 0; i < list.size(); i++) {
			
			if(i + 1 == list.size()) {
				result += list.get(i);
			}else {
				result += list.get(i) + " ";
			}
		}
		
		return result;
		
//		//еще один варант решения
		
//		public static ArrayList<String> generateParenthesis(int n) {
//		
//				    ArrayList<String> result = new ArrayList<String>();
//				    StringBuilder sb = new StringBuilder();
//		
//				    generate(n, 0, 0, result, sb);
//				    return result;
//				}
//		
//			public static void generate(int n, int left, int right, ArrayList<String> result,
//				        StringBuilder sb) {
//		
//				    if (left < right) {
//				        return;
//				    }
//				    if (left == n && right == n) {
//				        result.add(sb.toString());
//				        //sb.delete(0,sb.length());
//				        return;
//				    }
//				    if (left == n) {
//				        generate(n, left, right + 1, result, sb.append(')'));
//				        //delete current ')'.
//				        sb.delete(sb.length() - 1, sb.length());
//				        return;
//				    }
//		
//				    generate(n, left + 1, right, result, sb.append('('));
//				    //delete current '(' after you finish using it for next recursion.
//				    sb.delete(sb.length() - 1, sb.length());
//				    generate(n, left, right + 1, result, sb.append(')'));
//				    //same as above here.
//				    sb.delete(sb.length() - 1, sb.length());
//				}
	
	}
	
	public static void addParenthesis(ArrayList list, int leftRem, int rightRem, char[] str, int index) {
		
		if (leftRem < 0 || rightRem < leftRem) {
			// Неверное состояние
			return; 
		}
		
		if (leftRem == 0 && rightRem == 0) { 
			//Скобок не осталось
			list.add(String.copyValueOf(str));
		} else {
			str[index] = '('; /* Добавить левую скобку в массив, если они еще остались . */
			addParenthesis(list, leftRem - 1, rightRem, str, index + 1);
			
			str[index] = ')'; /* Добавить правую скобку, если выражение корректно */
			addParenthesis(list, leftRem, rightRem - 1, str, index + 1);
		}
	}
	
	public static boolean Football(int F[], int N) {
		
		/* 
		 * Тренируем сборную России по футболу
		 * 
		 * Вы, тренер сборной России по футболу, ухитрились вывести её в финал
		 * чемпионата мира. Ваша задача -- определить, можно ли улучшить расстановку
		 * игроков на поле перед решающей встречей, или всё бесполезно и придётся
		 * использовать текущий вариант. Но у вас в распоряжении остались только два
		 * тренерских приёма, времени уже нету, и использовать можно только один из них.
		 * 
		 * На входе -- массив произвольных целых чисел (значения не повторяются).
		 * 
		 * Ваша задача -- попробовать упорядочить его по возрастанию с помощью
		 * однократного применения одного из двух приёмов: 1. Поменять местами два
		 * произвольных элемента массива. 2. Изменить на обратный порядок произвольной
		 * последовательной цепочки элементов в массиве.
		 * 
		 * Например, на входе
		 * 
		 * 1) 1 3 2 Упорядочиваем правилом 1, меняем местами 3 и 2: 1 2 3
		 * 
		 * 2) 3 2 1
		 * 
		 * Упорядочиваем правилом 2, меняем порядок с первого элемента до последнего: 1
		 * 2 3
		 * 
		 * 3) 1 7 5 3 9 Упорядочиваем правилом 1, меняем местами 7 и 3: 1 3 5 7 9
		 * 
		 * 4) 9 5 3 7 1 Нельзя упорядочить.
		 * 
		 * 5) 1 4 3 2 5 Упорядочиваем правилом 2, меняем порядок с второго элемента до
		 * четвёртого: 1 2 3 4 5
		 * 
		 * Функция
		 * 
		 * boolean Football(int F[], int N)
		 * 
		 * получает на вход массив F из N (N >= 1) целых неповторяющихся чисел и
		 * возвращает true, если массив можно упорядочить однократным применением одного
		 * из двух правил.
		 */
		
		
		boolean result = false;
		System.out.println("Исходный " + Arrays.toString(F));

		
		if (N == 1) {
			result = true;
		} else {
			//массив уже упорядочен?
			result = checkSortArray(F, result);
			
			if (result == false) {
				// значит не упорядочен.
				// проанализируем возможность использования, 1 или 2 метода
				int countWrongSequence = 0;
				LinkedList<Integer> invalidIndexes = new LinkedList<Integer>();
				LinkedList<Integer> validIndexes = new LinkedList<Integer>();

				for (int i = 1; i < N; i++) {

					if (F[i] > F[i - 1]) {
						// значит последовательность верная

						// конец массива?
						if (i + 1 == N) {
							// тогда текущий элемент в правильной последовательности
							validIndexes.add(i);
							invalidIndexes.add(i - 1);
						} else {
							// предыдущий элеменет в правильной последовательности
							validIndexes.add(i - 1);
						}

					} else if (F[i] < F[i - 1]) {
						// последовательность не верная
						countWrongSequence++;
						invalidIndexes.add(i - 1);

						// конец массива?
						if (i + 1 == N) {
							// не потерять последний элемент
							invalidIndexes.add(i);
						}
					}
				}

				for (Integer value : invalidIndexes) {
					System.out.println(value);
				}
				System.out.println("------");
				for (Integer value : validIndexes) {
					System.out.println(value);

				}

				if (countWrongSequence == 1 || countWrongSequence == 2) {
					// значит можно упорядочить, используя метод 1

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
					// отсортирован корректно?
					result = checkSortArray(F, result);
					System.out.println("После метода 1 " + Arrays.toString(F));

				} else if (countWrongSequence > 2) {
					System.out.println("используем метод 2");
					// попробуем упорядочить методом 2
					// нужно повернуть массив целиком или определенный диапазон?

					// определим диапазон разворота массива.
					int len = invalidIndexes.size();

					if (len == N) {
						// если длина диапазона равна длине массива, значит разворачиваем весь массив
						for (int i = 0; i < N / 2; i++) {
							int temp = F[i];
							F[i] = F[N - 1 - i];
							F[N - 1 - i] = temp;
						}

						System.out.println("После метода 2 " + Arrays.toString(F));
						result = checkSortArray(F, result);

					} else {
						System.out.println("пробуем перевернуть диапазон");
						// найдем такой диапазон, в котором идекс увеличивается на 1 шаг.
						// если например диапазон 0,1,3 знчаит 2 элемент на своем месте.
						// Нужно взять от 0 до 2.
						// Если диапазонов будет НЕ один тогда возвращать ЛОЖЬ.
						int counterInd = 0;
						// обойдем коллекцию неверных индексов и узнаем сколько диапазонов
						for (int i = 1; i < invalidIndexes.size(); i++) {
							int curr = invalidIndexes.get(i);
							int prev = invalidIndexes.get(i - 1);

							if (prev + 1 != curr) {
								counterInd++;
							}
						}

						if (counterInd == 0) {
							// найдем некоректный диапазон массива
							int a = invalidIndexes.getFirst();
							//int b = invalidIndexes.getLast();

							// перепишем его в новый массив
							int[] leftNoSort = new int[invalidIndexes.size()];
							int cntr = 0;
							for (int i = a; i < N; i++) {
								leftNoSort[cntr] = F[i];
								cntr++;
							}

							// развернем новый массив
							for (int i = 0; i < leftNoSort.length / 2; i++) {
								int temp = leftNoSort[i];
								leftNoSort[i] = leftNoSort[leftNoSort.length - 1 - i];
								leftNoSort[leftNoSort.length - 1 - i] = temp;
							}

							// добавим в новый массив данные по верным индексам
							int[] rSort = new int[N];
							for (int i = 0; i < validIndexes.size(); i++) {
								rSort[validIndexes.get(i)] = F[validIndexes.get(i)];
							}

							// допишем перевернутую часть
							int k = 0;
							for (int i = 0; i < rSort.length; i++) {
								if (rSort[i] == 0) {
									rSort[i] = leftNoSort[k];
									k++;
								}
							}

							System.out.println("После метода 2 " + Arrays.toString(rSort));
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

		/*
		 * Функция проверяет расположение элементов в массиве. Если следующий элемент
		 * меньше чем текущий значит массив не упорядочен по возрастанию. Цикл
		 * прерывается и возвращается ЛОЖЬ.
		 */

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

