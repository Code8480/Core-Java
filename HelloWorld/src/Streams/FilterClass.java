package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	
	int id;
	String name;
	double price;
	
	Product(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
	
	
	
}

public class FilterClass {

	public static void main(String[] args) {
		
		List<Product> prodList = new ArrayList<>(List.of(
				new Product(101, "Dell", 500.50),
				new Product(102, "HP", 1100.50),
				new Product(103, "Lenovo", 2100.50),
				new Product(104, "Apple", 2500.75),
				new Product(105, "Surface", 1600.80)));
		
		List<Product> filterProdList = new ArrayList<>();
		
		//filter by price
		prodList.
		stream().
		filter(l -> l.price > 1500).
		forEach(l -> System.out.println("Id: "+ l.id + ", Brand: " 
		+ l.name + ", Price: " + l.price));
		
		//adding to another collection and printing
		filterProdList = prodList.
				stream().
				filter(l -> l.price > 1500).
				collect(Collectors.toList());
		
		System.out.println("---------------------------------");
		
		Iterator<Product> it = filterProdList.iterator(); 
		while(it.hasNext()) {
			Product pr = it.next();
			System.out.println("Id :"+pr.getId()+", Brand: "+pr.name+", Price: "+pr.price);
		}
		
		System.out.println("---------------------------------");
		
		for(Product p : filterProdList) {
			System.out.println("Id :"+p.getId()+", Brand: "+p.name+", Price: "+p.price);
		}
		
	}
}
