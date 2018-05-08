package chapter6;

public class OpenCameraCommand implements Command{
    private Receiver receiver;
    public OpenCameraCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        if(receiver != null){
            receiver.openCamera();
        }
    }
}
