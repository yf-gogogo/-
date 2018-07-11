package chapter8;

public class BridgePatternDemo {
    public static void main(String[] args) {
        OS windowsOS = new WindowsOS(new BMPImage());
        windowsOS.browser("C盘");
        OS linuxOS = new LinuxOS(new GIFImage());
        linuxOS.browser("D盘");
    }
}
