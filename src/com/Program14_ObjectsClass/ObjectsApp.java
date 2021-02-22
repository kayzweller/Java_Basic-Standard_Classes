package com.Program14_ObjectsClass;

import java.util.Objects;

public class ObjectsApp {

  //. inner class
  public static class Data {

    private String data;

    public Data(String data) {
      this.data = data;
    }

    public String getData() {
      return data;
    }

    public void setData(String data) {
      this.data = data;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Data data1 = (Data) o;

//      return data != null ? data.equals(data1.data) : data1.data == null;
      return Objects.equals(data, data1.data);
    }

    @Override
    public int hashCode() {
      return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString() {
      return "Data{" +
              "data='" + data + '\'' +
              '}';
    }
  }

  //. main
  public static void main(String[] args) {

    execute(new Data("Aloona"));
    execute(null);

  }

  public static void execute(Data data) {

    // manual anti null pointer exception checking,
    // not outputting anything if data is null.
    if (data != null) {
    System.out.println("toString  : " + data.toString());
    System.out.println("Hash code : " + data.hashCode());
    }

    // using Objects standard classes
    // outputting String "null" and hash 0 if data is null.
    System.out.println(Objects.toString(data));
    System.out.println(Objects.hashCode(data));

  }

}