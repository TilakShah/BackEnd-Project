package com.PrayoshaGems.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;

import com.PrayoshaGems.DAO.UserDataDAO;
import com.PrayoshaGems.Model.UserData;

@Service("userDetailsService")
public class UserDetailsServerIMp implements UserDetailsService
{
	@Autowired
	UserDataDAO userDAO;

    @Transactional(readOnly = true)
	  public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    	UserData user=new UserData();
    	System.out.println(username);
    	user.setUser_Name(username);
	    UserData user1 =  userDAO.displayUserbyName(user);
	    UserBuilder builder = null;
	    if (user1 != null) {
	      
	      builder = org.springframework.security.core.userdetails.User.withUsername(username);
	      builder.disabled(!user1.isEnable());
	      builder.password(user1.getPassword());
	      String[] authorities = new String[]{user1.getAuthority()} ;

	      builder.authorities(authorities);
	    } else {
	      throw new UsernameNotFoundException("User not found.");
	    }
	    return builder.build();
	  }
}
