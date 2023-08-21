package main.output;

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
                File to read->\t
                """);
    }

    /**Output for the FTPHandler class*/
    public static void printFileToRead(String output) {
        System.out.println(output);
    }
}
