package by.social.main.validator.service.validation;

public enum ExpressionName {
    EMAIL_EXPRESSION("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$"),
    PASSWORD_EXPRESSION("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W]).{6,20}"), 
    PHONE_EXPRESSION("\\d{12}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");

    private String regexStr;

    
    private ExpressionName(String regexStr){
        this.regexStr = regexStr;
    }

    public String getRegexStr(){
        return regexStr;
    }
}
