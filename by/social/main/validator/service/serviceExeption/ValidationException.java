package by.social.main.validator.service.serviceExeption;



import java.util.ArrayList;
import java.util.List;

public class ValidationException extends ServiceException{
    
    private String message;
    
    private List<String> uncorrectFieldsName = new ArrayList<>();
    
    public ValidationException(String message, List<String> uncorrectFieldsName) {
        this.message = message;
        this.uncorrectFieldsName = uncorrectFieldsName;
    }
    
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public List<String> getUncorrectFieldsName() {
        return uncorrectFieldsName;
    }

    public void setUncorrectFieldsName(List<String> uncorrectFieldsName) {
        this.uncorrectFieldsName = uncorrectFieldsName;
    }

	public ValidationException addUncorrectFieldsName(String str){
        uncorrectFieldsName.add(str);
        return this;
    }

}
