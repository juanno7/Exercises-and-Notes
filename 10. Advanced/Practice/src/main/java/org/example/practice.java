package org.example;

import jdk.dynalink.Operation;

import java.util.*;

public class practice {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
         List<String> paths = new ArrayList<>();
         paths.add("data/");
         paths.add("route/");
         paths.add("./");
         paths.add("../");
         paths.add("../");
         paths.add("resource/");
         paths.add("../");
         paths.add("../");
        paths.add("../");
        paths.add("../");



         List<Integer> ints = new ArrayList<>();
         ints.add(1);
         ints.add(4);
         ints.add(-2);
         ints.add(5);
         ints.add(-10);

        int results = pathing(paths);
        int integers = counting(ints);
        System.out.println(results);
        System.out.println(integers);

        List<Integer> numbers = Arrays.asList(1, 3, 7, 9, 2);
        int target = 16;
        String result = findTwoSum(numbers, target);
        System.out.println(result);

        myName();
    }

//    public static int pathing(List<String> operation){
//        int count = 0;
//
//        for(String path : operation){
//            if(path.equals("../")){
//                count--;
//                if(count < 0){
//                    count = 0;
//                    break;
//
//                }
//            } else if(!path.equals("./")){
//                count++;
//
//            }
//        }
//        return count;
//    }

    public static int pathing(List<String> operation){
        int count = 0;

        for(int i = 0; i < operation.size(); i++){
            String path = operation.get(i);
            if(path.equals("../")){
                count--;
            } else if(!path.equals("./")) {
                count++;

            } if(count < 0){
                break;
            }
        }
        return count;
    }

    public static int counting(List<Integer> num){
        int count = 0;
        for(int i = 0; i < num.size(); i++){
            int path = num.get(i);
            if(path > 0){
                count += path;
            } else if(path < 0){
                count += path;
            }
        }
        return count;
    }
    public static String findTwoSum(List<Integer> numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            int complement = target - numbers.get(i);
            if (numMap.containsKey(complement)) {
                return (complement + " + " + numbers.get(i) + " = " + target +
                        " numbers found in array " + Arrays.asList(complement, numbers.get(i)));
            } else {
                numMap.put(numbers.get(i), i);
            }
        }
        return "Could not find sum";
    }

    public static List<Integer> twoSum(List<Integer> numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            int complement = target - numbers.get(i);
            if (numMap.containsKey(complement)) {
                return Arrays.asList(complement, numbers.get(i));
            } else {
                numMap.put(numbers.get(i), i);
            }
        }
        return Arrays.asList();
    }

    public static void myName(){
        System.out.println("\nplease provide name \n");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        if(!name.isEmpty()){
        System.out.println("Thank you " + name.toUpperCase());
        } else{
            System.out.println("N/A");
        }
    }
}
