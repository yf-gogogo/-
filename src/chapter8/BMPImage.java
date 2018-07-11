package chapter8;

public class BMPImage implements BrowserAPI {
    @Override
    public void browserImage(String filepath) {
        System.out.println("浏览"+filepath+"的bmp图片");
    }
}
