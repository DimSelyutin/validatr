package by.social.main.validator.controller;

import java.util.ArrayList;
import java.util.List;



public class Validator {
   

    public Validator() {
       
    }

    public void validate(RegInfo dataUser) throws ValidationException{
        List<String> uncorrectFieldsName = new ArrayList<>();

        Email email = new Email(dataUser.getEmail());
        Password pass = new Password(dataUser.getPassword());
        PhoneNumber phone = new PhoneNumber(dataUser.getPhone_number());

        if (!email.email_validation()) {
            uncorrectFieldsName.add("email");       //неверное поле
        } 
        if(!pass.password_validation()){
            uncorrectFieldsName.add("pass");        //неверное поле

        } 
        if(!phone.phone_validation()){
            uncorrectFieldsName.add("phone");       //неверное поле
        }

        if(uncorrectFieldsName != null){
            throw new ValidationException(uncorrectFieldsName);
        }

        
       
    }
   

    

   


   



}
