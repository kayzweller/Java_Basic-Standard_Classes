package com.program04_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerApp {
  public static void main(String[] args) {

    String name = "Aloona Holmes Kristaen";
    StringTokenizer tokenizer = new StringTokenizer(name, " ");

    //. 'lazy' processing [.nextToken() then split the string],
    // ~memory wiser than '.split()' that directly split to an array.
    while (tokenizer.hasMoreTokens()) {
      String value = tokenizer.nextToken();
      System.out.println(value);
    }

    // split directly to an array, imagine
    // if you have really big String data.
    String[] names = name.split(" ");
    for (var value : names) {
      System.out.println(value);
    }

  }
}
