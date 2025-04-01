package services;

import DTO.CurrencyDTO;
import Interfeces.CurrencyInputService;
import Models.CurrencyInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CurrencyInputServiceImpl implements CurrencyInputService {
    @Override
    public CurrencyInput currencyInput() throws JsonProcessingException {
        Scanner scnValue = new Scanner(System.in);
        double value = scnValue.nextDouble();
        Scanner scnCurrency = new Scanner(System.in);
        StringBuilder currency = new StringBuilder();
        currency.append(scnCurrency.nextLine());
        return new CurrencyInput(currency.toString(), value);
    }
}
