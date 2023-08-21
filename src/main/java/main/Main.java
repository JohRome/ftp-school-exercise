package main;

import main.ftp.FTPHandler;
import org.apache.commons.net.ftp.FTPClient;
public class Main {
    public static void main(String[] args)  {

        var ftpHandler = new FTPHandler(new FTPClient());

        ftpHandler.addFileToFTPServer("mittNamn.txt");
        ftpHandler.readFileFromFTPServer("mittNamn.txt");

    }
}
