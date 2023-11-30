package org.example.projectPractice;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");

    public static void logger(String file) {
        try(FileWriter writer = new FileWriter("ReceiptLog.txt", true)){
            Date now = new Date();
            String formattedDate = dateFormat.format(now);
            writer.write(file + "Sold on: " + formattedDate + "\n");
        } catch (IOException e){
            System.out.println("Error writing to ReceiptLog.txt" + e.getMessage());
        }
    }

    public static void certificateLogger(String file) {
        try(FileWriter writer = new FileWriter("CertificateLog.txt", true)){
            Date now = new Date();
            String formattedDate = dateFormat.format(now);
            writer.write(file + "Certificate made on: " + formattedDate + "\n");
        } catch (IOException e){
            System.out.println("Error writing to CertificateLog.txt" + e.getMessage());
        }
    }

}
