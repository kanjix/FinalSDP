package Adapter;

public class SizeAdapterUsToUkEu implements SizeAdapter {
    @Override
    public int convertSize(int size, String from, String to) {
        if (from.equals("US") && to.equals("UK")) {
            // Логика конвертации US в UK
            // Например, 7.5 US -> 6 UK
            return size - 1;
        } else if (from.equals("US") && to.equals("EU")) {
            // Логика конвертации US в EU
            // Например, 7.5 US -> 40 EU
            return (int) (size * 2.54);
        } else {
            // Обработка других случаев
            System.out.println("Конвертация не поддерживается для заданных типов размеров");
            return size;
        }
    }
}