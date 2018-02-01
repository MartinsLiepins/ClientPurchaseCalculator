package com.mlproject.ClientPurchaseCalc.database.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by martins.
 */

@Entity
@Table(name = "products_catalog")
public class ProductCatalog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(nullable = false, length = 100, name = "product_name")
	private String productName;

	@Column(nullable = false, name = "product_standard_price")
	private BigDecimal standardPrice;

	public ProductCatalog(){}

	public Long getId(){
		return id;
	}
	public String getProductName(){
		return productName;
	}
	public BigDecimal getStandardPrice(){
		return standardPrice;
	}

	public void setId(Long id){
		this.id = id;
	}
	public void setProductName(String productName){
		this.productName = productName;
	}
	public void setStandardPrice(BigDecimal standardPrice){
		this.standardPrice = standardPrice;
	}
}
