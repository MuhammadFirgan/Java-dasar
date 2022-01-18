package com.ujian;
import java.util.*;
import java.lang.String;

public class Main {

  public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	String pilih;
	int panjang,lebar,sisi;
	System.out.println("MENGHITUNG LUAS");
	System.out.println("1. Menghitung luas persegi");
	System.out.println("2. Menghitung luas persegi panjang");
	System.out.print("Pilih : ");
	pilih = userInput.next();
	if (pilih.equals("1")) {
      System.out.print("Masukkan sisi : ");
      sisi = userInput.next();
	  luasPersegi(sisi);
	} else if(pilih.equals("2")) {
	  System.out.print("Masukkan panjang : ");
      panjang = userInput.next();
      System.out.print("Masukkan lebar : ");
      lebar = userInput.next();
	  luasPersegiPanjang(panjang,lebar);
	}
	
  }
  
  private static void luasPersegi(int s) {
    int hasil = s * s;
    System.out.println("Luas persegi adalah : " + hasil);
  }
  
  private static void luasPersegiPanjang(int p, int l) {
    int hasil = p * l;
    System.out.println("Luas persegi panjang adalah : " + hasil) ;
    }
  



}
