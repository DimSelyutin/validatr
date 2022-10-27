package by.social.main.validator.service;

import java.util.List;

import by.social.main.validator.Director;
import by.social.main.validator.bean.UserInfo;
import by.social.main.validator.service.serviceExeption.ValidationException;

public class Registration {
    private UserInfo newUser;
    List<String> errors;

    public Registration(UserInfo newUser) {
        this.newUser = newUser;
    }

    public void registerNewUser(Director director) {
        
        Validation valid = new Validation(newUser);
        director.build(valid);
        errors = valid.getResault(); // резултт
        //////////

        if (!errors.isEmpty()) {
            ValidationException validEx = new ValidationException(null, errors);
        } else {
            // reg user
        }
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
