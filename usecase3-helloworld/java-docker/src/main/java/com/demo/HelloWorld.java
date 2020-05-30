package com.demo;

public class HelloWorld {
  public static void main(String args[]) throws InterruptedException {
    for (int i = 0; i <= 1000; i++) {
      System.out.println("Hello World " + i);
      Thread.sleep(1000);
    }
  }
}
