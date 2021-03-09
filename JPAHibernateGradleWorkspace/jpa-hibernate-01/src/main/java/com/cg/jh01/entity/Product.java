package com.cg.jh01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@Column(name="prod_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long prodId;
	
	@Column(name="prod_name")
	private String prodName;
	
	public Product() {
		/* default constructor */
	}

	public Product(String prodName) {
		super();
		this.prodName = prodName;
	}

	public Long getProdId() {
		return prodId;
	}
	
	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	@Override
	public String toString() {
		return String.format("prodId=%s, prodName=%s", prodId, prodName);
	}

	
	
	
}
