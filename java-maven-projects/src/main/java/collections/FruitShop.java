package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class FruitShop {
	SortedMap<Integer, String> basket = new TreeMap<Integer, String>();

	public FruitShop() {

	}

	public void addToBasket(int key, String fruit) {
		basket.put(key, fruit);
	}

	public SortedMap<Integer, String> getBasket() {
		return basket;
	}
}
