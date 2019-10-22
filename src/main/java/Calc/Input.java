package Calc;

import java.io.*;
import java.util.Scanner;

public class Input {

    public String reader(String line) throws IOException {

        String result="";
        Scanner sc = new Scanner(new File(line));
        while(sc.hasNext()){
            result=result + "," + sc.nextLine();
        }
        //  System.out.println(result);
        return result;
    }
}
