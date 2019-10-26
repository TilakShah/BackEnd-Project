package com.PrayoshaGems.Model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name= "Products")


public class Product {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int product_Id;
	

	@Column
	private String product_Name;
	private String product_Description;
	private String product_Brand;
	private float product_Price;
	private int product_Quantity;
	
	@OneToMany(fetch=FetchType.EAGER)
	private Set<Order> order_Obj;
	
	
	@ManyToOne (cascade=CascadeType.ALL)
	private Category category_Obj;
	
	
	@OneToMany(fetch=FetchType.EAGER)
	private Set<CartItem> cartitem_Obj;
	
	
	
	
	
	public Category getCategory_Obj() {
		return category_Obj;
	}
	public void setCategory_Obj(Category category_Obj) {
		this.category_Obj = category_Obj;
	}
	
	public Set<Order> getOrder_Obj() {
		return order_Obj;
	}
	public void setOrder_Obj(Set<Order> order_Obj) {
		this.order_Obj = order_Obj;
	}
	public Set<CartItem> getCartitem_Obj() {
		return cartitem_Obj;
	}
	public void setCartitem_Obj(Set<CartItem> cartitem_Obj) {
		this.cartitem_Obj = cartitem_Obj;
	}
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getProduct_Description() {
		return product_Description;
	}
	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}
	public String getProduct_Brand() {
		return product_Brand;
	}
	public void setProduct_Brand(String product_Brand) {
		this.product_Brand = product_Brand;
	}
	public float getProduct_Price() {
		return product_Price;
	}
	public void setProduct_Price(float product_Price) {
		this.product_Price = product_Price;
	}
	public int getProduct_Quantity() {
		return product_Quantity;
	}
	public void setProduct_Quantity(int product_Quantity) {
		this.product_Quantity = product_Quantity;
	}
	
	
	
	
	
}
