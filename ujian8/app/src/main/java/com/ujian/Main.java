package com.ujian;
import java.util.*;

public class Main {

  public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	System.out.print("Panjang : ");
	int inputPanjang = userInput.nextInt();
	System.out.print("Lebar : ");
	int inputLebar = userInput.nextInt();
	gambar(inputPanjang,inputLebar);
	tampilHasil(inputPanjang,inputLebar);
	
  }
  
  private static void tampilHasil(int panjang, int lebar) {
    System.out.println("luas : " + luas(panjang,lebar));
	System.out.println("keliling : " + keliling(panjang,lebar));
  }
  
  private static int luas(int panjang, int lebar) {
    int hasil;
    hasil = panjang * lebar;
    return hasil;
  }
  
  private static int keliling(int panjang, int lebar) {
    int hasil;
    hasil = 2 * (panjang + lebar);
    return hasil;
  }
  
  
  private static void gambar(int panjang, int lebar) {
    for(int i = 0; i < panjang; i++) {
      for(int j = 0; j < lebar; j++) {
        System.out.print("* ");
      }
      System.out.println("\n");
    }
  }
  
  
  
}
