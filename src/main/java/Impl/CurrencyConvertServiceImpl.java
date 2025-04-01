package Impl;


import Models.CurrencyRate;
import Models.UserInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import services.CurrencyConvertService;
import services.CurrencyRateService;

public class CurrencyConvertServiceImpl implements CurrencyConvertService {
    private final CurrencyRateService currencyRateService = new CurrencyRateServiceImpl();

    @Override
    public Double currencyConvertRub(UserInput userInput) throws JsonProcessingException {
        CurrencyRate currencyRate = new CurrencyRate();
        currencyRate.setEur(currencyRateService.getCurrencyRate().getEur());
        currencyRate.setUsd(currencyRateService.getCurrencyRate().getUsd());
        switch (userInput.getCurrencyCode().toLowerCase()) {
            case "eur":
                return  userInput.getValue() / currencyRate.getEur();
            case "usd":
                return  userInput.getValue() / currencyRate.getUsd();
        }
        throw new NullPointerException("Invalid currency code");
    }
}
