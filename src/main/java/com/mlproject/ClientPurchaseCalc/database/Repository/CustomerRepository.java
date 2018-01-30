package com.mlproject.ClientPurchaseCalc.database.Repository;

import com.mlproject.ClientPurchaseCalc.database.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by martins.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Customer save(Customer newCustomer);

	Optional<Customer> findCustomerByCompany(String company);
}