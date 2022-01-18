package com.tutorial;

public class Main {

  public static void main(String[] args) {
	System.out.println("For loop pertama");
	for(int i = 0; i <= 10; i++) {
	  System.out.println("for loop ke-" + i);
	}
	System.out.println("For loop kedua");
	int kurangDari = 1;
	for(int i = 10; i >= kurangDari; i--) {
	  System.out.println("For loop ke-" + i);
	}
	
  }
}
