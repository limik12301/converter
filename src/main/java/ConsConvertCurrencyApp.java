import com.fasterxml.jackson.databind.ObjectMapper;
import services.CurrencyRateService;
import services.UserInteraction;
import services.impl.ConvertCurrencyServiceImpl;
import services.ConvertCurrencyService;
import services.impl.CurrencyRateServiceImpl;
import services.impl.UserInteractionImpl;

public class ConsConvertCurrencyApp implements Runnable{

    @Override
    public void run() {
        ObjectMapper mapper = new ObjectMapper();
        CurrencyRateService currencyRateService = new CurrencyRateServiceImpl(mapper);

        ConvertCurrencyService convertCurrencyService = new ConvertCurrencyServiceImpl(currencyRateService);

        UserInteraction userInteraction = new UserInteractionImpl();

        userInteraction.showOutput(convertCurrencyService
                                      .convertCurrencyRub(userInteraction.getUserInput()).toString());
    }
}
