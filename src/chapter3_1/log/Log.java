package chapter3_1.log;

import chapter3_1.output.Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Log {
    Output output;

    public Log(){

    }
    public abstract void Display();
    public void outlog(){
        output.outputlog(getLogs());
    }
    public String getLogs(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println("input log:");
            String str = strin.readLine();

            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
