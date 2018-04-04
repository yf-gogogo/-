package chapter2_1.Widget;

public class LinuxButtonWidget extends Widget{

    public void prepare() {
        super.setname("LinuxButton");
        System.out.println(name+" is preparing;");
        System.out.println("creating=======>");
    }

}
