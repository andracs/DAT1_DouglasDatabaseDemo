package dk.hungarian;

import java.sql.Connection;

public class Main {



    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello dude");

        Connection con = DB_Connector.connect();
    }
}
