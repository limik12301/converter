package services;

import Models.UserInput;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface CurrencyConvertService {
    Double currencyConvertRub(UserInput userInput) throws JsonProcessingException;
}
