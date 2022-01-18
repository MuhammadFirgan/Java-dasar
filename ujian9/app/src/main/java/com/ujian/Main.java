package com.ujian;
import java.util.*;

public class Main {

  public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	System.out.print("Masukkan sisinya : ");
	int inputSisi = userInput.nextInt();
	tampilHasil(inputSisi);
  }
  
  private static void tampilHasil(int sisi) {
    System.out.println("Luas : " + luas(sisi));
	System.out.println("Keliling : " + keliling(sisi));
  }
  
  private static int luas(int sisi) {
    int luas;
    luas = sisi * sisi;
    return luas;
  }
  
  private static int keliling(int sisi) {
    int keliling;
    keliling = 4 * sisi;
    return keliling;
  }
  
  
}
