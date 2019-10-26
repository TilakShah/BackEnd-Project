package com.PrayoshaGems.DAO;



import java.util.List;

import com.PrayoshaGems.Model.UserData;

public interface UserDataDAO {
	
	public boolean addUser (UserData user_Obj);
	public void deleteUser (UserData user_Obj);
	public void updateUser (UserData user_Obj);
	public List<UserData> displayUser() ;
	public UserData displayUserbyId (UserData user_Obj);
	public UserData displayUserbyName (UserData user_Obj);
	
	

}
