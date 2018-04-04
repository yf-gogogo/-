package chapter2_1.Widget;

public class WindowsTextBoxWidget extends Widget {
    public void prepare(){
        super.setname("WindowsTextbox");
        System.out.println(name+" is preparing;");
        System.out.println("creating=======>");
    }
}
