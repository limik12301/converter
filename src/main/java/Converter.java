
import com.fasterxml.jackson.core.JsonProcessingException;
import services.CurrencyService;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) throws FileNotFoundException, JsonProcessingException {
        Scanner scnValue = new Scanner(System.in);
        double value = scnValue.nextDouble();
        Scanner scnCurrency = new Scanner(System.in);
        StringBuilder currency = new StringBuilder();
        currency.append(scnCurrency.nextLine());
        System.out.println(new CurrencyService().convert(currency.toString(), value));
    }
}
