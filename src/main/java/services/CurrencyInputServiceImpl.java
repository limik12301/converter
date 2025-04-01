package services;

import models.UserInput;

import java.util.Scanner;

public class CurrencyInputServiceImpl implements CurrencyInputService {
    private UserInput userInput;

    @Override
    public void getUserInputCurrency() {
        System.out.println("Enter value: ");
        Scanner scannerValue = new Scanner(System.in);
        double value = scannerValue.nextDouble();
        System.out.println("Enter currency code: ");
        Scanner scannerCurrencyCode = new Scanner(System.in);
        String currencyCode = scannerCurrencyCode.nextLine();
        this.userInput = new UserInput(currencyCode,value);
    }

    @Override
    public UserInput showUserInputCurrency() {
        return userInput;
    }
}
