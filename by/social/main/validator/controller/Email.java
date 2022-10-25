package by.social.main.validator.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    private String email;
    public Email(String email){
        this.email = email;
    }

    private final String EMAIL_EXRESSION = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";

    public boolean email_validation(){
        Pattern email_pattern = Pattern.compile(EMAIL_EXRESSION);

        Matcher match = email_pattern.matcher(email);
        return match.find();
    }
    
}
