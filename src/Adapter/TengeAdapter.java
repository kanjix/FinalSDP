package Adapter;

public class TengeAdapter implements CurrencyConverter {
    private DefaultCurrencyConverter defaultCurrencyConverter;

    public TengeAdapter(DefaultCurrencyConverter defaultCurrencyConverter) {
        this.defaultCurrencyConverter = defaultCurrencyConverter;
    }

    @Override
    public double convertFromUSD(double amountInUSD) {
        // Предполагаем, что 1 евро = 1.2 доллара
        return defaultCurrencyConverter.convertFromUSD(amountInUSD) / 0.0022;
    }
}
