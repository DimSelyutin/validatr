package by.social.main.validator.controller;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Password {
    private String password;
    
    
        public Password(String password) {
            this.password = password;
        }

    private final  String PASSWORD_EXPRESSION = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W]).{6,20}";



    public boolean password_validation(){
        Pattern password_pattern = Pattern.compile(PASSWORD_EXPRESSION);
        Matcher match = password_pattern.matcher(password);
        return match.find();
    }
}
