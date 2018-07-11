package chapter8;

public abstract class OS {
    protected BrowserAPI browserAPI;
    protected OS(BrowserAPI browserAPI){
        this.browserAPI = browserAPI;
    }
    public abstract void browser(String filename);
}
