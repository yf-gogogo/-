package chapter3_1.log;

import chapter3_1.output.FilesOutput;

public class FilesLog extends Log {
    public FilesLog() {
        output = new FilesOutput();
    }

    @Override
    public void Display() {
        System.out.println("将写入文件");
    }
}
