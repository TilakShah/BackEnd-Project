package com.PrayoshaGems.DAO;

import java.util.List;

import com.PrayoshaGems.Model.Order;

public interface OrderDAO {
	
	public void addOrder (Order order_Obj);
	public void updateOrder (Order order_Obj);
	public List<Order> dilsplyOrder ();
	public void cancelOrder (Order order_obj);
	
	
	
	
	

}
