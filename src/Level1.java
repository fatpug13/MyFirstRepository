
import java.util.*;
import java.util.stream.IntStream;

public class Level1 {

	public static int[] UFO(int N, int[] data, boolean octal) {

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

		int k = 0;
		String str = "";

		for (int i = 0; i < data.length; i++) {
			str = Integer.toString(data[i]);
			k = Integer.parseInt(str, value);
			result[i] = k;
		}
	}
}
