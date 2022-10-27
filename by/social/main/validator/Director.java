package by.social.main.validator;

import by.social.main.validator.service.Validation;

public class Director {
    public Director(){}

    public void build(Validation valid){
        valid.validEmail();
        valid.validPhone();
        valid.validPassword();
    }

    public void build(String login, String email){
        
    }
}
