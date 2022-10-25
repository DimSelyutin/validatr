package by.social.main.validator.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.social.main.validator.service.Expression;
import by.social.main.validator.service.Val;

public class Validator {

    public Validator() {

    }

    public void validate(RegInfo dataUser) throws ValidationException {
        ParamProvider param = new ParamProvider();
        HashMap<String, String> s = param.providerMap(dataUser);
        
        List<String> uncorrectFieldsName = new ArrayList<>();
        Val val = new Val();
        
        for (Map.Entry<String,String> entry : s.entrySet()) {
            if (val.compliteValid(entry.getKey(), entry.getValue()) != null) {
                uncorrectFieldsName.add(entry.getKey());
            }
        }

        if (uncorrectFieldsName != null) {
            throw new ValidationException(uncorrectFieldsName);
        }

    }

}
