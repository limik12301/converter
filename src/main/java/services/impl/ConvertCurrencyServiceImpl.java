package services.impl;


import models.CurrencyRate;
import models.UserInput;

import enums.Currency;
import services.ConvertCurrencyService;
import services.CurrencyRateService;


public class ConvertCurrencyServiceImpl implements ConvertCurrencyService {
    private final CurrencyRateService currencyRateService = new CurrencyRateServiceImpl();

    @Override
    public Double convertCurrencyRub(UserInput userInput){
        CurrencyRate currencyRate = new CurrencyRate();
        currencyRate.setEur(currencyRateService.readCurrencyRate().getEur());
        currencyRate.setUsd(currencyRateService.readCurrencyRate().getUsd());

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
