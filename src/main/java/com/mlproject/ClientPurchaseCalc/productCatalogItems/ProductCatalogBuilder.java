package com.mlproject.ClientPurchaseCalc.productCatalogItems;

import com.mlproject.ClientPurchaseCalc.database.Repository.ProductCatalogRepository;
import com.mlproject.ClientPurchaseCalc.database.model.ProductCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by martins.
 */
@Component
public class ProductCatalogBuilder {

	private Products productList = new Products();
	@Autowired
	private ProductCatalogRepository repository;

	public void saveProductCatalogToDB(){

		List<String> products = productList.buildProducts();
		List<BigDecimal> prices = productList.buildPrice();

		for(String product : products){
			ProductCatalog newItem = new ProductCatalog();
			newItem.setProductName(product);
			newItem.setStandardPrice(prices.get(products.indexOf(product)));
			repository.save(newItem);
		}
	}
}
