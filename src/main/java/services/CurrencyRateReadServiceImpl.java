package services;

import dto.CurrencyRateDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CurrencyRateReadServiceImpl implements CurrencyRateReadService {
    private CurrencyRateDTO currencyRateDTO = new CurrencyRateDTO();

    @Override
    public void readCurrencyRate(){
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
            this.currencyRateDTO = new ObjectMapper().readValue(jsonObject.toString(), CurrencyRateDTO.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CurrencyRateDTO showCurrencyRate() {
        return currencyRateDTO;
    }
}
