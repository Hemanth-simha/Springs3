package com.jspiders.dip.pkg1;

public class ProductFactory {
	
	public static Product createProduct()
	{
		 Product product = new SQLRepository();
		 return product;
	}
	
	
}
