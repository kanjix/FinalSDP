package Strategy;

import Decorator.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double price) {
        return price; // Без скидок для обычных клиентов
    }
}