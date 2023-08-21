package main;

import main.ftp.FTPHandler;
import main.input.UserInput;
import main.output.Output;
import org.apache.commons.net.ftp.FTPClient;

import java.util.Scanner;

public class Application {

    private FTPHandler ftpHandler;
    private UserInput input;

    public Application() {
        ftpHandler = new FTPHandler(new FTPClient());
        input = new UserInput(new Scanner(System.in));
    }

    public void run() {
        boolean isDone = false;

        while (!isDone) {
            Output.showMenu();
            switch (input.getUserIntInput()) {
                case 1 -> userAddingFile();
                case 2 -> userReadingFile();
                case 3 -> isDone = true;
            }
        }
    }

    private void userAddingFile() {
        boolean isDone = false;
        while (!isDone) {
            Output.askUserWichFileToAdd();
            ftpHandler.addFileToFTPServer(input.getUserStringInput());
            isDone = true;
        }
    }
    private void userReadingFile() {
        boolean isDone = false;
        while (!isDone) {
            ftpHandler.readFilesFromFTPServer();
            Output.askUserWichFileToRead();
            ftpHandler.readFileFromFTPServer(input.getUserStringInput());
            isDone = true;
        }
    }
}
