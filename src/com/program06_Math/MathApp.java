package com.program06_Math;

public class MathApp {
  public static void main(String[] args) {

    //. Method inside of Math class, is about
    // ~mathematics and numeric operation.
    //. You can call method inside of math directly,
    // ~because all method inside of Math is 'static'.

    var min = Math.min(1000, 2000);
    System.out.println(min);

    var max = Math.max(1000, 2000);
    System.out.println(max);

    var value = -231.34;
    System.out.println(Math.abs(value));

  }
}
