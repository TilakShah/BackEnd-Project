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

@Table(name= "SubCategories")


public class SubCategory {
	
	

	public Category getCategory_Obj() {
		return category_Obj;
	}
	public void setCategory_Obj(Category category_Obj) {
		this.category_Obj = category_Obj;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	
	private int subcategory_Id;
	

	@Column
	private String subcategory_Name;
	
	@ManyToOne (fetch=FetchType.EAGER)
	private Category category_Obj;
	
	
	
	
	public int getSubcategory_Id() {
		return subcategory_Id;
	}
	public void setSubcategory_Id(int subcategory_Id) {
		this.subcategory_Id = subcategory_Id;
	}
	public String getSubcategory_Name() {
		return subcategory_Name;
	}
	public void setSubcategory_Name(String subcategory_Name) {
		this.subcategory_Name = subcategory_Name;
	}
	
	
}
