
package PrayoshaGems.DAOImpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import com.PrayoshaGems.DAO.UserDataDAO;
import com.PrayoshaGems.Model.UserData;
import com.PrayoshaGems.dbconfig.DBConfig;


@Transactional
public class UserDataDAOImp implements UserDataDAO{

	 @Autowired
	SessionFactory sessionFactory;
	
	
	
	public boolean addUser(UserData user_Obj) {
		// TODO Auto-generated method stub
		
		
		user_Obj.setEnable(true);
		user_Obj.setAuthority("user");
		user_Obj.setPassword(new BCryptPasswordEncoder().encode(user_Obj.getPassword()));
	
		sessionFactory.getCurrentSession().save(user_Obj);
		
	return true;
	

		
		
	}

	public void deleteUser(UserData user_Obj) {
		// TODO Auto-generated method stub
		
		
		sessionFactory.getCurrentSession().delete(user_Obj);
		
	}

	public void updateUser(UserData user_Obj) {
	
		
		sessionFactory.getCurrentSession().update(user_Obj);
		
	}

	public List<UserData> displayUser() {
		
		
		try {
			
			//HQL
			
			
			return sessionFactory.getCurrentSession().createQuery("from com.PragyoshGems.Model.UserData").list();
			
			
			
			
		} catch (Exception e) {
		

			return null;	
		}
		
	}

	public UserData displayUserbyId(UserData user_Obj) {
		
		
		try {
		Query query=sessionFactory.getCurrentSession().createQuery("from com.PrayoshaGems.Modeil.UserData where user_Id= :userid");
		
		 query.setParameter("userid", user_Obj.getUser_Id());
		
		 return(UserData)query.getResultList().get(0);
		 
		 
//			UserData U =(UserData) query.getResultList().get(0);
		 
				 //return U;
				
		
		}
		catch (Exception e)
		{
			return null;	
		}
		
		
	}

	public UserData displayUserbyName(UserData user_Obj) {
		
		try {
			System.out.println("SDFSDFSDFDFDF");
			Query query=sessionFactory.getCurrentSession().createQuery("from com.PrayoshaGems.Model.UserData where user_Name = :user_Name");
			System.out.println(user_Obj.getUser_Name());
		 UserData user=(UserData)query.setParameter("user_Name",user_Obj.getUser_Name()).getResultList().get(0);
		 System.out.println(user.getUser_Name());
		 System.out.println(user.getUser_Mobile());
		 return user;
		} catch (Exception e) {
			return null;
		}
		}
		
		
		
	} 	


