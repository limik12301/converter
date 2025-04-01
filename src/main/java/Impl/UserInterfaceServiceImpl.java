package Impl;

import Models.UserInput;
import services.UserInterfaceService;

import java.util.Scanner;

public class UserInterfaceServiceImpl implements UserInterfaceService {

    @Override
    public UserInput getUserInput() {
        Scanner scannerValue = new Scanner(System.in);
        double value = scannerValue.nextDouble();
        Scanner scannerCurrencyCode = new Scanner(System.in);
        String currencyCode = scannerCurrencyCode.nextLine();
        return new UserInput(currencyCode,value);
    }
}
