package by.social.main.validator.view;

import java.util.List;

public class ConsoleOutPrint {
    public void outPrint(List<String> list){
        for (String string : list) {
            System.out.println(string);
        }
    }

    public void outPrint(String st){
        System.out.println(st);
    }
}
