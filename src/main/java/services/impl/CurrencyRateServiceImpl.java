package services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.CurrencyRate;
import services.CurrencyRateService;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CurrencyRateServiceImpl implements CurrencyRateService {
    private final ObjectMapper mapper;

    public CurrencyRateServiceImpl(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public CurrencyRate readCurrencyRate(String url) {
        StringBuilder jsonObject = new StringBuilder();
        try (FileReader fr = new FileReader(url)) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                jsonObject.append(sc.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            return mapper.readValue(jsonObject.toString(), CurrencyRate.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
