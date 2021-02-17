package utils;

import java.util.function.Predicate;

import entities.Product;

public class MyPredicateProduct implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100;
	}

}
