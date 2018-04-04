package chapter2_1;

import chapter2_1.Widget.Widget;
import chapter2_1.Widget.WindowsButtonWidget;
import chapter2_1.Widget.WindowsTextBoxWidget;

public class WindowsFactory implements AbsFactory {
    @Override
    public Widget CreateWidget(String ordertype){
        /*ButtonWidget buttonWidget = new WindowsButtonWidget();
        return buttonWidget;*/
        /*ButtonWidget buttonWidget = null;*/
        if(ordertype.equals("button")){
            return new WindowsButtonWidget();
        }else if(ordertype.equals("textbox")){
            return new WindowsTextBoxWidget();
        }else {

            System.out.println("目前只支持button和textbox");
            return null;
        }
    }

    /*public TextBoxWidget CreateTextBox(String ordertype){
        TextBoxWidget textBoxWidget = new WindowsTextBoxWidget();
        return textBoxWidget;
    }*/
}
