package Interfeces;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Convert {
    Double convert(String currencyCode, Double value) throws JsonProcessingException;
}
