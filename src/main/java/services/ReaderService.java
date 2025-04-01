package services;

import DTO.CurrencyDTO;
import Interfeces.Reader;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderService implements Reader {

    @Override
    public CurrencyDTO read() throws JsonProcessingException {
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
        return new ObjectMapper().readValue(jsonObject.toString(), CurrencyDTO.class);
    }
}
