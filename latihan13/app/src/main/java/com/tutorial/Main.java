package com.tutorial;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
	//assignment
	System.out.println("Awal array assignment");
	int[] contohArray = {1,2,3,4,5,6,7};
	System.out.println(contohArray[3]);
	
	System.out.println("Awal array deklarasi");
	
	//deklarasi
	float[] arrayFloat = new float[5];
	arrayFloat[2] = 12.5f;
	System.out.println(Arrays.toString(arrayFloat));
	System.out.println("looping array dengan for loop");
	
	// for loop array
	
	for(int i = 0; i < contohArray.length; i++) {
	 System.out.println("Angka dengan index ke "+ i +" adalah " + contohArray[i]);
	}
	 
	 //for each
	 System.out.println("looping array dengan for each");
	 for(int angka : contohArray) {
	   System.out.println("Ini adalah angka " + angka);
	 }
	  
   
   
   
   
   
  }
}
