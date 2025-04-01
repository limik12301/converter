package services;

import models.UserInput;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface ConvertCurrencyService {
    Double convertCurrencyRub(UserInput userInput) throws JsonProcessingException;
}
