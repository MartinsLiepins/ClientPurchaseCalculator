package com.mlproject.ClientPurchaseCalc.database.Repository;

import com.mlproject.ClientPurchaseCalc.database.model.ProductCatalog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by martins.
 */
@Repository
public interface ProductCatalogRepository extends CrudRepository<ProductCatalog, Long> {
	ProductCatalog save(ProductCatalog newProduct);
}
