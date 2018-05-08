package chapter6;

public class ComandPatternDemo {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        Command opengpscommand = new OpenGPSCommand(receiver);
        Command opencameracommand = new OpenCameraCommand(receiver);

        invoker.setCommand(opengpscommand);
        invoker.action();

        invoker.setCommand(opencameracommand);
        invoker.action();
    }
}
