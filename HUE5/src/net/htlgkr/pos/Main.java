package net.htlgkr.pos;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Assignments assignments = new Assignments();

        System.out.println("Sum of 5 and 10: " + assignments.sum(5, 10));
        System.out.println("Is 'hello' empty: " + assignments.isEmpty("hello"));
        System.out.println("Uppercase conversion: " + assignments.toUpperCase(Arrays.asList("hello", "world")));
        System.out.println("Lowercase conversion: " + assignments.toLowerCase(Arrays.asList("HELLO", "WORLD")));
        System.out.println("Filter out even numbers: " + assignments.filterOutEven(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println("Filter out odd numbers: " + assignments.filterOutOdd(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println("Sorted alphabetically: " + assignments.sortAlphabetically(Arrays.asList("banana", "apple", "cherry")));
        System.out.println("Average of [1.0, 2.0, 3.0]: " + assignments.getAverage(Arrays.asList(1.0, 2.0, 3.0)));
        System.out.println("Remove duplicates: " + assignments.removeDuplicates(Arrays.asList(1, 2, 2, 3, 4, 4)));
        System.out.println("Factorial of 5: " + assignments.getFactorial(5));
        System.out.println("Is 11 prime: " + assignments.checkIfPrime(11));
        System.out.println("Concatenate 'hello' and 'world': " + assignments.concatenate("hello", "world"));
        System.out.println("Max of [1, 2, 3]: " + assignments.getMax(Arrays.asList(1, 2, 3)));
        System.out.println("Min of [1, 2, 3]: " + assignments.getMin(Arrays.asList(1, 2, 3)));
        System.out.println("Sum of [1, 2, 3]: " + assignments.getSum(Arrays.asList(1, 2, 3)));
        System.out.println("Product of [1, 2, 3]: " + assignments.getProduct(Arrays.asList(1, 2, 3)));
        System.out.println("Word count in 'hello world': " + assignments.countWords("hello world"));
        System.out.println("Is 'madam' palindrome: " + assignments.checkIfPalindrome("madam"));
        System.out.println("Sum of squares: " + assignments.sumOfSquares(Arrays.asList(1, 2, 3)));
        System.out.println("Contains 'hello' in ['hello', 'world']: " + assignments.contains(Arrays.asList("hello", "world"), "hello"));
        System.out.println("Length of longest string: " + assignments.lengthOfLongestString(Arrays.asList("hello", "world", "hi")));
        System.out.println("Length of shortest string: " + assignments.lengthOfShortestString(Arrays.asList("hello", "world", "hi")));
        System.out.println("Is 16 a perfect square: " + assignments.isPerfectSquare(16));
        System.out.println("Second largest in [1, 2, 3]: " + assignments.findSecondLargest(new int[]{1, 2, 3}));
        System.out.println("Second smallest in [1, 2, 3]: " + assignments.findSecondSmallest(new int[]{1, 2, 3}));
        System.out.println("Sorted list by age: " + assignments.sortList(Arrays.asList(new Person(25, "Alice", "Smith"), new Person(30, "Bob", "Johnson"), new Person(20, "Charlie", "Brown"))));
        System.out.println("Sum of primes between 10 and 20: " + assignments.sumOfAllPrimesInRange(10, 20));
        System.out.println("Are all uppercase: " + assignments.checkIfAllUpperCase(Arrays.asList("HELLO", "WORLD")));
        System.out.println("Are all lowercase: " + assignments.checkIfAllLowerCase(Arrays.asList("hello", "world")));
        System.out.println("Is mixed case: " + assignments.checkIfMixedCase(Arrays.asList("Hello", "world")));
        System.out.println("Average length of strings: " + assignments.getAverageLength(Arrays.asList("hello", "world")));
        System.out.println("Largest prime factor of 28: " + assignments.getLargestPrimeFactor(28));
        System.out.println("Convert 10 to binary: " + assignments.convertDecimalToBinary(10));
    }
}