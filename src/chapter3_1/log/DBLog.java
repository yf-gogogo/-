package chapter3_1.log;

import chapter3_1.output.DBOutput;

public class DBLog extends Log {
    public DBLog() {
        output = new DBOutput();
    }

    @Override
    public void Display() {
        System.out.println("将写入sqlite数据库");
    }
}
