package com.java.core.streamsandfilters;

public class ProductResult {
	private Integer totalProducts;
	private Double minPrice;
	private Double maxPrice;
	private Double avgPrice;
	public Integer getTotalProducts() {
		return totalProducts;
	}
	public void setTotalProducts(Integer totalProducts) {
		this.totalProducts = totalProducts;
	}
	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	public Double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}
	public Double getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(Double avgPrice) {
		this.avgPrice = avgPrice;
	}
	@Override
	public String toString() {
		return "ProductResult [totalProducts=" + totalProducts + ", minPrice=" + minPrice + ", maxPrice=" + maxPrice
				+ ", avgPrice=" + avgPrice + "]";
	}
	
	
}
