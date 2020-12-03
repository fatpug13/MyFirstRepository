
import java.util.*;

public class Level1 {

	public static String[] ShopOLAP(int N, String[] items) {

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
		
		List list = new ArrayList(productSales.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				return b.getValue().compareTo(a.getValue());
			}
		});

		result = new String[list.size()];
		String str = "";
		String product = "";

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

}
