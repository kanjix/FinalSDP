package Strategy;

public class StudentPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double price) {
        return price * 0.8; // 20% скидка для студентов
    }
}