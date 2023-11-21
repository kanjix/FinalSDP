package Decorator;

public class GiftCardDecorator extends Sneaker {
    private Sneaker sneaker;

    public GiftCardDecorator(Sneaker sneaker, String description, double price) {
        super(description, price); // Добавлен вызов конструктора суперкласса с параметрами
        this.sneaker = sneaker;
    }

    @Override
    public String getDescription() {
        return sneaker.getDescription() + ", с подарочной картой";
    }

    @Override
    public double getPrice() {
        return sneaker.getPrice() + 10.0;
    }
}
