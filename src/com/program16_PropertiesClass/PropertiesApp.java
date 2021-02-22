package com.program16_PropertiesClass;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
  public static void main(String[] args) {

    //. load from properties
    try {
      Properties properties = new Properties();
      properties.load(new FileInputStream("application.properties"));

      String dbHost = properties.getProperty("database.host");
      String dbPort = properties.getProperty("database.port");
      String username = properties.getProperty("database.username");
      String password = properties.getProperty("database.password");

      System.out.println(dbHost + ":" + dbPort + " (" + username + "=" + password + ")");

    } catch (FileNotFoundException exception) {
      System.out.println("File Not Found!");

    } catch (IOException exception) {
      System.out.println("File Load failure!");
    }

    //. save to properties
    try {
      Properties properties = new Properties();
      properties.put("name.first", "Aloona");
      properties.put("name.last", "Kristaen");

      properties.store(new FileOutputStream("name.properties"),
              "name configuration");

    } catch (FileNotFoundException ex) {
      System.out.println("Error creating properties file.");

    } catch (IOException exception) {
      System.out.println("Error saving properties");
    }

  }
}
