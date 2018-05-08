package chapter6;

public class OpenGPSCommand implements Command{
    private Receiver receiver;
    public OpenGPSCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        if(receiver != null){
            receiver.openGPS();
        }
    }
}
