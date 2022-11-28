package com.lequangnhat;


public class AuthorUser {

    public boolean login(User user)  {
            User found = MasterData.getInstance().findUser(user);

            return found != null;
    }
}
