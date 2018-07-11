package chapter8;

public class WindowsOS extends OS{
    protected WindowsOS(BrowserAPI browserAPI) {
        super(browserAPI);
    }

    @Override
    public void browser( String filepath) {
        browserAPI.browserImage(filepath);
    }
}
