package by.social.main.validator.service;


import java.util.List;


import by.social.main.validator.bean.UserInfo;


public class SignIn{

    private UserInfo newUser;
    private List<String> errors;

    public SignIn(UserInfo newUser){
        this.newUser = newUser;
    }

    public SignIn() {
    

    }


    public List<String> signInUser(){

        //код поиска в базе данных на соответствие и возвращение ошибки
        return errors;
    }
   
    
}
