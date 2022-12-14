package by.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.bean.NewUser;
import by.builder.ValidationBuilder;
import by.controler.RegularName;
import by.service.serviceExeption.ValidationException;

public class Validation implements ValidationBuilder {

    private NewUser newUser;
    private RegularName regex = new RegularName();
    private List<String> uncorrectFieldName;

    public Validation() {
    }

    public Validation(NewUser newUser) {
        this.newUser = newUser;
        this.uncorrectFieldName = new ArrayList<>();
    }

    @Override
    public void validEmail(){
        if (!valid(newUser.getEmail(), regex.getEMAIL_EXPRESSION())) {
            uncorrectFieldName.add("Uncorrect Email");
        }

    }

    @Override
    public void validPhone(){
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

    public void getResault() throws ValidationException {
        if (!uncorrectFieldName.isEmpty()) {
            throw new ValidationException("Error input data!", uncorrectFieldName);
        }
        


    }







    private boolean valid(String str, String s) {
        if (s != null) {
            Pattern val_pattern = Pattern.compile(s); // enum
            Matcher match = val_pattern.matcher(str);
            return match.find();
        }
        return false;
    }

}
