package by;


import java.util.List;
import java.util.Scanner;

import by.bean.NewUser;
import by.service.Validation;

public class Main {
    public static void main(String[] args) {

        
        Director director = new Director();

        /////////
        Validation valid = new Validation(inputDataOfUser());            //передача обьекта с данными в валидатор

        director.build(valid);                                           //вызов директоры, который вызовет нужного билдера

        List<String> errors = valid.getResault();                             //резултт
        //////////

        ConsoleOutPut print =new ConsoleOutPut();
        if(errors != null){
            print.OutPrint(errors);
        }
       
        

    }


    public static NewUser inputDataOfUser(){
        Scanner sc = new Scanner(System.in);

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
