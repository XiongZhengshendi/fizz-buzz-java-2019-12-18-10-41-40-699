package com.thoughtworks;

/**
 * @author zheng.xiong
 */
public class FizzBuzz {

  public String handleDigit(int digit) {
    String result = handleRules(digit);
    if ("".equals(result)) {
      result = String.valueOf(digit);
    }
    return result;
  }

  private String handleRules(int digit) {
    String result = "";
    if (digit % 3 == 0) {
      result += "Fizz";
    }
    if (digit % 5 == 0) {
      result += "Buzz";
    }
    if (digit % 7 == 0) {
      result += "Whizz";
    }
    return result;
  }
}
