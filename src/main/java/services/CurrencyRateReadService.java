package services;

import dto.CurrencyRateDTO;

import java.io.IOException;


public interface CurrencyRateReadService {
    CurrencyRateDTO showCurrencyRate();
    void readCurrencyRate();
}
