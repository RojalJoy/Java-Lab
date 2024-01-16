import java.sql.*;

public class Lab_Exercise_10 {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/games";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";

    public static void main(String[] args) {
        // Load JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        // Establish a connection
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {

            // Create a statement
            Statement statement = connection.createStatement();

            // Retrieve rented games data
            ResultSet resultSet = statement.executeQuery("SELECT * FROM game");

            // Process the result set
            while (resultSet.next()) {
                int rentalId = resultSet.getInt("rental_id");
                String gameName = resultSet.getString("game_name");
                int customerId = resultSet.getInt("customer_id");
                String rentalDate = resultSet.getString("rental_date");

                // Process the data as needed
                System.out.println("Rental ID: " + rentalId + ", Game : " + gameName +
                        ", Customer ID: " + customerId + ", Rental Date: " + rentalDate);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
