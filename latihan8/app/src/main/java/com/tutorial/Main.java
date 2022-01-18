package com.tutorial;

public class Main {

  public static void main(String[] args) {
    int a;
    boolean kondisi = true;
    a = 0;
    
    
	while (kondisi) {
	  System.out.println("while loop ke- " + a);
	  a++;
	  if (a == 10) {
	    kondisi = false;
	  }
	  
	}
  }
}
