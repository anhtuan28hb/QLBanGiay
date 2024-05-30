package vn.viettuts.detaiso10.dao;

import vn.viettuts.detaiso10.entity.User;

public class Userdao {
    public boolean checkUser(User user) {
        if (user != null) {
            if ("".equals(user.getUserName()) 
                    && "".equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
