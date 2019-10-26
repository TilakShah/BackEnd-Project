package com.PrayoshaGems.DAO;

import java.util.List;

import com.PrayoshaGems.Model.Product;

public interface ProductDAO {
	
	public void addProduct (Product product_Obj);
	public void deleteProduct (Product product_Obj);
	public void updateProduct (Product product_Obj);
	public Product displayProductByName (Product product_Obj);
	public  List<Product> displayProducts();
	
	

}
