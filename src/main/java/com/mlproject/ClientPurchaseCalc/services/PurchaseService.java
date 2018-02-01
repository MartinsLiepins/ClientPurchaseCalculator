package com.mlproject.ClientPurchaseCalc.services;

import com.mlproject.ClientPurchaseCalc.productCatalogItems.ProductCatalogBuilder;
import org.springframework.stereotype.Service;

/**
 * Created by martins.
 */

@Service
public class PurchaseService {

	void createcatalog(){
		ProductCatalogBuilder catalog = new ProductCatalogBuilder();
		catalog.saveProductCatalogToDB();
	}



}
