package by.social.main.validator.service;

import java.util.List;

import by.social.main.validator.Director;
import by.social.main.validator.bean.UserInfo;


public class Registration {

    private UserInfo newUser;

    List<String> errors;



    public List<String> getErrors() {
        return errors;
    }


    public Registration(UserInfo newUser) {
        this.newUser = newUser;
    }



    public void registerNewUser() {
        
        //////////

    }

    
}
