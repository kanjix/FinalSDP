package Observer;

public class Customer implements InventoryObserver {
    @Override
    public void updateAvailability(boolean available) {
        if (available) {
            System.out.println("Кроссовки доступны для покупки!");
        } else {
            System.out.println("Кроссовки временно отсутствуют.");
        }
    }
}
