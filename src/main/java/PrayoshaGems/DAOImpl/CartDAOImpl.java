package PrayoshaGems.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.PrayoshaGems.DAO.CartItemDAO;

import com.PrayoshaGems.Model.CartItem;
import com.PrayoshaGems.dbconfig.DBConfig;

@Transactional
public class CartDAOImpl implements CartItemDAO{

	SessionFactory sessionFactory;
	 @Autowired
	
	
	
	public void addcart(CartItem cart_Obj) {
	
		 sessionFactory.getCurrentSession().save(cart_Obj);
	 }
	public void deletCart(CartItem cart_Obj) {
		sessionFactory.getCurrentSession().delete(cart_Obj);
		
	}

	public void updateCart(CartItem cart_Obj) {
		sessionFactory.getCurrentSession().update(cart_Obj);
		
		
	}

	public List<CartItem> displayCart()
	 {
try {
	return sessionFactory.getCurrentSession().createQuery("from com.PragyoshGems.Model.CartItem").list();
	
} catch (Exception e) {
	return null;
	
}
		
		
	}
	
	
	

}
