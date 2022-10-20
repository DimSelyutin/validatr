package by.social.main.validator.main;

import java.util.Scanner;

import by.social.main.validator.service.Validator;
import by.social.main.validator.validation.bean.User;

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

        User user_validation = new User(email, password, phone_number);

        Validator validaton = client_validaton(user_validation);
        
        if (validaton.getInvalid_message() == null) {

            System.out.println("The data entered is correct!");
            
        } else {
            System.out.println("Check entered data!");
            System.out.println(validaton.getInvalid_message());

        }

    }

    public static Validator client_validaton(User user) {


        Validator validator = new Validator(user.getEmail(), user.getPassword(), user.getPhone_number());

        if (!validator.email_validation()) {

            validator.setInvalid_message("Incorrect email");
        } else if (!validator.password_validation()) {

            validator.setInvalid_message("Incorrect password");
        } else if (!validator.phone_validation()) {

            validator.setInvalid_message("Incorrect phone number");
        }
        return validator;
    }
}
