package net.htlgkr.pos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssignmentsTest {

    private static Assignments test;

    static {
        test = new Assignments();
    }

    @Test
    @DisplayName("sum with 4, 5")
    void sum1() {
        Assertions.assertEquals(9, test.sum(4, 5));
    }

    @Test
    @DisplayName("sum with -123, 5")
    void sum2() {
        Assertions.assertEquals(-118, test.sum(-123, 5));
    }

    @Test
    @DisplayName("sum with -24, -235")
    void sum3() {
        Assertions.assertEquals(-259, test.sum(-24, -235));
    }



    @Test
    @DisplayName("isEmpty with ''")
    void isEmpty1() {
        assertTrue(test.isEmpty(""));
    }

    @Test
    @DisplayName("isEmpty with null")
    void isEmpty2() {
        assertTrue(test.isEmpty(null));
    }

    @Test
    @DisplayName("isEmpty with ab")
    void isEmpty3() {
        assertFalse(test.isEmpty("ab"));
    }



    @Test
    @DisplayName("toUpperCase with ABC, DEF")
    void toUpperCase1() {
        Assertions.assertEquals(List.of("ABC", "DEF"), test.toUpperCase(List.of("ABC", "DEF")));
    }

    @Test
    @DisplayName("toUpperCase with abc, def")
    void toUpperCase2() {
        Assertions.assertEquals(List.of("ABC", "DEF"), test.toUpperCase(List.of("abc", "def")));
    }

    @Test
    @DisplayName("toUpperCase with ABc, deF")
    void toUpperCase3() {
        Assertions.assertEquals(List.of("ABC", "DEF"), test.toUpperCase(List.of("ABc", "deF")));
    }



    @Test
    @DisplayName("toLowerCase with ABC, DEF")
    void toLowerCase1() {
        Assertions.assertEquals(List.of("abc", "def"), test.toLowerCase(List.of("ABC", "DEF")));
    }

    @Test
    @DisplayName("toLowerCase with abc, def")
    void toLowerCase2() {
        Assertions.assertEquals(List.of("abc", "def"), test.toLowerCase(List.of("abc", "def")));
    }

    @Test
    @DisplayName("toLowerCase with ABc, deF")
    void toLowerCase3() {
        Assertions.assertEquals(List.of("abc", "def"), test.toLowerCase(List.of("ABc", "deF")));
    }



    @Test
    @DisplayName("filterOutEven with 4, 5, 6,7")
    void filterOutEven1() {
        Assertions.assertEquals(List.of(5,7), test.filterOutEven(List.of(4, 5, 6, 7)));
    }

    @Test
    @DisplayName("filterOutEven with -4, -5, -6, -7")
    void filterOutEven2() {
        Assertions.assertEquals(List.of(-5,-7), test.filterOutEven(List.of(-4, -5, -6, -7)));
    }

    @Test
    @DisplayName("filterOutEven with -1, 0, 1")
    void filterOutEven3() {
        Assertions.assertEquals(List.of(-1, 1), test.filterOutEven(List.of(-1, 0, 1)));
    }



    @Test
    @DisplayName("filterOutOdd with 4, 5, 6,7")
    void filterOutOdd1() {
        Assertions.assertEquals(List.of(4,6), test.filterOutOdd(List.of(4, 5, 6, 7)));
    }

    @Test
    @DisplayName("filterOutOdd with -4, -5, -6, -7")
    void filterOutOdd2() {
        Assertions.assertEquals(List.of(-4,-6), test.filterOutOdd(List.of(-4, -5, -6, -7)));
    }

    @Test
    @DisplayName("filterOutOdd with -1, 0, 1")
    void filterOutOdd3() {
        Assertions.assertEquals(List.of(0), test.filterOutOdd(List.of(-1, 0, 1)));
    }



    @Test
    @DisplayName("sortAlphabetically with abc, bcd, def")
    void sortAlphabetically1() {
        Assertions.assertEquals(List.of("abc", "bcd", "def"), test.sortAlphabetically(List.of("abc", "bcd", "def")));
    }

    @Test
    @DisplayName("sortAlphabetically with def, aaa, ABc, Xaaa, xaaa")
    void sortAlphabetically2() {
        Assertions.assertEquals(List.of("ABc", "Xaaa", "aaa", "def", "xaaa"), test.sortAlphabetically(List.of("def", "aaa", "ABc", "Xaaa", "xaaa")));
    }

    @Test
    @DisplayName("sortAlphabetically with xxxxa, xxxa, xxa")
    void sortAlphabetically3() {
        Assertions.assertEquals(List.of("xxa", "xxxa", "xxxxa"), test.sortAlphabetically(List.of("xxxxa", "xxxa", "xxa")));
    }



    @Test
    @DisplayName("getAverage with 4.0, 5.0")
    void getAverage1() {
        Assertions.assertEquals(4.5, test.getAverage(List.of(4.0, 5.0)));
    }

    @Test
    @DisplayName("getAverage with 4.5, 5.234")
    void getAverage2() {
        Assertions.assertEquals(4.867, test.getAverage(List.of( 4.5, 5.234)));
    }

    @Test
    @DisplayName("getAverage with -324.23, -12.89")
    void getAverage3() {
        Assertions.assertEquals(-168.56, test.getAverage(List.of(-324.23, -12.89)));
    }




    @Test
    @DisplayName("removeDublicates with 4, 5")
    void removeDuplicates1() {
        Assertions.assertEquals(List.of(4,5), test.removeDuplicates(List.of(4,5)));
    }

    @Test
    @DisplayName("removeDublicates with 4, 4, 5")
    void removeDuplicates2() {
        Assertions.assertEquals(List.of(4,5), test.removeDuplicates(List.of(4,4,5)));
    }

    @Test
    @DisplayName("removeDublicates with 0,0,0,0,0")
    void removeDuplicates3() {
        Assertions.assertEquals(List.of(0), test.removeDuplicates(List.of(0,0,0,0,0)));
    }




    @Test
    @DisplayName("getFactorial with 4")
    void getFactorial1() {
        Assertions.assertEquals(24, test.getFactorial(4));
    }

    @Test
    @DisplayName("getFactorial with 2")
    void getFactorial2() {
        Assertions.assertEquals(2, test.getFactorial(2));
    }

    @Test
    @DisplayName("getFactorial with 0")
    void getFactorial3() {
        Assertions.assertEquals(1, test.getFactorial(0));
    }



    @Test
    @DisplayName("checkIfPrime with 4")
    void checkIfPrime1() {
        Assertions.assertFalse(test.checkIfPrime(4));
    }

    @Test
    @DisplayName("checkIfPrime with 17")
    void checkIfPrime2() {
        Assertions.assertTrue(test.checkIfPrime(17));
    }

    @Test
    @DisplayName("checkIfPrime with 1")
    void checkIfPrime3() {
        Assertions.assertFalse(test.checkIfPrime(1));
    }



    @Test
    @DisplayName("concatenate with 'ab' 'cd'")
    void concatenate1() {
        Assertions.assertEquals("abcd", test.concatenate("ab", "cd"));
    }

    @Test
    @DisplayName("concatenate with 'ab' ''")
    void concatenate2() {
        Assertions.assertEquals("ab", test.concatenate("ab", ""));
    }

    @Test
    @DisplayName("concatenate with 'abcd' 'cd'")
    void concatenate3() {
        Assertions.assertEquals("abcdcd", test.concatenate("abcd", "cd"));
    }



    @Test
    @DisplayName("getMax with 4, 5")
    void getMax1() {
        Assertions.assertEquals(5, test.getMax(List.of(4,5)));
    }

    @Test
    @DisplayName("getMax with 5, 5")
    void getMax2() {
        Assertions.assertEquals(5, test.getMax(List.of(5,5)));
    }

    @Test
    @DisplayName("getMax with -23, -4, -234234")
    void getMax3() {
        Assertions.assertEquals(-4, test.getMax(List.of(-23, -4, -234234)));
    }



    @DisplayName("getMin with 4, 5")
    void getMin1() {
        Assertions.assertEquals(4, test.getMin(List.of(4,5)));
    }

    @Test
    @DisplayName("getMin with 5, 5")
    void getMin2() {
        Assertions.assertEquals(5, test.getMin(List.of(5,5)));
    }

    @Test
    @DisplayName("getMin with -23, -4, -234234")
    void getMin3() {
        Assertions.assertEquals(-234234, test.getMin(List.of(-23, -4, -234234)));
    }



    @Test
    @DisplayName("getSum with 4, 5, 6")
    void getSum1() {
        Assertions.assertEquals(15, test.getSum(List.of(4,5,6)));
    }

    @Test
    @DisplayName("getSum with -4, -5, 6")
    void getSum2() {
        Assertions.assertEquals(-3, test.getSum(List.of(-4, -5, 6)));
    }

    @Test
    @DisplayName("getSum with 4, 5, 6, 0")
    void getSum3() {
        Assertions.assertEquals(15, test.getSum(List.of(4,5,6,0)));
    }




    @Test
    @DisplayName("getProduct with 4, 5, 6")
    void getProduct1() {
        Assertions.assertEquals(120, test.getProduct(List.of(4,5,6)));
    }

    @Test
    @DisplayName("getProduct with -4, -5, 6")
    void getProduct2() {
        Assertions.assertEquals(120, test.getProduct(List.of(-4, -5, 6)));
    }

    @Test
    @DisplayName("getProduct with 4, 5, 6, 0")
    void getProduct3() {
        Assertions.assertEquals(0, test.getProduct(List.of(4,5,6,0)));
    }



    @Test
    @DisplayName("countWord with 'abc awfwe wer'")
    void countWords1() {
        Assertions.assertEquals(3, test.countWords("abc awfwe wer"));
    }

    @Test
    @DisplayName("countWord with 'abc awfwe wer '")
    void countWords2() {
        Assertions.assertEquals(3, test.countWords("abc awfwe wer "));
    }

    @Test
    @DisplayName("countWord with 'abc awfwe   wer'")
    void countWords3() {
        Assertions.assertEquals(3, test.countWords("abc awfwe   wer"));
    }



    @Test
    @DisplayName("checkIfPalindrome with 'abc'")
    void checkIfPalindrome1() {
        Assertions.assertFalse(test.checkIfPalindrome("abc"));
    }

    @Test
    @DisplayName("checkIfPalindrome with 'aba'")
    void checkIfPalindrome2() {
        Assertions.assertTrue(test.checkIfPalindrome("aba"));
    }

    @Test
    @DisplayName("checkIfPalindrome with 'abA'")
    void checkIfPalindrome3() {
        Assertions.assertFalse(test.checkIfPalindrome("abA"));
    }



    @Test
    @DisplayName("sumOfSquares with 4, 5")
    void sumOfSquares1() {
        Assertions.assertEquals(41, test.sumOfSquares(List.of(4,5)));
    }

    @Test
    @DisplayName("sumOfSquares with -4, 5")
    void sumOfSquares2() {
        Assertions.assertEquals(41, test.sumOfSquares(List.of(-4,5)));
    }

    @Test
    @DisplayName("sumOfSquares with 0, 5")
    void sumOfSquares3() {
        Assertions.assertEquals(25, test.sumOfSquares(List.of(0,5)));
    }



    @Test
    @DisplayName("contains with {'abc', 'def', 'ced'}, 'abc'")
    void contains1() {
        Assertions.assertTrue(test.contains(List.of("abc", "def", "ced"), "abc"));
    }

    @Test
    @DisplayName("contains with {'abc', 'def', 'ced'}, 'ab'")
    void contains2() {
        Assertions.assertTrue(test.contains(List.of("abc", "def", "ced"), "ab"));
    }

    @Test
    @DisplayName("contains with {'abc', 'def', 'ced'}, 'abcd'")
    void contains3() {
        Assertions.assertFalse(test.contains(List.of("abc", "def", "ced"), "abcd"));
    }




    @Test
    @DisplayName("lengthOfLongestString with 'abc', 'defg', 'a'")
    void lengthOfLongestString1() {
        Assertions.assertEquals(4, test.lengthOfLongestString(List.of("abc", "defg", "a")));
    }

    @Test
    @DisplayName("lengthOfLongestString with 'abc', 'defg', 'aasfjklö'")
    void lengthOfLongestString2() {
        Assertions.assertEquals(8, test.lengthOfLongestString(List.of("abc", "defg", "aasfjklö")));
    }

    @Test
    @DisplayName("lengthOfLongestString with 'abc', 'defg', 'a       a'")
    void lengthOfLongestString3() {
        Assertions.assertEquals(9, test.lengthOfLongestString(List.of("abc", "defg", "a       a")));
    }




    @Test
    @DisplayName("lengthOfShortestString with 'abc', 'defg', 'aaa'")
    void lengthOfShortestString1() {
        Assertions.assertEquals(3, test.lengthOfShortestString(List.of("abc", "defg", "aaa")));
    }

    @Test
    @DisplayName("lengthOfShortestString with 'abc', 'd', 'aasfjklö'")
    void lengthOfShortestString2() {
        Assertions.assertEquals(1, test.lengthOfShortestString(List.of("abc", "d", "aasfjklö")));
    }

    @Test
    @DisplayName("lengthOfShortestString with 'abc, '', 'defg', 'a       a'")
    void lengthOfShortestString3() {
        Assertions.assertEquals(0, test.lengthOfShortestString(List.of("abc", "", "defg", "a       a")));
    }



    @Test
    @DisplayName("isPerfectSquare with 4")
    void isPerfectSquare1() {
        Assertions.assertTrue(test.isPerfectSquare(4));
    }

    @Test
    @DisplayName("isPerfectSquare with 5")
    void isPerfectSquare2() {
        Assertions.assertFalse(test.isPerfectSquare(5));
    }

    @Test
    @DisplayName("isPerfectSquare with 0")
    void isPerfectSquare3() {
        Assertions.assertTrue(test.isPerfectSquare(0));
    }




    @Test
    @DisplayName("findSecondLargest with 4, 5, 2,1")
    void findSecondLargest1() {
        Assertions.assertEquals(4, test.findSecondLargest(new int[]{4, 5, 2, 1}));
    }

    @Test
    @DisplayName("findSecondLargest with 4, 5, 2, 5, 4, 1")
    void findSecondLargest2() {
        Assertions.assertEquals(4, test.findSecondLargest(new int[]{4, 5, 2, 5, 4, 1}));
    }

    @Test
    @DisplayName("findSecondLargest with -4, 5, 2,1")
    void findSecondLargest3() {
        Assertions.assertEquals(2, test.findSecondLargest(new int[]{-4, 5, 2, 1}));
    }




    @Test
    @DisplayName("findSecondSmallest with 4, 5, 2,1")
    void findSecondSmallest1() {
        Assertions.assertEquals(2, test.findSecondSmallest(new int[]{4, 5, 2, 1}));
    }

    @Test
    @DisplayName("findSecondSmallest with 4, 5, 2, 5, 2, 4, 1,1")
    void findSecondSmallest2() {
        Assertions.assertEquals(2, test.findSecondSmallest(new int[]{4, 5, 2, 5, 2, 4, 1,1}));
    }

    @Test
    @DisplayName("findSecondSmallest with -4, 5, 2,1")
    void findSecondSmallest3() {
        Assertions.assertEquals(1, test.findSecondSmallest(new int[]{-4, 5, 2, 1}));
    }



    @Test
    @DisplayName("sortList with Persons of age 0, 5, 18")
    void sortList1() {
        Person p1 = new Person(0, "a", "b");
        Person p2 = new Person(5, "c", "d");
        Person p3 = new Person(18, "e", "f");

        Assertions.assertEquals(List.of(p1, p2, p3), test.sortList(List.of(p2, p1, p3)));
    }

    @Test
    @DisplayName("sortList with Persons of age 0, 500, 18")
    void sortList2() {
        Person p1 = new Person(0, "a", "b");
        Person p2 = new Person(500, "c", "d");
        Person p3 = new Person(18, "e", "f");

        Assertions.assertEquals(List.of(p1, p3, p2), test.sortList(List.of(p2, p1, p3)));
    }

    @Test
    @DisplayName("sortList with Persons of age 1, 1, 5")
    void sortList3() {
        Person p1 = new Person(1, "a", "b");
        Person p2 = new Person(1, "c", "d");
        Person p3 = new Person(5, "e", "f");

        Assertions.assertEquals(List.of(p1, p2, p3), test.sortList(List.of(p3, p1, p2)));
    }



    @Test
    @DisplayName("sumOfAllPrimesInRange with 4, 5")
    void sumOfAllPrimesInRange1() {
        Assertions.assertEquals(5, test.sumOfAllPrimesInRange(4,5));
    }

    @Test
    @DisplayName("sumOfAllPrimesInRange with 4, 20")
    void sumOfAllPrimesInRange2() {
        Assertions.assertEquals(72, test.sumOfAllPrimesInRange(4,20));
    }

    @Test
    @DisplayName("sumOfAllPrimesInRange with 0, 5")
    void sumOfAllPrimesInRange3() {
        Assertions.assertEquals(10, test.sumOfAllPrimesInRange(0,5));
    }



    @Test
    @DisplayName("checkIfAllUpperCase with 'abc', 'ABC', 'DEf'")
    void checkIfAllUpperCase1() {
        Assertions.assertFalse(test.checkIfAllUpperCase(List.of("abc", "ABC", "DEf")));
    }

    @Test
    @DisplayName("checkIfAllUpperCase with 'ABC', 'ABC', 'DEF'")
    void checkIfAllUpperCase2() {
        Assertions.assertTrue(test.checkIfAllUpperCase(List.of("ABC", "ABC", "DEF")));
    }

    @Test
    @DisplayName("checkIfAllUpperCase with '', 'ABC', 'DEF'")
    void checkIfAllUpperCase3() {
        Assertions.assertTrue(test.checkIfAllUpperCase(List.of("", "ABC", "DEF")));
    }




    @Test
    @DisplayName("checkIfAllLowerCase with 'abc', 'ABC', 'DEf'")
    void checkIfAllLowerCase1() {
        Assertions.assertFalse(test.checkIfAllLowerCase(List.of("abc", "ABC", "DEf")));
    }

    @Test
    @DisplayName("checkIfAllLowerCase with 'abc', 'abc', 'def'")
    void checkIfAllLowerCase2() {
        Assertions.assertTrue(test.checkIfAllLowerCase(List.of("abc", "abc", "def")));
    }

    @Test
    @DisplayName("checkIfAllLowerCase with '', 'abc', 'def'")
    void checkIfAllLowerCase3() {
        Assertions.assertTrue(test.checkIfAllLowerCase(List.of("", "abc", "def")));
    }




    @Test
    @DisplayName("checkIfMixedCase with 'abc', 'ABC', 'DEf'")
    void checkIfMixedCase1() {
        Assertions.assertTrue(test.checkIfMixedCase(List.of("abc", "ABC", "DEf")));
    }

    @Test
    @DisplayName("checkIfMixedCase with 'abc', 'abc', 'def'")
    void checkIfMixedCase2() {
        Assertions.assertFalse(test.checkIfMixedCase(List.of("abc", "abc", "def")));
    }

    @Test
    @DisplayName("checkIfMixedCase with 'ABC', 'ABC', 'DEF")
    void checkIfMixedCase3() {
        Assertions.assertFalse(test.checkIfMixedCase(List.of("ABC", "ABC", "DEF")));
    }



    @Test
    @DisplayName("getAverageLength with 'abc', 'def'")
    void getAverageLength1() {
        Assertions.assertEquals(3, test.getAverageLength(List.of("abc", "def")));
    }

    @Test
    @DisplayName("getAverageLength with 'abc', ''")
    void getAverageLength2() {
        Assertions.assertEquals(1.5, test.getAverageLength(List.of("abc", "")));
    }

    @Test
    @DisplayName("getAverageLength with 'abc', 'defg'")
    void getAverageLength3() {
        Assertions.assertEquals(3.5, test.getAverageLength(List.of("abc", "defg")));
    }



    @Test
    @DisplayName("getLargestPrimeFactor with 15")
    void getLargestPrimeFactor1() {
        Assertions.assertEquals(5, test.getLargestPrimeFactor(15));
    }

    @Test
    @DisplayName("getLargestPrimeFactor with 18")
    void getLargestPrimeFactor2() {
        Assertions.assertEquals(3, test.getLargestPrimeFactor(18));
    }

    @Test
    @DisplayName("getLargestPrimeFactor with 0")
    void getLargestPrimeFactor3() {
        Assertions.assertEquals(0, test.getLargestPrimeFactor(0));
    }



    @Test
    @DisplayName("convertDecimalToBinary with 5")
    void convertDecimalToBinary1() {
        Assertions.assertEquals(101, test.convertDecimalToBinary(5));
    }

    @Test
    @DisplayName("convertDecimalToBinary with 127")
    void convertDecimalToBinary2() {
        Assertions.assertEquals(1111111, test.convertDecimalToBinary(127));
    }

    @Test
    @DisplayName("convertDecimalToBinary with 128")
    void convertDecimalToBinary3() {
        Assertions.assertEquals(10000000, test.convertDecimalToBinary(128));
    }
}