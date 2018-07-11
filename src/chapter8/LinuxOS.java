package chapter8;

public class LinuxOS extends OS{
    protected LinuxOS(BrowserAPI browserAPI) {
        super(browserAPI);
    }

    @Override
    public void browser(String filepath) {
        browserAPI.browserImage(filepath);
    }
}
