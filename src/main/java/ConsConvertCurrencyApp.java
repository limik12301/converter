import services.ConvertCurrencyServiceImpl;
import services.CurrencyInputServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import services.ConvertCurrencyService;
import services.CurrencyInputService;

public class ConsConvertCurrencyApp {
    public void ConvertRub() {
        ConvertCurrencyService convertCurrencyService = new ConvertCurrencyServiceImpl();
        CurrencyInputService currencyInputService = new CurrencyInputServiceImpl();
        currencyInputService.getUserInputCurrency();
        try {
            System.out.println(convertCurrencyService.convertCurrencyRub(currencyInputService.showUserInputCurrency()));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
