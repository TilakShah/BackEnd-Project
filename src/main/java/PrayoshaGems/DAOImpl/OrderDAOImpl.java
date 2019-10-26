package PrayoshaGems.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.PrayoshaGems.DAO.OrderDAO;
import com.PrayoshaGems.Model.Order;
import com.PrayoshaGems.dbconfig.DBConfig;


@Transactional
public class OrderDAOImpl implements OrderDAO{
	
	SessionFactory sessionFactory;
	 @Autowired
	
	public void addOrder(Order order_Obj) {
		

			sessionFactory.getCurrentSession().save(order_Obj);
			

		
		
	}

	public void updateOrder(Order order_Obj) {
		sessionFactory.getCurrentSession().update(order_Obj);
		
		
	}

	public List<Order> dilsplyOrder () {

		try {
			return sessionFactory.getCurrentSession().createQuery("from com.PragyoshGems.Model.Order").list();
		} catch (Exception e) {
			return null;
		}
		
	}

	public void cancelOrder(Order order_obj) {
		// TODO Auto-generated method stub
		
	}

}
