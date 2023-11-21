package Factory;

public class NewBalanceFactory implements SneakerFactory {
    @Override
    public SneakerF createSneaker(int model) {
        switch (model) {
            case 1:
                return new NewBalanceSneaker("New Balance Fresh Foam", 130.0);
            case 2:
                return new NewBalanceSneaker("New Balance FuelCell", 140.0);
            default:
                throw new IllegalArgumentException("Неверная модель для бренда New Balance: " + model);
        }
    }
}