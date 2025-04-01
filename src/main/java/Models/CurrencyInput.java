package Models;

public class CurrencyInput {
    public String currencyCode;
    public Double value;

    public CurrencyInput() {}

    public CurrencyInput(String currencyCode, Double value) {
        this.currencyCode = currencyCode;
        this.value = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
