package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Writer {

    private String one;
    private String two;
    private String three;
    private String four;

    public List<Writer> strings;

    public Writer(){
        strings = new ArrayList<>();
    }

    public Writer(String one, String two, String three, String four) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public void writer(String filepath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                String[] words = line.split("\\.");

                for (String i: words) {
                    System.out.println(i + ".");
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void testWriter(String filepath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                String[] words = line.split("\\|");
                if(words.length == 4){
                    String one = words[0];
                    String two = words[1];
                    String three = words[2];
                    String four = words[3];
                    Writer writer = new Writer(one, two, three, four);
                    strings.add(writer);
                }

            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void writeSentence(){
        for(Writer i: strings){
            System.out.println(i.getOne() + ". " + i.getTwo() + ". " + i.getThree() + ". " + i.getFour() + ".");
        }
    }
}
