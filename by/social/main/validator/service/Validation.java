package by.social.main.validator.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.social.main.validator.bean.NewUser;
import by.social.main.validator.builder.ValidationBuilder;
import by.social.main.validator.controler.RegularName;




public class Validation implements ValidationBuilder {
    
    private NewUser newUser;
    private RegularName regex;
    private List<String> uncorrectFieldName;

    
    public Validation() {
        this.regex = new RegularName();
    }

    public Validation(NewUser newUser) {
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

    public List<String> getResault() {
        return uncorrectFieldName;
        
    }
    
    private boolean valid(String str, String s){
        if(s != null) {
            Pattern val_pattern = Pattern.compile(s);   //enum
            Matcher match = val_pattern.matcher(str);
            return match.find();
        }
        return false;
    }

}
