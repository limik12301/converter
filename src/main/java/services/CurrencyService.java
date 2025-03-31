package services;

import DTO.CurrencyDTO;
import Models.Currency;
import Validations.CurrencyValidation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CurrencyService {
    private final Currency currency = new Currency();

    public void read() throws JsonProcessingException {
        String fileURL = ("C:\\Users\\nastya\\IdeaProjects\\converter\\src\\main\\resources\\value.json");
        StringBuilder jsonObject = new StringBuilder();
        try (FileReader fr = new FileReader(fileURL)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                jsonObject.append(sc.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        CurrencyDTO currencyDTO = new ObjectMapper().readValue(jsonObject.toString(), CurrencyDTO.class);
        this.currency.setEur(currencyDTO.getEur());
        this.currency.setUsd(currencyDTO.getUsd());
    }

    public Double convert(String currencyCode, Double value) throws JsonProcessingException {
        read();
        CurrencyValidation validation = new CurrencyValidation();
        validation.validateValue(value);
        validation.validateCurrencyCode(currencyCode);
        switch (currencyCode.toLowerCase()) {
            case "eur":
                return  value / this.currency.getEur();
            case "usd":
                return  value / this.currency.getUsd();
                default:return null;
        }
    }
}
