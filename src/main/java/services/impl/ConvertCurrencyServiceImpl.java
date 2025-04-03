package services.impl;


import models.CurrencyRate;
import models.UserInput;

import enums.Currency;
import services.ConvertCurrencyService;
import services.CurrencyRateService;


public class ConvertCurrencyServiceImpl implements ConvertCurrencyService {
    private final CurrencyRateService currencyRateService;

    public ConvertCurrencyServiceImpl(CurrencyRateService currencyRateService) {
        this.currencyRateService = currencyRateService;
    }

    @Override
    public Double convertCurrencyRub(UserInput userInput){
        CurrencyRate currencyRate = currencyRateService.readCurrencyRate();

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
