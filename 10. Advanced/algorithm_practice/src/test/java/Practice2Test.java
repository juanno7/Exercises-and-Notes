import org.junit.Test;

import org.example.practice2;

import static org.junit.Assert.*;

public class Practice2Test {

    @Test
    public void APalindromeTest(){
       assertFalse(practice2.aPalindrome("Hello"));
       assertTrue(practice2.aPalindrome("anna"));
       assertTrue(practice2.aPalindrome("Race Car"));
    }

    @Test
    public void BinaryTest(){
        int[] arr1 = {2, 4, 5, 7, 8, 9};
        assertEquals(2, practice2.binary(arr1, 5));
    }

    @Test
    public void SumOfArrayTest(){
        int[] arr1 = {1, 2, 3, 4 , 5};
        assertEquals(15, practice2.sumOfArray(arr1));
        int[] arr2 = {-1, -2, 3, 1};
        assertEquals(1, practice2.sumOfArray(arr2));
    }

    @Test
    public void maxOfArrayTest(){
        int[] arr1 = {4, 7, 10, 20, 11, 31};
        assertEquals(31, practice2.maxOfArray(arr1));
        int[] arr2 = {-1, -20, -4, -5};
        assertEquals(-1, practice2.maxOfArray(arr2));
    }

    @Test
    public void FactorialTest(){
        int n = 5;
        assertEquals(120, practice2.factorial(n));
    }


}
