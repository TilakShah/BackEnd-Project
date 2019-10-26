package com.PrayoshaGems.dbconfig;

import javax.persistence.Access;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.PrayoshaGems.Model.Address;
import com.PrayoshaGems.Model.CartItem;
import com.PrayoshaGems.Model.Category;
import com.PrayoshaGems.Model.Order;
import com.PrayoshaGems.Model.Product;
import com.PrayoshaGems.Model.SubCategory;
import com.PrayoshaGems.Model.UserData;



public class DBConfig 
{
	
	private static SessionFactory factory=null;
	
	public static SessionFactory getFactory() {
		return factory;
	}

	public static void setFactory(SessionFactory factory) {
		DBConfig.factory = factory;
	}

	static
	{
		try
		{
			System.out.println("not successfull");
			loadSessionFactory();
			System.out.println("successfull");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void loadSessionFactory()
	{
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(UserData.class);
		configuration.addAnnotatedClass(CartItem.class);
		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(Order.class);
		configuration.addAnnotatedClass(Address.class);
		configuration.addAnnotatedClass(Category.class);
		configuration.addAnnotatedClass(SubCategory.class);
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		setFactory(configuration.buildSessionFactory(registry));
	}
	
	public static Session getSession() throws Exception
	{
		Session session=getFactory().openSession();
		return session;
	}
}