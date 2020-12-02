
import java.util.*;

public class Level1 {

	private static String[] ShopOLAP(int N, String[] items) {

		String[] result = null;
		TreeMap<String, Integer> productSales = new TreeMap<String, Integer>();

		String nameProd = "";
		String priceStr = "";
		boolean fullName = false;
		int currentValue = 0;
		for (int i = 0; i < items.length; i++) {

			for (int j = 0; j < items[i].length(); j++) {

				if (fullName == false) {
					if (items[i].charAt(j) != ' ') {
						nameProd += items[i].charAt(j);
					} else {
						fullName = true;
					}
				} else {
					priceStr += items[i].charAt(j);
				}
			}

			int price = Integer.parseInt(priceStr);
			if (productSales.containsKey(nameProd) == true) {

				currentValue = productSales.get(nameProd);
				price += currentValue;

				productSales.put(nameProd, price);
			} else {
				productSales.put(nameProd, price);
			}
			nameProd = "";
			priceStr = "";
			price = 0;
			fullName = false;
		}

		result = new String[productSales.size()];
		int i = 0;

		for (Map.Entry<String, Integer> entry : productSales.entrySet()) {
			result[i] = entry.getKey() + " " + Integer.toString(entry.getValue());
			i++;
		}
		return result;
	}

}
