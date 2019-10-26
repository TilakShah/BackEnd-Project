package com.PrayoshaGems.DAO;


import java.util.List;

import com.PrayoshaGems.Model.CartItem;

public interface CartItemDAO {
	public void addcart (CartItem cart_Obj);
	public void deletCart (CartItem cart_Obj);
	public void updateCart (CartItem cart_Obj);
	public List<CartItem> displayCart();
	
	
	
	
	

}
