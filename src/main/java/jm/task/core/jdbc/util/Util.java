package jm.task.core.jdbc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
//    private static String dbURL = "jdbc:mysql://localhost:3306/schema1";
//    private static String dbUsername = "root";
//    private static String  dbPasseord = "RefPadrol87!";

    public static Connection getConnection() {
        String dbURL = null;
        String dbUsername = null;
        String  dbPassword = null;

        FileInputStream fis;
        Properties properties = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            properties.load(fis);

            dbURL = properties.getProperty("db.url");
            dbUsername = properties.getProperty("db.username");
            dbPassword = properties.getProperty("db.password");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
