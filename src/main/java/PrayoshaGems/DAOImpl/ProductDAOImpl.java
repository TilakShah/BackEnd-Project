package PrayoshaGems.DAOImpl;





import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.PrayoshaGems.DAO.ProductDAO;
import com.PrayoshaGems.Model.Product;
import com.PrayoshaGems.Model.UserData;
import com.PrayoshaGems.dbconfig.DBConfig;


@Transactional
public class ProductDAOImpl implements ProductDAO {


	SessionFactory sessionFactory;
	 @Autowired
	
	
	
	public void addProduct(Product product_Obj) {
		
			sessionFactory.getCurrentSession().save(product_Obj);
		}
		
		
		
	

	public void deleteProduct(Product product_Obj) {
		
		sessionFactory.getCurrentSession().delete(product_Obj);

		
	}

	public void updateProduct(Product product_Obj) {
		sessionFactory.getCurrentSession().update(product_Obj);

	}



	public Product displayProductByName(Product product_Obj) {
try {
			
			Criteria Ctx=sessionFactory.getCurrentSession().createCriteria(Product.class);
		return (Product)Ctx.add(Restrictions.eq("product_Name",product_Obj.getProduct_Name())).list().get(0);
		
			
			
		} catch (Exception e) {
			return null;
		}
		
	}

	public  List<Product> displayProducts()
	{
		try {
			return sessionFactory.getCurrentSession().createQuery("from com.PragyoshGems.Model.Product").list();
			
			
		} catch (Exception e) {
			return null;
			
		}
	}

	


}
