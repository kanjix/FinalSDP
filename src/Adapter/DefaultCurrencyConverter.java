package Adapter;

public class DefaultCurrencyConverter implements CurrencyConverter {
    @Override
    public double convertFromUSD(double amount) {
        // Просто возвращаем сумму, предполагая, что это уже в долларах
        return amount;
    }
}