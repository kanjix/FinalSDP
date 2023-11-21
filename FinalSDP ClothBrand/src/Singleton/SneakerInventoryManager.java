package Singleton;

public class SneakerInventoryManager {
    private static SneakerInventoryManager instance;
    private int sneakerCount;

    private SneakerInventoryManager() {
        sneakerCount = 0;
    }

    public static SneakerInventoryManager getInstance() {
        if (instance == null) {
            instance = new SneakerInventoryManager();
        }
        return instance;
    }

    // Добавление новых кроссовок в инвентарь
    public synchronized void addSneakers(int quantity) {
        sneakerCount += quantity;
    }

    // Удаление кроссовок из инвентаря
    public synchronized void removeSneakers(int quantity) {
        if (isQuantityAvailable(quantity)) {
            sneakerCount -= quantity;
        } else {
            System.out.println("Недостаточно кроссовок на складе.");
        }
    }

    // Получение информации о наличии кроссовок
    public synchronized int getSneakerCount() {
        return sneakerCount;
    }

    // Проверка наличия кроссовок
    public synchronized boolean isQuantityAvailable(int quantity) {
        return sneakerCount >= quantity;
    }

    // Другие методы для управления инвентарем
    // ...
}
