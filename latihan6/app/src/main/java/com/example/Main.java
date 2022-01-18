package com.example;
import java.util.*;

public class Main {

  public static void main(String[] args) {
	Scanner inputNama = new Scanner(System.in);
	String input;
	System.out.print("Masukkan nama : ");
	input = inputNama.next();
	switch (input) {
	   case "firgan" :
	      System.out.println("Halo " + input);
	      break;
	      
	   case "rama" :
	      System.out.println("Halo " + input); 
	      break;
	      
	   default :
	      System.out.println("Maaf saya tidak kenal anda");
	} 
	  
	
  }
}
