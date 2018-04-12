package chapter3_1.output;

import java.io.*;

public class FilesOutput implements Output {
    @Override
    public void outputlog(String logs) {
        OutputStream fos = null;
        OutputStreamWriter writer = null;
        try {
            File f = new File("./logs.txt");
            fos = new FileOutputStream(f);
            writer = new OutputStreamWriter(fos, "UTF-8");
            writer.append(logs);
            writer.close();
            fos.close();
        }catch (Exception e){

        }finally {
            System.out.println("在logs.txt文件查看");
            System.out.println("================");
        }
    }
}
