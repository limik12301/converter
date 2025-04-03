package services;

import models.UserInput;

public interface UserInteraction {
    UserInput getUserInput();
    void showOutput(String str);
}
