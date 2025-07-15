package org.example;

import java.util.Arrays;


/**
 * Array Question: Find the missing number in an array from 1 to N
 * Example: [1, 2, 4, 5, 6] → Output: 3
 */
public class TestAPIApplication {
    public static void main(String[] args) {
        int[] input = {1, 2, 4, 5, 6};

        int n = input.length + 1; // Total numbers should be 6 (1 to 6)
        int expectedSum = n * (n + 1) / 2; // Sum from 1 to n

        int actualSum = Arrays.stream(input).sum();

        int missing = expectedSum - actualSum;

        System.out.println("Missing number is: " + missing);
    }
}