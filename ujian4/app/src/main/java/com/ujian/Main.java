package com.ujian;
import java.util.*;

public class Main {

  public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	
	float a,b,hasil;
	int pilihan;
	System.out.println("====KALKULATOR====");
	System.out.println("1. Penjumlahan");
	System.out.println("2. Pengurangan");
	System.out.println("3. Perkalian");
	System.out.println("4. Pembagian");
	System.out.print("Pilih : ");
	pilihan = userInput.nextInt();
	switch (pilihan) {
	  case 1 :
	    System.out.print("Masukkan angka pertama : ");
	    a = userInput.nextInt();
	    System.out.print("Masukkan angka kedua : ");
	    b = userInput.nextInt();
	    hasil = (a + b);
	    System.out.println("Input : "+ a +" + " + b + " = " + hasil);
	    break;
	  case 2 :
	    System.out.print("Masukkan angka pertama : ");
	    a = userInput.nextInt();
	    System.out.print("Masukkan angka kedua : ");
	    b = userInput.nextInt();
	    hasil = (a - b);
	    System.out.println("Input : "+ a +" - " + b + " = " + hasil);
	    break;
	  case 3 :
	    System.out.print("Masukkan angka pertama : ");
	    a = userInput.nextInt();
	    System.out.print("Masukkan angka kedua : ");
	    b = userInput.nextInt();
	    hasil = (a * b);
	    System.out.println("Input : "+ a +" * " + b + " = " + hasil);
	    break;
	  case 4 :
	    System.out.print("Masukkan angka pertama : ");
	    a = userInput.nextInt();
	    System.out.print("Masukkan angka kedua : ");
	    b = userInput.nextInt();
	    hasil = (a / b);
	    System.out.println("Input : "+ a +" / " + b + " = " + hasil);
	    break;
	}
  }
}
