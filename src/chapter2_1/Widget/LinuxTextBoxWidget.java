package chapter2_1.Widget;

public class LinuxTextBoxWidget extends Widget {
    public void prepare(){
        super.setname("LinuxTextbox");
        System.out.println(name+" is preparing;");
        System.out.println("creating=======>");
    }
}
