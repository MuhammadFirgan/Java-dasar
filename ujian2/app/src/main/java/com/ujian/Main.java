package com.ujian;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int nilai;
	System.out.print("Masukkan nilai : ");
	nilai = input.nextInt();
	if(nilai == 80) {
	  System.out.println("nilai anda A");
	} else if(nilai >= 70 && nilai <= 79) {
	  System.out.println("Nilai anda B");
	} else if(nilai >= 55 && nilai <= 69) {
	  System.out.println("Nilai anda C");
	} else if(nilai >= 50 && nilai <= 59) {
	  System.out.println("Nilai anda D");
	} else {
	  System.out.println("Nilai anda E");
	}	
  }
}
