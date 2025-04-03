package services.impl;

import dto.CurrencyRateDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import services.CurrencyRateService;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CurrencyRateServiceImpl implements CurrencyRateService {
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public CurrencyRateDTO readCurrencyRate(){
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
            return mapper.readValue(jsonObject.toString(), CurrencyRateDTO.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
