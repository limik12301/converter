
import DTO.CurrencyDTO;
import Interfeces.Convert;
import Interfeces.CurrencyInputService;
import Interfeces.Reader;
import Models.CurrencyInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import services.CurrencyConvertService;
import services.CurrencyInputServiceImpl;
import services.ReaderService;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) throws FileNotFoundException, JsonProcessingException {
        CurrencyInputService inputService = new CurrencyInputServiceImpl();
        CurrencyInput currencyInput = inputService.currencyInput();

        Reader reader = new ReaderService();
        CurrencyDTO currencyDTO = reader.read();

        Convert converter = new CurrencyConvertService();

        System.out.println(converter.currencyConvert(currencyInput, currencyDTO));
    }
}
