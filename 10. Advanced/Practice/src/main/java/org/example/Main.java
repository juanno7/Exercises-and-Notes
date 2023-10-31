package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //main.run();
        int[] arr = {4, 9, 2, 3, 1, 5, 9, 9};
        int[] num = {4, 5, 2, 7, 8, 9};
//        bubbleSort(arr);
//        System.out.println("sorted: ");
//        for(int element: arr){
//            System.out.println(element + " ");
//        }

        int jumps = jumps(12, 10);
        System.out.println("Number of jumps: " + jumps);

        int target = 9;
        List<Integer> indices = findAllIndices(arr, target);
        List<Integer> more = findAllIndices(num, target);
        if(!indices.isEmpty() && !more.isEmpty()){
            System.out.println("element found at index " + indices + " and " + more);
        }

        String input = "hello";
        String reverse = reverseString(input);
        System.out.println(input);
        System.out.println(reverse);

        String in = "A man, a plan, a canal, panama";
        boolean result = isPalindrome(in);

        if (result) {
            System.out.println("The string is a palindrome");
        } else{
            System.out.println("The string is not a palindrome");
        }

        String in1 = "listen";
        String in2 = "silent";
        boolean results = areAnagrams(in1, in2);

        if(results){
            System.out.println("The strings are anagrams");
        } else{
            System.out.println("the strings are not anagrams");
        }



    }
    public void run(){
        for (int i : Main.fibonacci(7)) {
            System.out.println(i);
        }

    }

//    public static void jumps(int flagHeight, int bigJump){
//        int height = 0;
//        int normalJump = 1;
//        int jumps = 0;
//        if(flagHeight <= 0 || bigJump <= 0){
//            System.out.println(height);
//        }
//        while(height < flagHeight){
//            if(height + bigJump <= flagHeight){
//                height += bigJump;
//            } else{
//                height += normalJump;
//            }
//            jumps++;
//        }
//        System.out.println(jumps);
//    }

    public static int[] fibonacci(int n){
        int[] fibSeries = new int[n];
        if(n > 1){
            fibSeries[1] = 1;
            for(int i = 2; i < n; i++){
                fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
            }
        }
        return fibSeries;
    }

    public static void bubbleSort(int[] arr){
            int n = arr.length;  // Get the length of the array
            boolean swapped;     // A flag to track whether any swaps were made in the inner loop

            for (int i = 0; i < n - 1; i++) {
                //The outer for loop (controlled by int i) iterates through the passes.
                // The loop continues until i is less than n - 1.
                // As previously explained, n - 1 is the number of passes needed to sort the array.
                swapped = false;  // Reset the 'swapped' flag for each pass

                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        //Inside the outer loop, there's an inner for loop (controlled by int j) that iterates through the elements of the array.
                        // The loop continues until j is less than n - i - 1.
                        // In each pass, one more element (the largest) is placed in its correct position, so you don't need to consider it in subsequent passes.
                        // Swap arr[j] and arr[j + 1] if they are in the wrong order
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;  // Set the 'swapped' flag to true
                    }
                }

                // If no two elements were swapped in the inner loop, the array is already sorted.
                if (!swapped) {
                    break;  // If 'swapped' is still false, the array is sorted, and we can exit early.
                }
            }

    }

    public static void sortArray(int[] num){
        Arrays.sort(num);
        for(int elements: num){
            System.out.print(elements + " ");

        }
        System.out.println(" ");
    }

//    public static int binarySearch(int[] num, int target){
//        int left = 0;
//        int right = num.length - 1;
//        sortArray(num);
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if(num[mid] == target){
//                return mid;
//            } else if(num[mid] < target){
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return -1;
//    }

    public static List<Integer> findAllIndices(int[] num, int target){
        List<Integer> indices = new ArrayList<>();
        int left = 0;
        int right = num.length - 1;
        sortArray(num);
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(num[mid] == target){
                indices.add(mid);
                left = mid + 1;
            } else if (num[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return indices;
    }

    public static int binarySearch(int [] num, int target){
        int left = 0;
        int right = num.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(num[mid] == target){
                return mid;
            } else if(num[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

//    public static String reverseString(String string){
//    char[] charArray = string.toCharArray();
//    int left = 0;
//    int right = string.length() - 1;
//    while (left < right){
//    char temp = charArray[left];
//    charArray[left] = charArray[right];
//    charArray[right] = temp;
//
//    left++;
//    right--;
//
//    }
//    return new String(charArray);
//    }

    public static boolean isPalindrome(String str){
        str = str.replace("\\W", "");

        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

   public static boolean areAnagrams(String str1, String str2){
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
   }


    public static void fizzBuzz(int n){
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }

    public static String reverseString(String string){
        char[] charArray = string.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);

    }

    public static int jumps(int flagHeight, int bigJump){
        int regularJump = 1;
        int height = 0;
        int jumps = 0;

        while (height < flagHeight) {
            if (bigJump > 0 && height + bigJump <= flagHeight) {
                height += bigJump;
            } else {
                height += regularJump;
            }
            jumps++;
        }

        return jumps;

    }


}