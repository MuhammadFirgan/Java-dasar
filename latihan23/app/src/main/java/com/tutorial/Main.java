package com.tutorial;
import java.io.*;
import java.io.FileReader;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
  
	FileReader fileInput = new FileReader("/storage/emulated/0/JavaNIDE/latihan23/input.txt"); 
	BufferedReader bufferedReader = new BufferedReader(fileInput); 
	Scanner scanner = new Scanner(bufferedReader); 
	
	//membaca dengan delimiter spasi
	System.out.println(scanner.next());
	System.out.println(scanner.next());
	
	//cek kata selanjutnya ada atau tidak
	System.out.println(scanner.hasNext());
	
	//menggunakan delimiter tertentu
	FileReader fileInput2 = new FileReader("/storage/emulated/0/JavaNIDE/latihan23/input2.txt");
	bufferedReader = new BufferedReader(fileInput2);
	bufferedReader.mark(200);
	
	scanner = new Scanner(bufferedReader);
	scanner.useDelimiter(",");
	while (scanner.hasNext()) {
	  System.out.println(scanner.next());
	}
	
	
	
	//menggunakan string tokenizer 
	bufferedReader.reset(); 
	String data = bufferedReader.readLine(); 
	System.out.println(data); 
	StringTokenizer stringToken = new StringTokenizer(data, ",");
	
	while(stringToken.hasMoreTokens()) {
	  System.out.println(stringToken.nextToken());
	}
	
	
	
	
	   
  }
}
