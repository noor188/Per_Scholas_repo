package Runner;

import Daointerface.BookDao;
import Daointerface.Impl.BookDaoImpl;
import model.Books;

import java.util.ArrayList;
import java.util.List;

public class AccessBook {
    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();
//        System.out.println("--------- inserting book records ----------");
//        List<Books> booksList = new ArrayList<Books>();
//
//        Books b1 = new Books();
//        b1.setIsbn(120);
//        b1.setBookName("Java Book");
//        booksList.add(b1);
//
//        Books b2 = new Books();
//        b2.setIsbn(300);
//        b2.setBookName("Python Book");
//        booksList.add(b2);
//
//        Books b3 = new Books();
//        b3.setIsbn(365);
//        b3.setBookName("JavaScript Book");
//        booksList.add(b3);
//
//        Books b4 = new Books();
//        b4.setIsbn(256);
//        b4.setBookName("SQL Book");
//        booksList.add(b4);
//
//        bookDao.saveBook(booksList);
        System.out.println( " ====== Display list of all books ====");
        for (Books cc : bookDao.getAllBooks()) {
            int ISBN = cc.getIsbn();
            String BookName = cc.getBookName();
            System.out.println("======================");
            System.out.println("ISBN Number :" + ISBN + " and Book name: " + BookName);
        }

        System.out.println("\n ====== Update a book ======");
        Books book = new Books();
        book.setIsbn(23);
        book.setBookName("Book 2");
        boolean result = bookDao.updateBooks(book, 1);
        System.out.println(result);

        boolean a = bookDao.deleteBook(4); // 4 is a id of book
        if(a == true) {
            System.out.println("Record is deleted");
        }
        else
        {
            System.out.println("Record is not deleted");
        }    }
}
