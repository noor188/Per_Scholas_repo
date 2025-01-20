package Daointerface;
import model.Books;

import java.util.List;

public interface BookDao {

    void saveBook(List<Books> BookList);
    List<Books> getAllBooks();
    boolean updateBooks(Books book, int id);
    boolean deleteBook(int id);
}
