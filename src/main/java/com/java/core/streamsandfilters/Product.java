package com.java.core.streamsandfilters;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = -2044698742814210517L;
	private Integer id;
	private String productName;
	private Double productPrice;
	private ProductType productType;
	

	public Product() {
		super();
	}

	public Product(Integer id, String productName, Double productPrice, ProductType productType) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType = productType;
	}

	public Integer getId() {
		return id;
	}

	public Product setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getProductName() {
		return productName;
	}

	public Product setProductName(String productName) {
		this.productName = productName;
		return this;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public Product setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
		return this;
	}

	public ProductType getProductType() {
		return productType;
	}

	public Product setProductType(ProductType productType) {
		this.productType = productType;
		return this;
	}

}
