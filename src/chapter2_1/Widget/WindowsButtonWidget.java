package chapter2_1.Widget;

public class WindowsButtonWidget extends Widget {
    public void prepare(){
        super.setname("WindowsButton");
        System.out.println(name+" is preparing;");
        System.out.println("creating=======>");
    }
}
