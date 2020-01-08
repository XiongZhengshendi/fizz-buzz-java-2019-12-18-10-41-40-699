package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

  FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void should_return_origin_digit_given_not_match_rule() {
    int digit = 1;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, String.valueOf(digit));
  }

  @Test
  public void should_return_Fizz_given_input_divided_by_3() {
    int digit = 3;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, "Fizz");
  }

  @Test
  public void should_return_Buzz_given_input_divided_by_5() {
    int digit = 5;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, "Buzz");
  }
}
