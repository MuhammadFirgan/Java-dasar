package com.tutorial;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
	int[] angka1 = {1,2,3,4,5,6};
	printArray(angka1);
	
	// copyOf
	
	int[] angka2 = Arrays.copyOf(angka1, angka1.length);
	printArray(angka2);
	
	//copyOfRange
	
	int[] angka3 = Arrays.copyOfRange(angka1, 1, 5);
	printArray(angka3);
	
	
	
  }
  private static void printArray(int[] array) {
    System.out.println("Array : " + Arrays.toString(array));
  }
  
}
