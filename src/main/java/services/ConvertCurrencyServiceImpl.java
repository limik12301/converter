package services;


import models.CurrencyRate;
import models.UserInput;

import enums.Currency;


public class ConvertCurrencyServiceImpl implements ConvertCurrencyService {
    private final CurrencyRateReadService currencyRateReadService = new CurrencyRateReadServiceImpl();

    @Override
    public Double convertCurrencyRub(UserInput userInput){
        CurrencyRate currencyRate = new CurrencyRate();
        currencyRateReadService.readCurrencyRate();
        currencyRate.setEur(currencyRateReadService.showCurrencyRate().getEur());
        currencyRate.setUsd(currencyRateReadService.showCurrencyRate().getUsd());

        Currency currency = Currency.valueOf(userInput.currencyCode.toUpperCase());
        switch (currency) {
            case EUR:
                return  userInput.getValue() / currencyRate.getEur();
            case USD:
                return  userInput.getValue() / currencyRate.getUsd();
        }
        throw new NullPointerException("Invalid currency code");
    }
}
