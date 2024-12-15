public class Book {

    private int number;
    private String name;
    private String author;
    private String category;

    public Book(){

    }

    public Book(int number, String name, String author, String category) {
        this.number = number;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public int getNumber(){
        return this.number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name1) {
        this.name = name1;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }



}
