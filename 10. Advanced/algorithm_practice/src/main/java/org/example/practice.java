package org.example;

import java.util.*;

public class practice {

    public static int maxSubArraySum(int[] arr){
        int max = Integer.MIN_VALUE;

        for(Integer i : arr){
            if(i > max) {
                max = i;
            }
        }
        return max;
    }


    public static boolean isPalindrome(String str){
        String lowerCase = str.toLowerCase();
        lowerCase = lowerCase.replaceAll("\\W", "");
        int left = 0;
        int right = lowerCase.length() - 1;

        while(left < right){
            if(lowerCase.charAt(left) != lowerCase.charAt(right)){
                    return false;
            }
            left ++;
            right --;
        }
        return true;
    }


    public static int binarySearch(int[] num, int target){
        int left = 0;
        int half = 2;
        int right = num.length - 1;

        while(left <= right){
            int mid = (right - left) / half + left;
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

    public static int calculateFactorial(int n){
        int factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial *= i;
        } if(n == 0){
            return 1;
        } if(n < 0){
            return 0;
        }
        return factorial;
    }

    public static List<String> funWithAnagrams(List<String> text) {
        Map<String, String> wordMap = new HashMap<>();
        List<String> results = new ArrayList<>();

        for(String word : text){
            char[] charWords = word.toCharArray();
            Arrays.sort(charWords);
            String sorted = new String(charWords);
            if(!wordMap.containsKey(sorted)){
                wordMap.put(sorted, word);
                results.add(word);
            }
        }
        Collections.sort(results);

        return results;


    }

}
