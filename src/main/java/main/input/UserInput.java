package main.input;

import java.util.Scanner;

public class UserInput {
    private Scanner input;

    public UserInput(Scanner input) {
        this.input = input;
    }

    public int getUserIntInput() {
        int userInput = 0;

        while (true) {
            try {
                userInput = Integer.parseInt(input.nextLine());
                break; // Exit the loop if parsing is successful
            } catch (NumberFormatException e) {
                // Handle invalid input here, e.g., print an error message
                System.out.print("Invalid input. Please enter an integer: ");
            }
        }

        return userInput;
    }
    public String getUserStringInput() {
        return input.nextLine();
    }
}
