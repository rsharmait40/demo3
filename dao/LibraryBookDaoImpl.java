package com.capgemini.librarymanagement.dao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import com.capgemini.librarymanagement.bean.UserInfoBean;
import com.capgemini.librarymanagement.db.DbUser;

public class LibraryBookDaoImpl implements LibraryBookDao{

	/*@Override
	public boolean signUp(UserInfoBean userInfoBean) {
		boolean isSignUP = false;
		LinkedList ll =null;
		if (userInfoBean != null) {
			ll = new LinkedList();
			ll.add(userInfoBean.getUsrName());
			ll.add(userInfoBean.getUsrEmail());
			ll.add(userInfoBean.getUsrPassword());
			

			if (DbUser.userDb(ll)) {
				System.out.println(" User Id s "+DbUser.temp); 
			}

			isSignUP = true;
		}

		return isSignUP;
	}

	@Override
	public boolean userAuthenticate(int id, String password) {
		boolean isLogin = false;
	
		if(DbUser.mp.containsKey(id)) {
			Set<Integer> keys = DbUser.mp.keySet();
			Iterator<Integer> it = keys.iterator();
			while (it.hasNext()) {
				Integer integer = it.next();
				if (id==integer) {
					LinkedList res =DbUser.mp.get(id);
					for (int i = 0; i < res.size(); i++) {
						if(i==2) {
							if(res.get(i).equals(password)) {
								isLogin = true;
							}
						}
					}
					System.out.println(res);
				}
			}

		}
		return isLogin;
	}*/

	//@Override
	public boolean login(String name, String pwd) {
		
		try {
			String adminName="abhilasha2426";
			String adminPassword="abhilasha2426";
			if((adminName.equals(name)) && (adminPassword.equals(pwd))) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			System.out.println("Username or Password is incorrect");
			
		}
		
		return false;
	}

	

}
