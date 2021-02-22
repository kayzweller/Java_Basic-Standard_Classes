package com.program03_StringJoiner;

import java.util.StringJoiner;

public class StringJoinerApp {
  public static void main(String[] args) {

    StringJoiner joiner = new StringJoiner(", ", "[", "]");
    joiner.add("Aloona");
    joiner.add("Holmes");
    joiner.add("Kristaen");

    String value = joiner.toString();
    System.out.println(value);
  }
}
