package com.PrayoshaGems.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity

@Table(name= "UserData")



public class UserData {
	
	
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	
	private int user_Id;
	
	@Column
	
	@Size (min=4,message="Min lenght 4 Required")
	private String user_Name;
	@Pattern (regexp="^\\d{10}$",message="Mobile Number Invalid")
	private String User_Mobile;
	
	
	//@Pattern(regexp="(^[A-Z0-9.%+-]+@[A-Z0-9.-]+\\.[a-z]{2,6}",message="Invalid Email")
	private String User_Mail;
	
	
	@Pattern (regexp="(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#_-]).{8,16}",message= "Password is Weak")
	private String Password;
	
	
	@Embedded
	
	private Address address_Obj;

	
	
	@OneToMany (fetch=FetchType.EAGER, cascade=CascadeType.ALL,mappedBy="userdata_Obj")
	private List <Order> order_Obj;
	

	private boolean enable;
	private String authority;
	
	
	
	
	
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public List<Order> getOrder_Obj() {
		return order_Obj;
	}
	public void setOrder_Obj(List<Order> order_Obj) {
		this.order_Obj = order_Obj;
	}
	public List<CartItem> getCartitem_Obj() {
		return cartitem_Obj;
	}
	public void setCartitem_Obj(List<CartItem> cartitem_Obj) {
		this.cartitem_Obj = cartitem_Obj;
	}
	@OneToMany (fetch=FetchType.EAGER, cascade=CascadeType.ALL,mappedBy="userdata_Obj")
	private List <CartItem> cartitem_Obj;
	
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	
	
	
	public Address getAddress_Obj() {
		return address_Obj;
	}
	public void setAddress_Obj(Address address_Obj) {
		this.address_Obj = address_Obj;
	}
	
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getUser_Mobile() {
		return User_Mobile;
	}
	public void setUser_Mobile(String user_Mobile) {
		User_Mobile = user_Mobile;
	}
	public String getUser_Mail() {
		return User_Mail;
	}
	public void setUser_Mail(String user_Mail) {
		User_Mail = user_Mail;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	

}
