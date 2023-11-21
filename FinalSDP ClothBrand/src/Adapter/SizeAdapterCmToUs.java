package Adapter;

public class SizeAdapterCmToUs implements SizeAdapter {
    @Override
    public int convertSize(int size, String from, String to) {
        if (from.equals("CM") && to.equals("US")) {
            // Логика конвертации CM в US
            // Например, 25 см -> 7.5 US
            return (int) (size / 2.54);
        } else {
            // Обработка других случаев
            System.out.println("Конвертация не поддерживается для заданных типов размеров");
            return size;
        }
    }
}