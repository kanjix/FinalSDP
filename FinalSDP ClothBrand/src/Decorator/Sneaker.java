package Decorator;

public class Sneaker {
    private String description;
    private double price;

    public Sneaker(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}

// Аналогично для других декораторов
