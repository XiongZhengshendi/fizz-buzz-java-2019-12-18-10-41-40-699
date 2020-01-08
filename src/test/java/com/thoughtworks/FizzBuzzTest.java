package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

  @Test
  public void should_return_origin_digit_given_not_match_rule() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int digit =1;

    int actual=fizzBuzz.handleDigit(digit);

    assertEquals(actual,digit);
  }
}
