package products;

public class Book extends Product {
    private int numPages;
    private String author;
    private String genre;

    // Constructor to initialize the attributes, including those of the superclass
    public Book(double price, int amountInStock, int numPages, String author, String genre) {
        super(price, amountInStock); // Call the constructor of the superclass, Product
        this.numPages = numPages;
        this.author = author;
        this.genre = genre;
    }

    // Getter for numPages
    public int getNumPages() {
        return numPages;
    }

    // Setter for numPages
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Setter for genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Override the toString() method to provide a string representation of a Book object
    @Override
    public String toString() {
        return "Book{" +
                "price=" + getPrice() +
                ", amountInStock=" + getAmountInStock() +
                ", numPages=" + numPages +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}