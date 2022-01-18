package com.tutorial;
import java.util.*;
import java.lang.String;

public class Main {

  public static void main(String[] args) {
	String kalimat = "Hello world";
	String kalimat1 = new String("hello");
	System.out.println(kalimat1);
	
	//concat
	int umur = 19;
	System.out.println("Umur : " + umur);
	
	//lowerCase dan upperCase
		System.out.println(kalimat.toUpperCase());
	System.out.println(kalimat.toLowerCase());
	
	//replace
	String kalimat2 = kalimat.replace("world", "Firgan");
	System.out.println(kalimat2);
	
	//equality(persamaan)
	String kataInput;
	Scanner userInput = new Scanner(System.in);
	kataInput = userInput.next();
	System.out.println("Input user adalah " + kataInput);
	if (kataInput.equals("1")) {
	  System.out.println("Pilihan benar");
	} else {
	  System.out.println("Pilihan salah");
	}
	
	
	
	
	   
  }
}
