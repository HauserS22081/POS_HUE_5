package net.htlgkr.pos;

import net.htlgkr.pos.functionalInterfaces.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Assignments {

    public int sum(int int1, int int2) {

        Calculate calculate = (i1, i2) -> i1 + i2;

        return calculate.calc(int1, int2);
    }

    public boolean isEmpty(String string) {

        CheckString checkString = s -> s.isEmpty();

        return checkString.check(string);
    }

    public List<String> toUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public List<String> toLowerCase(List<String> strings) {
        return strings.stream().map(String::toLowerCase).toList();
    }

    public List<Integer> filterOutEven(List<Integer> integers) {
        return integers.stream().filter(i -> i % 2 == 1).toList();
    }

    public List<Integer> filterOutOdd(List<Integer> integers) {
        return integers.stream().filter(i -> i % 2 == 0).toList();
    }

    public List<String> sortAlphabetically(List<String> strings) {
        return strings.stream().sorted((o1, o2) -> o1.compareTo(o2)).toList();
    }

    public double getAverage(List<Double> doubles) {
        return doubles.stream().mapToDouble(d -> d).average().orElse(-1.734533534);
    }

    public List<Integer> removeDuplicates(List<Integer> integers) {
        return integers.stream().distinct().toList();
    }

    public int getFactorial(int integer) {

        IntegerOperation integerOperation = i -> {
            int sum = 1;
            while (i > 0) {
                sum *= i;
                i--;
            }
            return sum;
        };

        return integerOperation.operate(integer);
    }

    public boolean checkIfPrime(int integer) {

        CheckInt checkInt = i -> {
            for (int j = i / 2; j > 1; j--) {
                if (i % j == 0) return false;
            }
            return true;
        };

        return checkInt.check(integer);
    }

    public String concatenate(String string1, String string2) {

        ConvertStrings convertStrings = (s1, s2) -> s1 + s2;

        return convertStrings.convert(string1, string2);
    }

    public int getMax(List<Integer> integers) {
        return integers.stream().max((i1, i2) -> i1.compareTo(i2)).orElse(-1);
    }

    public int getMin(List<Integer> integers) {
        return integers.stream().min(Integer::compareTo).orElse(-1);
    }

    public int getSum(List<Integer> integers) {
        return integers.stream().mapToInt(i -> i).sum();
    }

    public int getProduct(List<Integer> integers) {
        AtomicInteger sum = new AtomicInteger();
        integers.stream().forEach(i -> sum.updateAndGet(v -> v * i));
        return sum.get();
    }

    public int countWords(String text) {
        int counter = 0;
        return Arrays.stream(text.split(" "))
                .mapToInt(s -> 1).sum();
    }

    public boolean checkIfPalindrome(String text) {

        CheckString checkString = s -> {
            StringBuilder reversed = new StringBuilder(s);
            reversed.reverse();

            return s.contentEquals(reversed);
        };

        return checkString.check(text);
    }

    public int sumOfSquares(List<Integer> integers) {

        return integers.stream().mapToInt(i -> (int) Math.pow(i, 2)).sum();

    }

    public boolean contains(List<String> strings, String check) {

        return !strings.stream().filter(s -> s.contains(check)).toList().isEmpty();

    }

    public int lengthOfLongestString(List<String> strings) {

        return strings.stream().mapToInt(String::length).max().orElse(-1);

    }

    public int lengthOfShortestString(List<String> strings) {

        return strings.stream().mapToInt(String::length).min().orElse(-1);

    }

    public boolean isPerfectSquare(int number) {

        CheckInt checkPerfectSquare = n -> Math.pow((int) Math.sqrt(n), 2) == n;

        return checkPerfectSquare.check(number);

    }

    public int findSecondLargest(int[] arr) {

        ConvertIntArray converter = a -> {
            int max = Arrays.stream(a).max().orElse(-1);
            return Arrays.stream(a).filter(n -> n != max).max().orElse(-1);
        };

        return converter.convert(arr);

    }

    public int findSecondSmallest(int[] arr) {

        ConvertIntArray converter = a -> {
            int min = Arrays.stream(a).min().orElse(-1);
            return Arrays.stream(a).filter(n -> n != min).min().orElse(-1);
        };

        return converter.convert(arr);
    }

    public List<Object> sortList(List<Object> object,) {

    }

    public int sumOfAllPrimesInRange(int lowerBound, int upperBound) {

        ConvertInts converter = (n1, n2) -> {
            List<Integer> primes = new ArrayList<>();

            for (int i = n1; i <= n2; i++) {

                for (int j = i / 2; j > 1; j--) {
                    if (i % j == 0) break;

                    if (j == 2) primes.add(i);
                }
            }

            return primes.stream().mapToInt(n -> n).sum();
        };

        return converter.convert(lowerBound, upperBound);
    }

    public boolean checkIfAllUpperCase(List<String> strings) {

        return strings.equals(strings.stream().filter(s -> s.equals(s.toUpperCase())).toList());

    }

    public boolean checkIfAllLowerCase(List<String> strings) {

        return strings.equals(strings.stream().filter(s -> s.equals(s.toLowerCase())).toList());

    }

    public boolean checkIfMixedCase(List<String> strings) {

        return !(checkIfAllUpperCase(strings) || checkIfAllLowerCase(strings));

    }

    public int getAverageLength(List<String> strings) {

        return (int) strings.stream().mapToInt(String::length).average().orElse(-1);

    }

    public int getLargestPrimeFactor(int number) {

        ConvertInt converter = n -> {
            for (int i = n / 2; i > 1; i--) {
                if (n % i == 0) return i;
            }

            return 1;
        };

        return converter.convert(number);
    }

    public int convertDecimalToBinary(int number) {

        ConvertInt converter = n -> {

            int digit = n % 2;
            int rest = n / 2;

            String binary = String.valueOf(digit);

            while (rest != 0) {
                digit = rest % 2;
                rest = rest / 2;

                binary += String.valueOf(digit);
            }

            return Integer.parseInt(binary);

        };

        return converter.convert(number);

    }
}
