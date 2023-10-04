package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();




        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            String line;
            int stringCount = 1;

            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    System.out.println(stringCount + ". " + line);
                    stringCount++;
                }

            }
            bufferedReader.close();
            fileReader.close();
        }

         catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
