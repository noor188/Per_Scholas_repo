package model;

public class Books {
    private int id;
    private int isbn;
    private String bookName;

    public Books() {}

    public Books(int isbn, String bookName){
        this.isbn = isbn;
        this.bookName = bookName;
    }

    public Books(int id, int isbn, String bookName){
        this.id = id;
        this.isbn = isbn;
        this.bookName = bookName;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public int getIsbn(){
        return this.isbn;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getBookName(){
        return this.bookName;
    }
}
