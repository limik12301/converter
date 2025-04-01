package Interfeces;

import DTO.CurrencyDTO;
import Models.CurrencyInput;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface Convert {
    Double currencyConvert(CurrencyInput currencyInput, CurrencyDTO currencyDTO) throws JsonProcessingException;
}
