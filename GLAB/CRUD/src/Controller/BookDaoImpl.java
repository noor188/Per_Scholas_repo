package Controller;
import Daointerface.BookDao;
import Daointerface.ConnectionDAO;
import model.Books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl extends ConnectionDAO implements BookDao{

    @Override
    public List<Books> getAllBooks() {
        try{
            Connection connection = ConnectionDAO.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");
            List boollist = new ArrayList();

            while(rs.next()){
                Books b = new Books();
                b.setId(rs.getInt("isbn"));
                b.setBookName(rs.getString("bookName"));
                boollist.add(b);
            }
            return boollist;
        } catch (SQLException ex){
            ex.printStackTrace();
            System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
        }
        return null;
    }

    @Override
    public void saveBook(List<Books> BookList){
        try {
            Connection con = ConnectionDAO.getConnection();
            for (Books b : BookList) {
                String sqlQuery = "INSERT INTO books (isbn, bookName) VALUES (?,?)";
                PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
                prepStmt.setInt(1, b.getIsbn());
                prepStmt.setString(2, b.getBookName());
                int affectedRows = prepStmt.executeUpdate();
                System.out.println(affectedRows + "row(s) affected !!");
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public boolean deleteBook(int id) {
        try{
            Connection connection = ConnectionDAO.getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM books WHERE id=?");
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i == 1) {
                return true;
            }
        } catch (SQLException ex){
            System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
        }
        return false;
    }
    @Override
    public boolean updateBook (Books bookObj, int id){
        try{
            Connection connection = ConnectionDAO.getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE books SET isbn=?, bookName=? WHERE id=?");
            ps.setInt(1, bookObj.getIsbn());
            ps.setString(2, bookObj.getBookName());
            ps.setInt(3, id);
            int i = ps.executeUpdate();
            if(i == 1){
                return true;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
        }
        return false;
    }
}
