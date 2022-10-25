package by.social.main.validator;

import java.util.Scanner;


import by.social.main.validator.controller.RegInfo;
import by.social.main.validator.controller.ValidationException;
import by.social.main.validator.controller.Validator;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter email: ");
        String email = sc.nextLine();

        System.out.println("Enter password: ");
        String password = sc.nextLine();

        System.out.println("Enter phone number: ");
        String phone_number = sc.nextLine();

        System.out.println("Для отправки данных нажмите Enter");
        sc.nextLine();
        RegInfo regInfo = new RegInfo(email, password, phone_number);

        
        Validator v = new Validator();

        try {
            v.validate(regInfo);
        } catch (ValidationException e) {
            for (String string : e.getUncorrectFieldsName()) {
                System.out.println(string);                         //неверное поле подсветить красным
            }
        }
    

    }

    
}
