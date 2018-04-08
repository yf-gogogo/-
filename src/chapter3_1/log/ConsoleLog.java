package chapter3_1.log;

import chapter3_1.output.ConsoleOutput;

public class ConsoleLog extends Log {
    public ConsoleLog(){
        output = new ConsoleOutput();
    }

    @Override
    void Display() {
        System.out.println("");
    }
}
