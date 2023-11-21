package Strategy;
import Factory.SneakerF;


import java.util.List;

public class SneakerShop {
    private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void suggestSneakersToCustomer(List<SneakerF> sneakers) {
        System.out.println("Рекомендуемые кроссовки:");

        for (SneakerF sneaker : sneakers) {
            double price = sneaker.getPrice();
            System.out.println(sneaker.getModel() + " - Цена: $" + price);
        }
    }
}