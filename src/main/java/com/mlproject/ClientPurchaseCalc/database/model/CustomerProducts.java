package com.mlproject.ClientPurchaseCalc.database.model;

import javax.persistence.*;

/**
 * Created by martins.
 */

@Entity
@Table(name = "customer_products")
public class CustomerProducts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(nullable = false, length = 20, name = "product_name")
	private String productName;

	@Column(nullable = false, name = "date_of_purchase")
	private String dataOfPurchase;

	@ManyToOne(optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	public CustomerProducts(){}


	public Long getId(){
		return id;
	}
	public String getProductName(){
		return productName;
	}
	public String getDataOfPurchase(){
		return dataOfPurchase;
	}
	public Customer getCustomer(){
		return customer;
	}
	public void setId(Long id){
		this.id = id;
	}
	public void setProductName(String productName){
		this.productName = productName;
	}
	public void setDataOfPurchase(String dataOfPurchase){
		this.dataOfPurchase = dataOfPurchase;
	}
	public void setCustomer(Customer customer){
		this.customer = customer;
	}
}
