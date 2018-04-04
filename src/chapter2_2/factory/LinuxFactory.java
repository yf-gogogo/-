package chapter2_2.factory;

public class LinuxFactory extends AbstractFactory {

    @Override
    public Button CreateButton() {
        return new LinuxButton();
    }

    @Override
    public Textbox CreateTextBox() {
        return new LinuxTextBox();
    }
}
