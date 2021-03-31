import java.sql.Connection;
import java.sql.DriverManager;

// package src;

class DbConnect {

    private static String getConnectionString (String host, String port, String dbName) {
        return "jdbc:mysql://" + host + ":" + port + "/" + dbName;
    }

    private static void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // get (host, port, dbName)
        // get Credentials
        String username = "root";
        String password = "";
        String cs = getConnectionString("localhost", "3306", "olx_test");
        System.out.println("Connection String: " + cs);
        // Initialize connection by connecting to the database
        Connection connection;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(cs, username, password);
            closeConnection(connection);
        } catch(Exception e) {
            e.printStackTrace();
        }
        // Retrieve data or perform select operation
    }
    
}