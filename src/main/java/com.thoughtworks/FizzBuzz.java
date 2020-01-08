package com.thoughtworks;

public class FizzBuzz {

  public String handleDigit(int digit) {
    if (digit % 15 == 0) {
      return "FizzBuzz";
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
