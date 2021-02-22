package com.program18_RegularExpression;

import java.util.regex.*;

public class RegExApp {
  public static void main(String[] args) {

    String name = "Aloona Kristaen Albert Kristaen Cindy Anastasiani";

    Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

    Matcher matcher = pattern.matcher(name);

    // while pattern matched, print
    while (matcher.find()) {
      System.out.println(matcher.group());
    }

  }
}
