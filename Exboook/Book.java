package Exboook;

public class Book {
    private String code;
    private String title;
    private String author;
    private double price;

    public Book() {}

    public Book(String code, String title, String author, double price) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book details:\nCode: " + code + "\nTitle: " + title + "\nAuthor: " + author + "\nPrice: " + price;
    }
}

