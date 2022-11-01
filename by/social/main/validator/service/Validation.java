package by.social.main.validator.service;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.social.main.validator.bean.UserInfo;
import by.social.main.validator.service.validation.RegularNameProvider;
import by.social.main.validator.service.validation.ValidationBuilder;




public class Validation implements ValidationBuilder {
    
    private UserInfo newUser;
    private RegularNameProvider regex;
    private List<String> uncorrectFieldName;
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-uuuu", Locale.US)
                                              .withResolverStyle(ResolverStyle.STRICT);

    
    public Validation() {
        this.regex = new RegularNameProvider();
    }

    public Validation(UserInfo newUser) {
        this.newUser = newUser;
        this.regex = new RegularNameProvider();
        this.uncorrectFieldName = new ArrayList<>();
    }

    @Override
    public void validEmail() {
        if (!validate(newUser.getEmail(), regex.getExpression("EMAIL_EXPRESSION"))) {
            uncorrectFieldName.add("Uncorrect Email");
        }

    }

    @Override
    public void validPhone() {
        if (!validate(newUser.getPhoneNumber(), regex.getExpression("PHONE_EXPRESSION"))) {
            uncorrectFieldName.add("Uncorrect Phone");
        }

        
    }
    
    @Override
    public void validPassword() {
        if (!validate(newUser.getPassword(), regex.getExpression("PASSWORD_EXPRESSION"))) {
            uncorrectFieldName.add("Uncorrect Password");
            
        }


    }
    @Override
    public void validDate() {
        if(!validate(newUser.getDateBirthday())){
            uncorrectFieldName.add("Uncorrect date");
        }       
    }
    
    public List<String> getResault() {
        return uncorrectFieldName;
        
    }
    
    public boolean validate(String str, String s){
        if(s != null) {
            Pattern val_pattern = Pattern.compile(s);   //enum
            Matcher match = val_pattern.matcher(str);
            return match.find();
        }
        return false;
    }

    public boolean validate(String str){
        try {
            this.dateFormatter.parse(str);
        } catch (DateTimeParseException e) {
            return false;
        }   
        return true;
    }


}
