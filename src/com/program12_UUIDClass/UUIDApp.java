package com.program12_UUIDClass;

import java.util.UUID;

public class UUIDApp {
  public static void main(String[] args) {

    //. Randomly generate Universally Unique Identifier
    for (int x = 0; x < 100; x++) {
      UUID uuid = UUID.randomUUID();
      System.out.println( x + ": " + uuid);
    }

  }
}
