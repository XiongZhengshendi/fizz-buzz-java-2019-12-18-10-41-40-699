package com.thoughtworks;

public class FizzBuzz {

  public String handleDigit(int digit) {
    if (digit % 3 == 0) {
      return "Fizz";
    }
    if (digit % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(digit);
  }
}
