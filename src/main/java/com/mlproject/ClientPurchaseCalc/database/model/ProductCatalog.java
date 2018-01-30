package com.mlproject.ClientPurchaseCalc.database.model;

import javax.persistence.*;

/**
 * Created by martins.
 */

@Entity
@Table(name = "products_katalog")
public class ProductCatalog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(nullable = false, length = 20, name = "product_name")
	private String productName;

	@Column(nullable = false, length = 20, name = "product_standad_price")
	private String standardPrice;
}
