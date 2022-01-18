package com.tutorial;
import java.util.*;

public class Main {

  public static void main(String[] args) {
  
	int[] dataArray = {0,1,2,3};
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Data ke : ");
	int indexInput = userInput.nextInt();
	
	
	//exception dalam method
	System.out.println("\nException dalam method");
	int data = ambilData(dataArray, indexInput);
	System.out.printf("Data dari index ke %d adalah %d\n",indexInput, data);
	
	
	//exception throws dalam method
	System.out.println("\n\nException throws dalam method");
	int data2 = 0;
	
	try {
	  data2 = ambilData2(dataArray, indexInput);
	} catch(Exception e) {
	  System.err.println(e);
	}
	System.out.printf("Data dari index ke %d adalah %d\n",indexInput, data);
	
	   
  }
  
  private static int ambilData2(int[] array, int index) throws Exception {
    int hasil = array[index];
    return hasil;
  }
  
  private static int ambilData(int[] array, int index) {
    int hasil = 0;
    
    try {
      hasil = array[index];
    } catch( Exception e ) {
      System.err.println(e);
    }
    
    return hasil;   
    
  }
}
