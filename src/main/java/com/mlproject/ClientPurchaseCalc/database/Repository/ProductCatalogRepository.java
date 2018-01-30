package com.mlproject.ClientPurchaseCalc.database.Repository;

import com.mlproject.ClientPurchaseCalc.database.model.ProductCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by martins.
 */
public interface ProductCatalogRepository extends JpaRepository<ProductCatalog, Long> {
	ProductCatalog save(ProductCatalog newProductCatalog);
}
