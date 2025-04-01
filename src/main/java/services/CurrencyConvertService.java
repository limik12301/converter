package services;

import DTO.CurrencyDTO;
import Interfeces.Convert;
import Interfeces.Reader;
import Models.Currency;
import Models.CurrencyInput;
import Validations.CurrencyValidation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CurrencyConvertService implements Convert{

    @Override
    public Double currencyConvert(CurrencyInput currencyInput, CurrencyDTO currencyDTO) throws JsonProcessingException {
        Currency currency = new Currency();
        currency.setEur(currencyDTO.getEur());
        currency.setUsd(currencyDTO.getUsd());
        CurrencyValidation validation = new CurrencyValidation();
        validation.validateValue(currencyInput.getValue());
        validation.validateCurrencyCode(currencyInput.getCurrencyCode());
        switch (currencyInput.getCurrencyCode().toLowerCase()) {
            case "eur":
                return  currencyInput.getValue() / currency.getEur();
            case "usd":
                return  currencyInput.getValue() / currency.getUsd();
                default:return null;
        }
    }
}
