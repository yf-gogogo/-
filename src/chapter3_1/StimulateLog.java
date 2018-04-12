package chapter3_1;

import chapter3_1.log.ConsoleLog;
import chapter3_1.log.DBLog;
import chapter3_1.log.FilesLog;
import chapter3_1.log.Log;


public class StimulateLog {
    public static void main(String[] args) {
        Log consolelog = new ConsoleLog();
        consolelog.Display();
        consolelog.outlog();

        Log fileslog = new FilesLog();
        fileslog.Display();
        fileslog.outlog();

        Log dblog = new DBLog();
        dblog.Display();
        dblog.outlog();

    }
}
