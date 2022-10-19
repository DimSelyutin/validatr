package by.social.main.validator.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private String email;
    private String password;
    private String phone_number;

    
    private final String PHONE_EXPRESSION = "\\d{12}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
    private final String EMAIL_EXRESSION = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
    private final  String PASSWORD_EXPRESSION = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W]).{6,20}";
                                                //(?=.*\d)           # must contains one digit from 0-9
                                                // (?=.*[a-z])       # must contains one lowercase characters
                                                // (?=.*[\W])        # must contains at least one special character
                                                //  .                # match anything with previous condition checking
                                                // {8,20}            # length at least 8 characters and maximum of 20 
    private String invalid_message;


   


    public Validator(){
    }


    public Validator(String email, String password, String phone_number) {
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
    }

    public String getInvalid_message() {
        return invalid_message;
    }


    public void setInvalid_message(String nonvalide_message) {
        this.invalid_message = nonvalide_message;
    }
    
    public boolean email_validation(){
        Pattern email_pattern = Pattern.compile(EMAIL_EXRESSION);

        Matcher match = email_pattern.matcher(email);
        return match.find();
    }

    public boolean phone_validation(){
        Pattern phone_pattern = Pattern.compile(PHONE_EXPRESSION);

        Matcher match = phone_pattern.matcher(phone_number);
        return match.find();
    }

    public boolean password_validation(){
        Pattern password_pattern = Pattern.compile(PASSWORD_EXPRESSION);
        Matcher match = password_pattern.matcher(password);
        return match.find();
    }


    @Override
    public String toString() {
        return "Validator [email=" + email + ", password=" + password + ", phone_number=" + phone_number + "]";
    }



}
