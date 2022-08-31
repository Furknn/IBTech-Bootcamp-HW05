package com.bootcamphw.hw02;

import com.bootcamphw.hw02.entity.User;
import com.bootcamphw.hw02.manager.UserManagerLocal;

public class TestUser {
	public static void main(String[] args) throws Exception {
		var um=new UserManagerLocal();
    	var user=um.findByUsername("godoro");
    	if(user==null){
    		user=new User();
    		user.setUsername("godoro");
        	user.setPassword("java");
        	um.insert(user);
    	} 	

		// print properties of user
		System.out.println("username: "+user.getUsername());
		System.out.println("password: "+user.getPassword());
	
	}
}
