package com.tutorial;
import java.io.FileInputStream;
import java.io.IOException;


public class Main {

  public static void main(String[] args) {
	try {
	  FileInputStream fileInput = new FileInputStream("/storage/emulated/0/JavaNIDE/latihan20/test.txt");
	  	System.out.println((char)fileInput.read());
	} catch(IOException e) {
	  System.err.println("error");
	}
	
	
	
   
   
  }
}
