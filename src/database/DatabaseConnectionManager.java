package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Roman on 07.08.2016.
 */
public class DatabaseConnectionManager {

    private Connection conn;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    public static DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;
    }

    public void connect() throws SQLException{
        conn = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Established Database Connection...");
    }

    public  Connection getConnectionObject(){
        return conn;

    }

    public void disconnect(){

    }
}
