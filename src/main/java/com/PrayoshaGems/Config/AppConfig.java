package com.PrayoshaGems.Config;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import PrayoshaGems.DAOImpl.UserDataDAOImp;

@Configuration
@ComponentScan(basePackages="com.PrayoshaGems")
@EnableTransactionManagement
public class AppConfig
{
	@Bean(name = "dataSource")
	public DataSource getDataSource() 
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");

		dataSource.setUsername("sa");
		dataSource.setPassword("faculty");
		return dataSource;
	}
	
	  private Properties getHibernateProperties() {
	    	Properties properties = new Properties();
	    	properties.put("hibernate.show_sql", "true");
	    	properties.put("hibernate.hbm2ddl.auto", "update");
	    	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	    	return properties;
	    }
	    
	   @Bean (name = "sessionFactory")
	   @Autowired
	   public LocalSessionFactoryBean getSessionFactory() 
	   {
	      LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	      sessionFactory.setDataSource(getDataSource());
	      sessionFactory.setPackagesToScan("com.PrayoshaGems.Model");
	      sessionFactory.setHibernateProperties(getHibernateProperties());	 
	      return sessionFactory;
	   }
	   
	   
	   @Bean(name="transactionManager")
	    @Autowired
	   public HibernateTransactionManager getTransactionManger(
			   SessionFactory sessionFactory)
	   {
		   
		   HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		   
		   return transactionManager;
	   }
	   
	   
	   
	    @Bean(name="userDAO")
	    @Autowired
	    public UserDataDAOImp getUserDATADAO()
	    {
	    	return new UserDataDAOImp();
	    }
}