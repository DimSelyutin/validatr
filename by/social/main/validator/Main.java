package by.social.main.validator;

import java.util.Scanner;

import by.social.main.validator.bean.UserInfo;
import by.social.main.validator.service.Registration;
import by.social.main.validator.service.Validation;
import by.social.main.validator.service.validation.Director;
import by.social.main.validator.view.ConsoleOutPrint;


public class Main {
    public static void main(String[] args) {
        
        ConsoleOutPrint console = new ConsoleOutPrint();
        
        UserInfo userInfo = inputDataOfUser();
        Validation valid = new Validation(userInfo);
        


        Director director = new Director();
        director.build(valid);



        String successCode = "200";
        String unSuccessCode = "400";
        
        if (!valid.getResault().isEmpty()) {
            console.outPrint(unSuccessCode);
            console.outPrint(valid.getResault());
        } else {
            Registration reg = new Registration(userInfo);
            console.outPrint(successCode);
        }
        

        
        
        
        



    }

    public static UserInfo inputDataOfUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter email: ");
        String email = sc.nextLine();

        System.out.println("Enter password: ");
        String password = sc.nextLine();

        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine();

        System.out.println("Enter your birthday: ");
        String dataBirthday = sc.nextLine();

        System.out.println("For send data press Enter");
        sc.nextLine();

        return new UserInfo(email, password, phoneNumber, dataBirthday);
    }
}
