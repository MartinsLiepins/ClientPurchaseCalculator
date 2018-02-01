package com.mlproject.ClientPurchaseCalc.database.Repository;

import com.mlproject.ClientPurchaseCalc.database.model.CustomerProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by martins.
 */
@Repository
public interface CustomerProductsRepository extends JpaRepository<CustomerProducts, Long> {
	CustomerProducts save(CustomerProducts customerProduct);

}
