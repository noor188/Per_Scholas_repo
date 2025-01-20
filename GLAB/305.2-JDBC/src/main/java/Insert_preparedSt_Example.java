import java.sql.*;

public class Insert_preparedSt_Example {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stat = null;
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String dbuser = "root";
        String dbpassword = "password";
        try {
            conn = DriverManager.getConnection(dburl, dbuser, dbpassword);
            System.out.println("Connection established successfully!");
            String insertStmt = "INSERT INTO EMPLOYEES (officeCode,firstName,lastName,email,extension,reportsTo,VacationHours,employeeNumber,jobTitle) VALUES (?,?,?,?,?,?,?,?,?)";
            stat = conn.prepareStatement(insertStmt);
            stat.setInt(1, 6);
            stat.setString(2, "Jamil");
            stat.setString(3, "fink");
            stat.setString(4, "JJ@gmail.com");
            stat.setString(5, "2759");
            stat.setInt(6, 1143);
            stat.setInt(7, 9);
            stat.setInt(8, 0003);
            stat.setString(9, "Manager");

            int rowCount = stat.executeUpdate();
            System.out.println(rowCount + " row(s) inserted!");

            String selectStmt = "SELECT * FROM EMPLOYEES WHERE employeeNumber=?";
            stat = conn.prepareStatement(selectStmt);
            stat.setInt(1,0003);
            ResultSet rs = stat.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("officeCode"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            stat.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
