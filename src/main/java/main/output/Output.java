package main.output;

import org.apache.commons.net.ftp.FTPFile;

public class Output {


    /**Menu options shown to user*/
    public static void showMenu() {
        System.out.println("""
                1. Add file to your local FTP server
                2. Read file from your local FTP server
                3. Exit
                """);
    }
    public static void askUserWichFileToAdd() {
        System.out.println("""
                Type the exact name of the file you want to add
                Example: "myFile.txt"
                File to add->\t
                """);
    }
    public static void askUserWichFileToRead() {
        System.out.println("""
                Type the exact name of the file you want to read
                Example: "myFile.txt"
                """);
    }

    /**Output for the FTPHandler class*/
    public static void printFileToRead(String output) {
        System.out.println("File content: " + output + "\n");
    }
    public static void printFilesToRead(FTPFile[] files) {
        System.out.println("List of all files");
        for (int i = 0; i < files.length; i++) {
            System.out.println((i + 1) + ") " + files[i].getName());
        }
        System.out.println("_______________________________________");
    }
}
