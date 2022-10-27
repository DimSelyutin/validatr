package by.social.main.validator;

import java.util.List;
import java.util.Scanner;

import by.social.main.validator.bean.UserInfo;
import by.social.main.validator.service.Registration;
import by.social.main.validator.service.SignIn;
import by.social.main.validator.view.ConsoleOutPrint;


public class Main {
    public static void main(String[] args) {
        
        ConsoleOutPrint console = new ConsoleOutPrint();    
        Registration reg = new Registration(inputDataOfUser());
        
        Director director = new Director();
        reg.registerNewUser(director);

        ///////////////////////////////

        SignIn sign = new SignIn(inputDataOfUser());
        
        
        



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
