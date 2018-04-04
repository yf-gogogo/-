package chapter2_1;

import chapter2_1.Widget.Widget;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderWidget {
    AbsFactory mFactory;
    public OrderWidget(AbsFactory mFactory){
        setFactory(mFactory);
    }
    public void setFactory(AbsFactory mFactory) {
        Widget widget = null;
        String ordertype;

        this.mFactory = mFactory;

        do {
            ordertype = gettype();
            widget = mFactory.CreateWidget(ordertype);
            if (widget != null) {
                widget.prepare();
                widget.DisplayWidget();
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
