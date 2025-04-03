package services.impl;

import models.UserInput;
import services.UserInteraction;

import java.util.Scanner;

public class UserInteractionImpl implements UserInteraction {

    @Override
    public UserInput getUserInput() {
        System.out.println("Enter value: ");
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        System.out.println("Enter currency code: ");
        String currencyCode = scanner.next();
        return new UserInput(currencyCode,value);
    }

    @Override
    public void showOutput(String str) {
        System.out.println(str);
    }
}
