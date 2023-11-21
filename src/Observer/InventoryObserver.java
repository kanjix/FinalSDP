package Observer;

public interface InventoryObserver {
    void updateAvailability(boolean available);
}

// Класс управления наличием кроссовок должен иметь методы для добавления и удаления наблюдателей,
// а также для оповещения их о наличии кроссовок.
