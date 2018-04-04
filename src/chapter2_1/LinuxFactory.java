package chapter2_1;

import chapter2_1.AbsFactory;
import chapter2_1.Widget.*;

public class LinuxFactory implements AbsFactory {
    @Override
    public Widget CreateWidget(String ordertype){
        /*ButtonWidget buttonWidget = new LinuxButtonWidget();
        return buttonWidget;*/
        /*ButtonWidget buttonWidget = null;*/
        if(ordertype.equals("button")){
            return new LinuxButtonWidget();
        }else if(ordertype.equals("textbox")){
            return new LinuxTextBoxWidget();
        }else {

            System.out.println("目前只支持button和textbox");
            return null;
        }
    }

    /*public TextBoxWidget CreateTextBox(String ordertype){
        TextBoxWidget textBoxWidget = new LinuxTextBoxWidget();
        return textBoxWidget;
    }*/
}
