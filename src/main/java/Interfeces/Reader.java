package Interfeces;

import DTO.CurrencyDTO;
import com.fasterxml.jackson.core.JsonProcessingException;


public interface Reader {
    CurrencyDTO read() throws JsonProcessingException;
}
