package com.muskan.step1;


//public class
public class Animal2 {
 // public variable
 public int legCount;

 // public method
 public void display() {
     System.out.println("I am an animal.");
     System.out.println("I have " + legCount + " legs.");
 }


//Main.java
//public class Main {
 public static void main( String[] args ) {
     // accessing the public class
     Animal2 animal = new Animal2();

     // accessing the public variable
     animal.legCount = 4;
     // accessing the public method
     animal.display();
 }
}
