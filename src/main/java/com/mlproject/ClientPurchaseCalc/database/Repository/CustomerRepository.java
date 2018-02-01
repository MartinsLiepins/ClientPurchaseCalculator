package com.mlproject.ClientPurchaseCalc.database.Repository;

import com.mlproject.ClientPurchaseCalc.database.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by martins.
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Customer save(Customer newCustomer);

	Optional<Customer> findCustomerByCompany(String company);
}