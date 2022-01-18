package com.tutorial;
import java.io.*;
import java.io.BufferedReader;

public class Main {

  public static void main(String[] args) throws IOException {
  
	//membaca file 
	FileReader fileInput = new FileReader("/storage/emulated/0/JavaNIDE/latihan22/input.txt");  
	BufferedReader bufferedReader = new BufferedReader(fileInput); 
	bufferedReader.mark(200); 
	String data = bufferedReader.readLine(); 
	System.out.println(data); 
	
	
	//menulis file
	FileWriter fileOutput = new FileWriter("/storage/emulated/0/JavaNIDE/latihan22/output.txt");
	BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);
	bufferedReader.reset();
	String baris1 = bufferedReader.readLine();
	
	bufferedWriter.write(baris1,0,baris1.length());
	bufferedWriter.flush();
	
	bufferedWriter.close();
	bufferedReader.close();
	fileInput.close();
	fileOutput.close();
	
	
	
	
	
	
   
  }
}
