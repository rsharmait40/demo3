  package com.capgemini.librarymanagement.dao;

import com.capgemini.librarymanagement.bean.UserInfoBean;

public interface LibraryBookDao {
//	boolean signUp(UserInfoBean userInfoBean); 
//	boolean userAuthenticate(int id ,String password);
	boolean login(String name, String pwd);
	
	
	

}
