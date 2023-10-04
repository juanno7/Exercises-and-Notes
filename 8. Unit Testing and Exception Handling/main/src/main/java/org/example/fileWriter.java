package org.example;

import java.io.*;
import java.util.Scanner;

public class fileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the word you want to replace: ");
            String wordToReplace = scanner.nextLine();
            System.out.println("What is the replacement word");
            String replacementWord = scanner.nextLine();
            System.out.println("What is the source file?");
            String filePath = scanner.nextLine();
            System.out.println("What is the destination file?");
            String destinationFile = scanner.nextLine();

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));

            String line;
            while((line = reader.readLine()) != null){
                line = line.replaceAll(wordToReplace, replacementWord);
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
            System.out.println("'" + wordToReplace.toUpperCase() + "'" + " from " + filePath + " is changed to " + "'" +replacementWord.toUpperCase() + "'" + " and placed in " + destinationFile );
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
