package Factory;

public class NikeFactory implements SneakerFactory {
    @Override
    public SneakerF createSneaker(int model) {
        switch (model) {
            case 1:
                return new NikeSneaker("Nike AF1", 100.0);
            case 2:
                return new NikeSneaker("Nike DunkLow", 120.0);
            default:
                throw new IllegalArgumentException("Неверная модель для бренда Nike: " + model);
        }
    }
}