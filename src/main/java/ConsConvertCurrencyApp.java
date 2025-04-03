import com.fasterxml.jackson.databind.ObjectMapper;
import models.UserInput;
import services.CurrencyRateService;
import services.UserInteraction;
import services.impl.ConvertCurrencyServiceImpl;
import services.ConvertCurrencyService;
import services.impl.CurrencyRateServiceImpl;
import services.impl.UserInteractionImpl;

public class ConsConvertCurrencyApp implements Runnable{

    private CurrencyRateService getCurrencyRate() {
        ObjectMapper mapper = new ObjectMapper();
        return new CurrencyRateServiceImpl(mapper);
    }

    private String getConvertValue(UserInput userInput) {
        ConvertCurrencyService convertCurrencyService = new ConvertCurrencyServiceImpl(getCurrencyRate());

        return convertCurrencyService.convertCurrencyRub(userInput).toString();
    }

    @Override
    public void run() {
        UserInteraction userInteraction = new UserInteractionImpl();

        userInteraction.showOutput(getConvertValue(userInteraction.getUserInput()));
    }
}
