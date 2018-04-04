package chapter2_1;


import chapter2_1.Widget.Widget;

public interface AbsFactory {
    public Widget CreateWidget(String ordertype) ;
    //public TextBoxWidget CreateTextBox(String ordertype) ;
}
