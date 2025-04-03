package services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.CurrencyRate;
import services.CurrencyRateService;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CurrencyRateServiceImpl implements CurrencyRateService {
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public CurrencyRate readCurrencyRate(){
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
        try {
            return mapper.readValue(jsonObject.toString(), CurrencyRate.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
