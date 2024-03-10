package products;

public class Product {
    private double price;
    private int amountInStock;

    // Constructor to initialize the attributes
    public Product(double price, int amountInStock) {
        this.price = price;
        this.amountInStock = amountInStock;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for amountInStock
    public int getAmountInStock() {
        return amountInStock;
    }

    // Setter for amountInStock
    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }
}