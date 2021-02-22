package com.program05_NumberClass;

//. NUMBER [00:22:46]

public class NumberApp {
  public static void main(String[] args) {

    Integer integerValue = 69;
    Long longValue = integerValue.longValue();
    Double doubleValue = integerValue.doubleValue();
    Short shortValue = doubleValue.shortValue();

    printValue(integerValue);
    printValue(longValue);
    printValue(doubleValue);
    printValue(shortValue);

    //. Parse string to Number
    String example  = "69420";
    String example2 = "69.420";
    // ~return value of .valueOf is an object.
    Integer intStr = Integer.valueOf(example);
    Double doubleStr = Double.valueOf(example2);
    // ~return value of .parseXxx is primitive.
    int intStr2 = Integer.parseInt(example);
    double doubleStr2 = Double.parseDouble(example2);
    // ~error: return Runtime Exception: 'NumberFormatException'

    System.out.println("int    : " + intStr2);
    System.out.println("double : " + doubleStr2);

  }

  static void printValue(Object o) {
    System.out.println(o.getClass());
    System.out.println(o.toString());
  }
}
