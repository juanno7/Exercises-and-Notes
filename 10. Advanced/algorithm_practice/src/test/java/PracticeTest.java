import org.junit.Test;
import org.example.practice;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PracticeTest {

    @Test
    public void testMaxSubArraySum() {
        int[] arr1 = {1, 2, 3, -2, 5};

        assertEquals(5, practice.maxSubArraySum(arr1));

        int[] arr2 = {-2, -3, 4, -1, -2, 1, 5, -3};
        assertEquals(5, practice.maxSubArraySum(arr2));

        int[] arr3 = {-1, -2, -3, -4};
        assertEquals(-1, practice.maxSubArraySum(arr3));
    }


    @Test
    public void testIsPalindrome() {
        assertTrue(practice.isPalindrome("racecar"));
        assertFalse(practice.isPalindrome("hello"));
        assertTrue(practice.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testBinarySearch() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(6, practice.binarySearch(arr1, 7));
        assertEquals(-1, practice.binarySearch(arr1, 8));

        int[] arr2 = {1, 3, 5, 7, 9};
        assertEquals(-1, practice.binarySearch(arr2, 6));

        int[] arr3 = {10, 6, 9, 3, 5, 1};
        Arrays.sort(arr3);
        assertEquals(0 , practice.binarySearch(arr3, 1));
    }

    @Test
    public void testCalculateFactorial() {
        assertEquals(120, practice.calculateFactorial(5));
        assertEquals(1, practice.calculateFactorial(0));
        assertEquals(3628800, practice.calculateFactorial(10));
        assertEquals(0, practice.calculateFactorial(-1));
    }


}
