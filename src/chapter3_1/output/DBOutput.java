package chapter3_1.output;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBOutput implements Output {
    @Override
    public void outputlog(String logs) {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:F:\\javaproject\\test.sqlite");
            System.out.println("Opened database successfully");
            statement = conn.createStatement();
            String sql = "CREATE TABLE  IF NOT EXISTS logout" +
                    "(ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,LOG TEXT NOT NULL)";
            statement.execute(sql);
            String sql1 = "INSERT INTO logout (LOG)"+
                    "VALUES ('"+ logs +"');";
            statement.executeUpdate(sql1);
            statement.close();
            conn.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }finally {
            System.out.println("在test.sqlite中查看");
            System.out.println("================");
        }
    }
}
