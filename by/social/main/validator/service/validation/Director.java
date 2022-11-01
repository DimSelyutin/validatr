package by.social.main.validator.service.validation;

import by.social.main.validator.service.Validation;

public class Director {
    public Director(){}

    public void build(Validation valid){
        valid.validEmail();
        valid.validPhone();
        valid.validPassword();
        valid.validDate();
    }

    public void build (String login, String password){
        
    }

}
