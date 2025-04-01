package services;

import DTO.CurrencyRateDTO;
import com.fasterxml.jackson.core.JsonProcessingException;


public interface CurrencyRateService {
    CurrencyRateDTO getCurrencyRate() throws JsonProcessingException;
}
