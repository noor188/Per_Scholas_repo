package model;

public class Books {
    private int id;
    private int isbn;
    private String bookName;

    public Books(){}
    public Books(int id, int isbn, String bookName) {
        this.id = id;
        this.isbn = isbn;
        this.bookName = bookName;
    }
    public Books(int isbn, String bookName){
        this.isbn = isbn;
        this.bookName = bookName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
