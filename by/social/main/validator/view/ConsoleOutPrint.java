package by.view;

import java.util.List;

public class ConsoleOutPut {
    public void OutPrint(List<String> list){
        for (String string : list) {
            System.out.println(string);
        }
    }

    public void OutPrint(String str){
        System.out.println(str);
    }
}
