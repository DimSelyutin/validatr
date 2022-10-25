package by.social.main.validator.controller;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PhoneNumber {
    private String phone_number;
    public PhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }
    
    private final String PHONE_EXPRESSION = "\\d{12}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
                                                //(?=.*\d)           # must contains one digit from 0-9
                                                // (?=.*[a-z])       # must contains one lowercase characters
                                                // (?=.*[\W])        # must contains at least one special character
                                                //  .                # match anything with previous condition checking
                                                // {8,20}            # length at least 8 characters and maximum of 20 




                                                





    public boolean phone_validation(){
        Pattern phone_pattern = Pattern.compile(PHONE_EXPRESSION);

        Matcher match = phone_pattern.matcher(phone_number);
        return match.find();
    }


}
