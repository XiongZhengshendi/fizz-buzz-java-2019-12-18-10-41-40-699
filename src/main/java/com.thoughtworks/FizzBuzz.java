package com.thoughtworks;

public class FizzBuzz {

  public String handleDigit(int digit) {
    if (digit % 105 == 0) {
      return "FizzBuzzWhizz";
    }
    if (digit % 15 == 0) {
      return "FizzBuzz";
    }
    if (digit % 21 == 0) {
      return "FizzWhizz";
    }
    if (digit % 35 == 0) {
      return "BuzzWhizz";
    }
    if (digit % 3 == 0) {
      return "Fizz";
    }
    if (digit % 5 == 0) {
      return "Buzz";
    }
    if (digit % 7 == 0) {
      return "Whizz";
    }
    return String.valueOf(digit);
  }
}
