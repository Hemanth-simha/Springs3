package com.jspiders.dip.pkg1;

public class DisplayProduct {

	private Product product;

	public DisplayProduct() {

	}

	public DisplayProduct(Product product) {
		this.setProduct(product);
	}

	public void display() {
		int items = getProduct().readItems();
		System.out.println("Number of items present in database : " + items);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
