package Daointerface.Impl;

import Daointerface.BookDao;
import Daointerface.ConnectionDAO;
import model.Books;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    @Override
    public void saveBook(List<Books> BookList){
        Connection conn = null;
        PreparedStatement ps = null;
        int count = 0;

        try {
            conn = ConnectionDAO.getConnection();
            String insertStmt = "INSERT INTO books (isbn,bookName) VALUE(?, ?)";
            ps = conn.prepareStatement(insertStmt);
            for(Books b : BookList){
                ps.setInt(1,b.getIsbn());
                ps.setString(2, b.getBookName());
                count += ps.executeUpdate();
            }
            System.out.println(count + " row(s) affected");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Books> getAllBooks(){
        Connection conn = null;
        Statement ps = null;
        List<Books> BookList = new ArrayList<Books>();
        try {
            conn = ConnectionDAO.getConnection();
            String selectStmt = "SELECT * FROM books";
            ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(selectStmt);

            while(rs.next()){
                Books book = new Books();
                book.setIsbn(rs.getInt("isbn"));
                book.setBookName(rs.getString("bookName"));
                BookList.add(book);
            }
            return BookList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean updateBooks(Books book, int id){
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionDAO.getConnection();
            String updateStmt = "UPDATE books SET isbn=?, bookName=? WHERE id=?";
            ps = conn.prepareStatement(updateStmt);
            ps.setInt(1, book.getIsbn());
            ps.setString(2, book.getBookName());
            ps.setInt(3, id);
            int count = ps.executeUpdate();
            System.out.println(count + " row(s) affected!!");
            if (count == 1){
                return true;
            }
            } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteBook(int id){
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionDAO.getConnection();
            String deletStmt = "DELETE FROM books WHERE id=?";
            ps = conn.prepareStatement(deletStmt);
            ps.setInt(1, id);
            int count = ps.executeUpdate();
            System.out.println(count + "row(s) affected!!");

            if(count == 1){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
