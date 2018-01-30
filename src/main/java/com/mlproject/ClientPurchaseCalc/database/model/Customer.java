package com.mlproject.ClientPurchaseCalc.database.model;

import javax.persistence.*;

/**
 * Created by martins.
 */
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(nullable = false, length = 20, name = "company")
	private String company;

	@Column(nullable = false, name = "registration_date")
	private String registrationDate;

	public Customer(){}

	public Long getId(){
		return id;
	}
	public String getCompany(){
		return company;
	}
	public String getRegistrationDate(){
		return registrationDate;
	}
	public void setId(Long id){
		this.id = id;
	}
	public void setCompany(String company){
		this.company = company;
	}
	public void setRegistrationDate(String registrationDate){
		this.registrationDate = registrationDate;
	}
}
