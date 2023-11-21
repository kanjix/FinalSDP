package Factory;

public class AdidasFactory implements SneakerFactory {
    @Override
    public SneakerF createSneaker(int model) {
        switch (model) {
            case 1:
                return new AdidasSneaker("Adidas Superstar", 120.0);
            case 2:
                return new AdidasSneaker("Adidas Aloha Shoes", 150.0);
            default:
                throw new IllegalArgumentException("Неверная модель для бренда Adidas: " + model);
        }
    }
}