package Interfeces;

import Models.CurrencyInput;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface CurrencyInputService {
    CurrencyInput currencyInput() throws JsonProcessingException;
}
