package chapter2_2;

import chapter2_2.factory.AbstractFactory;
import chapter2_2.factory.LinuxFactory;
import chapter2_2.factory.WindowsFactory;

public class WidgeStore {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new WindowsFactory();

        new OrderWidget(abstractFactory);

    }
}
