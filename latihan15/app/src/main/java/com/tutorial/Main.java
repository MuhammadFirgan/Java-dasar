package com.tutorial;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
	int[][] arrayPertama = {{1,2},{3,4}};
	System.out.println(Arrays.deepToString(arrayPertama));
	
	//menggunakan for
	
	int[][] arrayKedua = new int[5][4]; 
	for(int i = 0; i < arrayKedua.length; i++ ) {
	 System.out.println(Arrays.toString(arrayKedua[i])); 
	}
	
	for(int[] baris : arrayKedua) {
	  for(int angka : baris) {
	    System.out.print(angka + " ,");
	  }
	  System.out.print("\n");
	}
   
  }
}
