package by;


import java.util.List;
import java.util.Scanner;

import by.bean.NewUser;
import by.service.Validation;
import by.service.serviceExeption.ValidationException;
import by.view.ConsoleOutPut;

public class Main {
    public static void main(String[] args) {

        
        Director director = new Director();
        Validation valid = null;
        ConsoleOutPut print = new ConsoleOutPut();
        String SUCCESS_CODE = "200";

        try {

            valid = new Validation(inputDataOfUser());   //передача обьекта с данными в валидатор
            director.build(valid);                       //вызов директоры, который вызовет нужного билдера
            valid.getResault();                             //резултт
            print.OutPrint(SUCCESS_CODE);
        }  catch (ValidationException e) {

            print.OutPrint(e.getUncorrectFieldsName());
            e.printStackTrace();

        }                                           

      


       
        

    }


    public static NewUser inputDataOfUser(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter email: ");
            String email = sc.nextLine();

            System.out.println("Enter password: ");
            String password = sc.nextLine();

            System.out.println("Enter phone number: ");
            String phone_number = sc.nextLine();

            System.out.println("For send data press Enter");
            sc.nextLine();

            return new NewUser(email, password, phone_number);
        }
    }
}
