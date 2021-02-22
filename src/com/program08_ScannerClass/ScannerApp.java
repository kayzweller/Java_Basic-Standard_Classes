package com.program08_ScannerClass;

import java.util.Scanner;

public class ScannerApp {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Name : ");
    String name = scanner.nextLine();

    System.out.print("Age : ");
    int age = scanner.nextInt();

    System.out.println("Hello " + name + " (" + age + " years old).");

  }
}
