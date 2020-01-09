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

  @Test
  public void should_return_Whizz_given_input_divided_by_7() {
    int digit = 7;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, "Whizz");
  }

  @Test
  public void should_return_FizzBuzz_given_input_divided_by_3_and_5() {
    int digit = 60;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, "FizzBuzz");
  }

  @Test
  public void should_return_FizzWhizz_given_input_divided_by_3_and_7() {
    int digit = 21;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, "FizzWhizz");
  }

  @Test
  public void should_return_BuzzWhizz_given_input_divided_by_5_and_7() {
    int digit = 35;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, "BuzzWhizz");
  }

  @Test
  public void should_return_FizzBuzzWhizz_given_input_divided_by_3_and_5_and_7() {
    int digit = 210;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, "FizzBuzzWhizz");
  }

  @Test
  public void should_return_Fizz_given_input_contains_3() {
    int digit = 13;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, "Fizz");
  }

  @Test
  public void should_return_Fizz_given_input_contains_3_ignore_divided_rules() {
    int digit = 30;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, "Fizz");
  }

  @Test
  public void should_return_Buzz_given_input_contains_5_ignore_contains_3() {
    int digit = 35;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, "BuzzWhizz");
  }

  @Test
  public void should_return_Fizz_given_input_contains_7_ignore_contains_5() {
    int digit = 75;

    String actual = fizzBuzz.handleDigit(digit);

    assertEquals(actual, "Fizz");
  }

}
