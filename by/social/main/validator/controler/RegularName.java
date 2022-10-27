package by.controler;


public class RegularName {

    
    private final String EMAIL_EXPRESSION = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
    private final String PASSWORD_EXPRESSION = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W]).{6,20}";
    private final String  PHONE_EXPRESSION = "\\d{12}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";


    public String getEMAIL_EXPRESSION() {
        return EMAIL_EXPRESSION;
    }
    public String getPASSWORD_EXPRESSION() {
        return PASSWORD_EXPRESSION;
    }
    public String getPHONE_EXPRESSION() {
        return PHONE_EXPRESSION;
    }


}
