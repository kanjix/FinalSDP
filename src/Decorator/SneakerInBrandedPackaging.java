package Decorator;

public class SneakerInBrandedPackaging extends Sneaker {
    public SneakerInBrandedPackaging(String description, double price) {
        super(description, price);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " в фирменной упаковке";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 15.0; // Предположим, что фирменная упаковка стоит 20.0
    }
}
