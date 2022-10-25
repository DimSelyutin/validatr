package by.social.main.validator.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.social.main.validator.controller.RegInfo;

public class Val {

    
    
    public Val(){
       
    }

    private boolean valid(String str, String s){
        
        Pattern val_pattern = Pattern.compile(s);//enum

        Matcher match = val_pattern.matcher(str);
        return match.find();
    }

    
    public String compliteValid(String a, String b){
        
        if (!valid(a,b)) {
            return a;
        }
        return null;
    }
}
