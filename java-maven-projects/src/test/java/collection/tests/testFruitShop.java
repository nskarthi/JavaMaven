package collection.tests;

import static org.junit.Assert.assertEquals;

import java.util.Set;
import java.util.SortedMap;

import org.junit.Test;

import collections.FruitShop;
import collections.StudentBO;

public class testFruitShop {
	@Test
	public void testStudentMapSize() {
		FruitShop basket = new FruitShop();
		basket.addToBasket(3, "Apple");
		basket.addToBasket(5, "Mango");
		basket.addToBasket(2, "Banana");
		basket.addToBasket(1, "Strawberry");
		basket.addToBasket(4, "Guava");

		Set<Integer> keys = basket.getBasket().keySet();
		SortedMap<Integer, String> basketMap = basket.getBasket();
		int i = 1;
		for (int key : keys)
			assertEquals(basketMap.get(key), i++);
	}
}
