package by.social.main.validator.controller;

import java.util.HashMap;

import by.social.main.validator.service.Expression;

public class ParamProvider {
    public HashMap<String, String> providerMap(RegInfo dataUser){
        HashMap<String, String> s = new HashMap<>();
        s.put(dataUser.getEmail(), Expression.EMAIL_EXPRESSION.toString());
        s.put(dataUser.getPassword(), Expression.PASSWORD_EXPRESSION.toString());
        s.put(dataUser.getPhone_number(), Expression.PHONE_EXPRESSION.toString());
        return s;
    }
}
