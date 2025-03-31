package Validations;

public class CurrencyValidation {


    public void validateValue(Double value) {
        if (value==0){
            throw new NumberFormatException("value cannot be zero");
        }
        else if (value<0){
            throw new NumberFormatException("value cannot be negative");
        }
    }

    public void validateCurrencyCode(String currencyCode) {
        if (currencyCode==null) {
            throw new NullPointerException("Currency code cannot be null");
        }
        else if (!currencyCode.equalsIgnoreCase("usd")&&!currencyCode.equalsIgnoreCase("eur")){
            throw new NullPointerException("Currency code not found");
        }
    }
}

