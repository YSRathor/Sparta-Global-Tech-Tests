package com.spartaglobal.challenge3Tests;

import com.spartaglobal.challenge3.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FizzbuzzTests {

    FizzBuzz fizzBuzz = new FizzBuzz(1,16);

    @Test
    public void divisibleByTest(){
        Assert.assertTrue(fizzBuzz.divisibleBy(2,1));
        Assert.assertFalse(fizzBuzz.divisibleBy(3,2));
    }

    @Test
    public void fizzBuzzIteratorTest(){
        List<String> minFizzBuzzList = List.of("1","2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        Assert.assertEquals(fizzBuzz.getFizzBuzzList(), minFizzBuzzList);
    }

}
