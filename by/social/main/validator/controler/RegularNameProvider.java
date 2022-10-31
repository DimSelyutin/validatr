package by.social.main.validator.controler;

import java.util.HashMap;

public class RegularNameProvider {
    HashMap<Enum, String> regularName = new HashMap<>();
    
    public RegularNameProvider(){
        regularName.put(ExpressionName.EMAIL_EXPRESSION, "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
        regularName.put(ExpressionName.PASSWORD_EXPRESSION, "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W]).{6,20}");
        regularName.put(ExpressionName.PHONE_EXPRESSION, "\\d{12}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");

    }

    public String getExpression(String expressionName){
        ExpressionName expr = ExpressionName.valueOf(expressionName);
        String str = regularName.get(expr);
        return str;
    }

}
