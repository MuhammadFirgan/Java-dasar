package com.tutorial;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
	
	FileInputStream fileInput = null;
	FileOutputStream fileOutput = null;
	fileInput = new FileInputStream("/storage/emulated/0/JavaNIDE/latihan21/input.txt");
	int data = fileInput.read();
	while(data > 0) {
		System.out.println((char)data);
		data = fileInput.read();
	}
	fileInput.close();
	
	
	//contoh kedua
	
	
	try {
	  fileInput = new FileInputStream("/storage/emulated/0/JavaNIDE/latihan21/input.txt");
	  fileOutput = new FileOutputStream("/storage/emulated/0/JavaNIDE/latihan21/output2.txt");
	  int buffer = fileInput.read();
	  
	  while (buffer != -1) {
	    fileOutput.write(buffer);
	    buffer = fileInput.read();
	  }
	  
	} finally {
	  if(fileInput != null) {
	    fileInput.close();
	  }
	  if(fileOutput != null) {
	    fileOutput.close();
	  }
	}
	
	
	//contoh ketiga
	
	
	try (
	FileInputStream in = new FileInputStream("/storage/emulated/0/JavaNIDE/latihan21/input.txt");
	FileOutputStream out = new FileOutputStream("/storage/emulated/0/JavaNIDE/latihan21/output.txt")
	){
	  int data2 = in.read();
	  while(data2 > 0) {
	    System.out.print((char) data2);
	    data2 = in.read();
	  }
	   
	}
	
   
  }
}
