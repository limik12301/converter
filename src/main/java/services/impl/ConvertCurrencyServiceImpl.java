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
        String url = "src/main/resources/value.json";
        CurrencyRate currencyRate = currencyRateService.readCurrencyRate(url);

        Currency currency = Currency.valueOf(userInput.currencyCode.toUpperCase());
        return switch (currency) {
            case EUR -> userInput.getValue() / currencyRate.getEur();
            case USD -> userInput.getValue() / currencyRate.getUsd();
        };
    }
}
