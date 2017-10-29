package dk.hungarian;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connector {

    //    declare JDBC driver
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //    declare a connection
    private static Connection con = null;
    //    the url = jdbc:dbms//host name:port#/db name
    private static String url = "jdbc:mysql://localhost:3306/MyNewDatabase";

    //    declare user name
    private static String usr = "root";
    //    declare password
    private static String pswrd = "12345";

    //    Create the connection method
    public static Connection connect() {
        System.out.println("Connecting to mysql");


//    Locate MySQL JDBC Driver
        try {
            Class.forName(DRIVER);
        }

//    Catch exceptions if JDBC is not found
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("JDBC Missin");
        }
//    Connect to MySQL DB = URL, usrName, pswrd
        try {
            con = DriverManager.getConnection(url, usr, pswrd);
        }
//    Catch exceptions on connection error
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("No connect");
        }
//    if connection successful

        if (con != null) {
            System.out.println("Connected the shit out of DB");
        } else {
            System.out.println("Fuck off, aint no conn til dig.");
        }

        return con;

//    if connection fails

    }
}
