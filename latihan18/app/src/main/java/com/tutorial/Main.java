package com.tutorial;
import java.util.*;

public class Main {

  public static void main(String[] args) {
	int[] array = {0,1,2,3};
	Scanner userInput = new Scanner(System.in);
	System.out.print("Index ke: ");
	int index = userInput.nextInt();
	
	
	try{
	  System.out.printf("Index ke %d adalah %d\n",index,array[index]); 
	} catch (Exception e) {
	  System.err.println("Index tidak sesuai"); 
	} finally {
	  System.out.println("Finally");
	}
	
	System.out.println("Akhir program");
	
	
  }
}
