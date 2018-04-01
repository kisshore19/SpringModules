package com.java.core.streamsandfilters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SqlQueryFromInMemory {

	static Map<ProductType, List<Product>>  productsMap = new HashMap<ProductType, List<Product>> ();
	public static void main(String[] args) {
		
		
		/* Map<Integer, String> HOSTING = new HashMap<>();
	        HOSTING.put(1, "linode.com");
	        HOSTING.put(2, "heroku.com");
	        HOSTING.put(3, "digitalocean.com");
	        HOSTING.put(4, "aws.amazon.com");

	        //Map -> Stream -> Filter -> Map
	        Map<Integer, String> collect = HOSTING.entrySet().stream()
	                .filter(map -> map.getKey() == 2)
	                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));*/
	        
	        
		Product product = new Product();
		product.setProductType(ProductType.BUY);
		createProducts();
		
		Map<ProductType, List<Product>> resultProducts= 
		productsMap
		.entrySet()
		.stream()
		.filter(map -> map.getKey().equals(product.getProductType()))
		//.flatMap((k,v)-> v)
		//.map(a -> map.getValue().forEach(a-> a.getProductPrice()>1000))
		.collect(Collectors.toMap(x->x.getKey(), x->x.getValue()));
		//.forEach((k,v) -> System.out.println("Key : "+ k + " Value size : " + v.size()));
		resultProducts.forEach((k,v) -> System.out.println("Key : "+ k + " Value size : " + v.size()));
//		System.out.println(resultProducts);
	}
	
	
	public static void createProducts(){
		
		List<Product>  buyProducts = Arrays.asList(
			new Product(1, "Reliance", 500.00, ProductType.BUY),
			new Product(2, "AXIS", 250.00, ProductType.BUY),
			new Product(3, "INFOSYS", 1250.00, ProductType.BUY),
			new Product(4, "TATAMOTORS", 750.00, ProductType.BUY),
			new Product(5, "EICHER", 12250.00, ProductType.BUY)
		);
		
		List<Product>  sellProducts = Arrays.asList(
		new Product(1, "Reliance", 510.00, ProductType.SELL),
		new Product(2, "AXIS", 270.00, ProductType.SELL),
		new Product(3, "INFOSYS", 1350.00, ProductType.SELL),
		new Product(4, "TATAMOTORS", 800.00, ProductType.SELL),
		new Product(5, "EICHER", 15250.00, ProductType.SELL)
		);
		
		productsMap.put(ProductType.BUY, buyProducts);
		productsMap.put(ProductType.SELL, sellProducts);
	}

}


