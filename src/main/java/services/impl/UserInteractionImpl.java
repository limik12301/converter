package services.impl;

import models.UserInput;
import services.UserInteraction;

import java.util.Scanner;

public class UserInteractionImpl implements UserInteraction {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public UserInput getUserInput() {
        double value = getInput("Enter value: ", Double.class);
        String currencyCode = getInput("Enter currency code: ", String.class);
        return new UserInput(currencyCode, value);
    }

    @Override
    public void showOutput(String str) {
        System.out.println(str);
    }

    private <T> T getInput(String prompt, Class<T> type) {
        showOutput(prompt);

        return switch (type.getSimpleName().toUpperCase()) {
            case "DOUBLE" -> type.cast(scanner.nextDouble());
            case "STRING" -> type.cast(scanner.next());
            default -> throw new IllegalStateException("Unexpected value: " + type.getSimpleName().toUpperCase());
        };
    }
}
