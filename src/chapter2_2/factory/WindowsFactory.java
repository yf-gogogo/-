package chapter2_2.factory;


public class WindowsFactory extends AbstractFactory {
    @Override
    public Button CreateButton() {
        return new WindowsButton();
    }

    @Override
    public Textbox CreateTextBox() {
        return new WindowsTextBox();
    }
}
