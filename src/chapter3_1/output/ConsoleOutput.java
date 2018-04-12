package chapter3_1.output;

public class ConsoleOutput implements Output {
    @Override
    public void outputlog(String logs) {
        System.out.println(logs);
        System.out.println("================");
    }
}
