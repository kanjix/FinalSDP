package Adapter;

public class RubleAdapter implements CurrencyConverter {
    private DefaultCurrencyConverter defaultCurrencyConverter;

    public RubleAdapter(DefaultCurrencyConverter defaultCurrencyConverter) {
        this.defaultCurrencyConverter = defaultCurrencyConverter;
    }

    @Override
    public double convertFromUSD(double amountInUSD) {
        // Предполагаем, что 1 рубль = 0.014 доллара
        return defaultCurrencyConverter.convertFromUSD(amountInUSD) / 0.011;
    }
}