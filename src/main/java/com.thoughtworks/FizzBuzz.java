package com.thoughtworks;

public class FizzBuzz {

  public String handleDigit(int digit) {
    if (digit % 3 == 0) {
      return "Fizz";
    }
    return String.valueOf(digit);
  }
}
