package com.program01_StringClass;

public class StringApp {
  public static void main(String[] args) {

    String name = "Albert Kristaen Ngisik";
    String nameLowercase = name.toLowerCase();
    String nameUppercase = name.toUpperCase();

    System.out.println(name);
    System.out.println(nameLowercase);
    System.out.println(nameUppercase);

    System.out.println(name.length());
    System.out.println(name.startsWith("Albert"));
    System.out.println(name.endsWith("Ngisik"));

    String[] names = name.split(" ");
    for (var value : names) {
      System.out.println(value);
    }

    System.out.println("    ".isBlank());
    System.out.println("".isEmpty());

    // whitespace excluded
    System.out.println(name.charAt(7));

   char[] chars = name.toCharArray();
    for (var ch : chars) {
      System.out.println(ch);
    }

  }
}
