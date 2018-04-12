package chapter3_1.log;

import chapter3_1.output.ConsoleOutput;

public class ConsoleLog extends Log {
    public ConsoleLog(){
        output = new ConsoleOutput();
    }

    @Override
    public void Display() {
        System.out.println("将写入控制台");
    }
}
