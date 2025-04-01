import Impl.CurrencyConvertServiceImpl;
import Impl.UserInterfaceServiceImpl;
import Models.UserInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import services.CurrencyConvertService;
import services.UserInterfaceService;

public class Converter {
    public static void main(String[] args) throws JsonProcessingException {
        UserInterfaceService userInterfaceService = new UserInterfaceServiceImpl();
        CurrencyConvertService currencyConvertService = new CurrencyConvertServiceImpl();
        System.out.println(currencyConvertService.currencyConvertRub(userInterfaceService.getUserInput()));
    }
}
