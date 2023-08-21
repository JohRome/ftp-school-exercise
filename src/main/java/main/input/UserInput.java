package main.input;

import java.util.Scanner;

public class UserInput {
    private Scanner input;

    public UserInput(Scanner input) {
        this.input = input;
    }

    public int getUserIntInput() {
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }
    public String getUserStringInput() {
        return input.nextLine();
    }
}
