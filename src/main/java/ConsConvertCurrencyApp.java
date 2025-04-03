import services.UserInteraction;
import services.impl.ConvertCurrencyServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import services.ConvertCurrencyService;
import services.impl.UserInteractionImpl;

public class ConsConvertCurrencyApp implements Runnable{

    @Override
    public void run() {
        ConvertCurrencyService convertCurrencyService = new ConvertCurrencyServiceImpl();
        UserInteraction userInteraction = new UserInteractionImpl();
        try {
            userInteraction.showOutput(convertCurrencyService
                                      .convertCurrencyRub(userInteraction.getUserInput()).toString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
