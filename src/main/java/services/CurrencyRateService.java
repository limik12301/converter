package services;


import models.CurrencyRate;

public interface CurrencyRateService {
    CurrencyRate readCurrencyRate(String url);
}
