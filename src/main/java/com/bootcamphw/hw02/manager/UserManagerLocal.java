package com.bootcamphw.hw02.manager;
import java.util.ArrayList;
import java.util.List;

import com.bootcamphw.hw02.entity.User;




public class UserManagerLocal {
    
    private List<User> users;

    public UserManagerLocal() {
        users = new ArrayList<User>();
    }

    public boolean insert(User user) {
        return users.add(user);
    }
    
    public User findByUsername(String name) {
        for (User user : users) {
            if (user.getUsername().equals(name)) {
                return user;
            }
        }
        return null;
    }
    
}
