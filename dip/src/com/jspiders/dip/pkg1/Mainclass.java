package com.jspiders.dip.pkg1;

public class Mainclass {

	public static void main(String[] args) {
		
		Product product = ProductFactory.createProduct();
		
		DisplayProduct displayProduct = new DisplayProduct();
		displayProduct.setProduct(product);
		displayProduct.display();
		
	}

}
