package org.example;

public class practice2 {

    public static boolean aPalindrome(String str){
        String underCase = str.toLowerCase();
        underCase = underCase.replaceAll("\\W", "");
        int left = 0;
        int right = underCase.length() - 1;

        while(left < right){
            if(underCase.charAt(left) != underCase.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int binary(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = (right - left) / 2 + left;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int sumOfArray(int[] arr){
        int sum = 0;

        for(Integer i : arr){
            sum += i;
        }
        return sum;
    }

    public static int maxOfArray(int[] arr){
        int max = Integer.MIN_VALUE;

        for(Integer i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public static int factorial(int num){
        int n = 1;
        for(int i = 1; i <= num; i++){
            n *= i;
        }
        return n;
    }



}
