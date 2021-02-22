package com.program02_StringBuilderStringBuffer;

public class StringBuilderBufferApp {
  public static void main(String[] args) {

    //. String builder : serial, run faster, not tread safe.
    StringBuilder builder = new StringBuilder();

    builder.append("Aloona");
    builder.append(" ");
    builder.append("Holmes");
    builder.append(" ");
    builder.append("Kristaen");

    String name = builder.toString();
    System.out.println(name);

    //. String buffer : parallel, run slower, tread safe.
    StringBuffer buffer = new StringBuffer();

    buffer.append("Albert");
    buffer.append(" ");
    buffer.append("Kristaen");
    buffer.append(" ");
    buffer.append("Ngisik");

    String name2 = buffer.toString();
    System.out.println(name2);

  }
}
