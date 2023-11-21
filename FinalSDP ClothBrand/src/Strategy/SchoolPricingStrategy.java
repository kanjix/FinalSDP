package Strategy;

public class SchoolPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double price) {
        return price * 0.85; // 15% скидка для школьников
    }
}