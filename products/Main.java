package products;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(19.99, 50, 300, "J.K. Rowling", "Fantasy");
        System.out.println(book.toString());
    }
}
