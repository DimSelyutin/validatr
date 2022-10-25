package by.social.main.validator.controller;

import java.util.ArrayList;
import java.util.List;

public class ValidationException extends Throwable{
    

	private List<String> uncorrectFieldsName = new ArrayList<>();

    public ValidationException(List<String> uncorrectFieldsName) {
        this.uncorrectFieldsName = uncorrectFieldsName;
    }

    public List<String> getUncorrectFieldsName() {
        return uncorrectFieldsName;
    }

    public void setUncorrectFieldsName(List<String> uncorrectFieldsName) {
        this.uncorrectFieldsName = uncorrectFieldsName;
    }

	

	// add, get, set
}
