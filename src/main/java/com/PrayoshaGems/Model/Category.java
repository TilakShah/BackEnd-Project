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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name= "Category")

public class Category {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	
	
	private int categoryid;
	

	@Column
	
	private String categoryname;

	@OneToMany (fetch=FetchType.LAZY, cascade=CascadeType.ALL,mappedBy="category_Obj")
	private Set <SubCategory> subcategory_Obj;
	
	
	@OneToMany (fetch=FetchType.LAZY, cascade=CascadeType.ALL,mappedBy="category_Obj")
	private Set <Product> product_Obj;
	
	
	
	public Set<SubCategory> getSubcategory_Obj() {
		return subcategory_Obj;
	}
	public void setSubcategory_Obj(Set<SubCategory> subcategory_Obj) {
		this.subcategory_Obj = subcategory_Obj;
	}
	public Set<Product> getProduct_Obj() {
		return product_Obj;
	}
	public void setProduct_Obj(Set<Product> product_Obj) {
		this.product_Obj = product_Obj;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	
	

}
