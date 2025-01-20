import java.sql.*;

public class Update_preparedSt_Example {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String dbuser = "root";
        String dbpassword = "password";

        try {
            conn = DriverManager.getConnection(dburl, dbuser, dbpassword);
            System.out.println("Connection established successfully!");
            String updateStmt = "update employees set firstName=? , lastName=? where employeeNumber = ?";
            prepStmt = conn.prepareStatement(updateStmt);
            prepStmt.setString(1, "John");
            prepStmt.setString(2, "Smith");
            prepStmt.setInt(3, 0003);
            int rowCount = prepStmt.executeUpdate();
            System.out.println(rowCount + " row(s) updated!!!");

            String selectStmt = "SELECT * FROM employees WHERE employeeNumber =?";
            prepStmt = conn.prepareStatement(selectStmt);
            prepStmt.setInt(1, 0003);
            rs = prepStmt.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("officeCode"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            prepStmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
