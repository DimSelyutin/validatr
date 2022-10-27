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
import by.social.main.validator.builder.ValidationBuilder;
import by.social.main.validator.controler.RegularName;




public class Validation implements ValidationBuilder {
    
    private UserInfo newUser;
    private RegularName regex;
    private List<String> uncorrectFieldName;
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-uuuu", Locale.US)
    .withResolverStyle(ResolverStyle.STRICT);

    
    public Validation() {
        this.regex = new RegularName();
    }

    public Validation(UserInfo newUser) {
        this.newUser = newUser;
        this.regex = new RegularName();
        this.uncorrectFieldName = new ArrayList<>();
    }

    @Override
    public void validEmail() {
        if (!valid(newUser.getEmail(), regex.getEMAIL_EXPRESSION())) {
            uncorrectFieldName.add("Uncorrect Email");
        }

    }

    @Override
    public void validPhone() {
        if (!valid(newUser.getPhoneNumber(), regex.getPHONE_EXPRESSION())) {
            uncorrectFieldName.add("Uncorrect Phone");
        }

        
    }
    
    @Override
    public void validPassword() {
        if (!valid(newUser.getPassword(), regex.getPASSWORD_EXPRESSION())) {
            uncorrectFieldName.add("Uncorrect Password");
            
        }


    }
    @Override
    public void validDate() {
        try {
            
            this.dateFormatter.parse(newUser.getDateBirthday());
        } catch (DateTimeParseException e) {
            uncorrectFieldName.add("Uncorrect date");
        }        
    }
    
    public List<String> getResault() {
        return uncorrectFieldName;
        
    }
    
    public boolean valid(String str, String s){
        if(s != null) {
            Pattern val_pattern = Pattern.compile(s);   //enum
            Matcher match = val_pattern.matcher(str);
            return match.find();
        }
        return false;
    }


}
