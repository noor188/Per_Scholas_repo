package Daointerface;

import java.util.List;
import model.Books;
import java.sql.SQLException;

public interface BookDao {

    List<Books> getAllBooks() throws ClassNotFoundException, SQLException;

    void saveBook(List<Books> BookList);

    boolean deleteBook(int id);

    boolean updateBook (Books book, int id);
}
