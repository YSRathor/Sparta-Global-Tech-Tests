package com.spartaglobal.challenge3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzz {

    /**
     * The Problem
     *
     * Write a program that prints the numbers from 1 to 100.
     * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
     * For numbers which are multiples of both three and five print “FizzBuzz”.
     */


    /**
     * The two private variables have been set below for you to hold both the list and the fizzbuzz List.
     */

    private List range;
    private List fizzBuzzList = new ArrayList();

    /**
     * The below constructor has been created for you and when instantiating a class
     * it will expect the two below params as arguments.
     * @param startOfRange
     * @param endOfRange
     *
     * If you wish to create a main class to run / print the output be aware of the params
     * needed for instantiation.
     */

    public FizzBuzz(int startOfRange, int endOfRange){
        range = IntStream.rangeClosed(startOfRange, endOfRange).boxed().collect(Collectors.toList());
        fizzBuzzIterator(range);
    }

    // implement the below method of divisibleBy
    // you will need to provide two 'int' numbers and return a boolean value to state true if they are divisible and false if not

    /**
     * Implement the below divisibleBy method.
     *
     * you will need to provide two 'int' numbers and return a boolean value to
     * state true if they are divisible and false if not.
     *
     * Uncomment the below method to get started.
     */

    public boolean divisibleBy(int x, int y) {
		return x % y == 0;
	}

    /**
     * Implement the loop that will take the List Range and parse for the values to solve fizzbuzz
     * You will need to add a successfully value within the loop to the Private Class variable
     * 'private List range;'
     *
     * As an example while looping 3 will equal fizz which should be added to the fizzBuzzList
     *
     */

    public void fizzBuzzIterator(List range){
    	for (int i = 0; i < range.size() - 1; i++) {
			if (divisibleBy((int) range.get(i), 3) && divisibleBy((int) range.get(i), 5)) {
				fizzBuzzList.add("FizzBuzz");
			} else if (divisibleBy((int) range.get(i), 3)) {
				fizzBuzzList.add("Fizz");
			} else if (divisibleBy((int) range.get(i), 5)) {
				fizzBuzzList.add("Buzz");
			} else {
				fizzBuzzList.add(String.valueOf(range.get(i)));
			}
		}
    }

    /**
     * This method is the getter for the Fizzbuzz list which is being used in the test
     * There is no work needed here
     *
     */

    public List getFizzBuzzList() {
        return fizzBuzzList;
    }


}
