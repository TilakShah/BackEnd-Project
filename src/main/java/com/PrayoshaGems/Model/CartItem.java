package com.PrayoshaGems.Model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name= "CartItem")



public class CartItem {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	
	private int cartid;
	@Column

	private int userid;
	private int productid;
	private int quantity;
	private float totalprice;
	
	@ManyToOne (fetch=FetchType.EAGER)
	private UserData userdata_Obj;
	
	@ManyToOne (fetch=FetchType.EAGER)
	private Product product_Obj;
	
	
	
	public UserData getUserdata_Obj() {
		return userdata_Obj;
	}
	public void setUserdata_Obj(UserData userdata_Obj) {
		this.userdata_Obj = userdata_Obj;
	}
	public Product getProduct_Obj() {
		return product_Obj;
	}
	public void setProduct_Obj(Product product_Obj) {
		this.product_Obj = product_Obj;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}
	
	
	
}
