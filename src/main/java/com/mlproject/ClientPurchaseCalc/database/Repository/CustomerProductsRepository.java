package com.mlproject.ClientPurchaseCalc.database.Repository;

import com.mlproject.ClientPurchaseCalc.database.model.CustomerProducts;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by martins.
 */
public interface CustomerProductsRepository extends JpaRepository<CustomerProducts, Long> {
	CustomerProducts save(CustomerProducts customerProduct);

}
