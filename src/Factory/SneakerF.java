package Factory;

public abstract class SneakerF {
    private String model;
    private double price;

    public SneakerF(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}