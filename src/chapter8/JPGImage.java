package chapter8;

public class JPGImage implements BrowserAPI {
    @Override
    public void browserImage(String filepath) {
        System.out.println("浏览"+filepath+"的jpg图片");
    }
}
