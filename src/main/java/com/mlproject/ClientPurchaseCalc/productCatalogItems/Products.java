package com.mlproject.ClientPurchaseCalc.productCatalogItems;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by martins.
 */

public class Products {
	public Products(){}

	public List<String> buildProducts(){
		List<String> products = new ArrayList<>();
		products.add("milk 1 liter");
		products.add("bread 0,8 kg");
		products.add("water 5 liters");
		products.add("sausage 1 kg");
		products.add("cheese 0,5 kg");
		return products;
	}

	public List<BigDecimal> buildPrice(){
		List<BigDecimal> price = new ArrayList<>();
		price.add(new BigDecimal(0.90));
		price.add(new BigDecimal(1.50));
		price.add(new BigDecimal(2.00));
		price.add(new BigDecimal(6.00));
		price.add(new BigDecimal(9.50));
		return price;
	}
}
