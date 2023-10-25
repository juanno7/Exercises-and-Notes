package org.example;

public class Main {

    private static Writer writer;

    public static void main(String[] args) {
        Main main = new Main();
        writer = new Writer();
        main.run();
    }

    public void run(){
        writer.testWriter("test.txt");
        writer.writeSentence();
    }
}