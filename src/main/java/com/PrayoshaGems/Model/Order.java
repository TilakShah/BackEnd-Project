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

@Table(name= "Orders")


public class Order {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int order_Id;
	
	@Column
	private float total_Price;
	private String order_Status;
	private String order_Date;
	
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
	public int getOrder_Id() {
		return order_Id;
	}
	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}
	public float getTotal_Price() {
		return total_Price;
	}
	public void setTotal_Price(float total_Price) {
		this.total_Price = total_Price;
	}
	public String getOrder_Status() {
		return order_Status;
	}
	public void setOrder_Status(String order_Status) {
		this.order_Status = order_Status;
	}
	public String getOrder_Date() {
		return order_Date;
	}
	public void setOrder_Date(String order_Date) {
		this.order_Date = order_Date;
	}
	

}
