package com.PrayoshaGems.Model;

import javax.persistence.Embeddable;

@Embeddable


public class Address {

	private String city;
	private String state;	
	private String pin_Code;

		
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin_Code() {
		return pin_Code;
	}

	public void setPin_Code(String pin_Code) {
		this.pin_Code = pin_Code;
	}
	
	
	
	
}
