package chapter2_2;

import chapter2_2.factory.AbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractSequentialList;

public class OrderWidget {
    AbstractFactory mFactory;
    public OrderWidget(AbstractFactory mFactory){
        setFactory(mFactory);
    }
    public void setFactory(AbstractFactory mFactory) {

        String ordertype;

        this.mFactory = mFactory;

        do {
            ordertype = gettype();
            if(ordertype.equals("button")){
                mFactory.CreateButton().DisplayButton();
            }else if(ordertype.equals("textbox")){
                mFactory.CreateTextBox().DisplayTextBox();
            }else {
                System.out.println("sorry! 目前只支持button和textbox");
            }

        } while (true);

    }
    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println("input widget type:");
            String str = strin.readLine();

            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
