package com.ujian;
import java.util.*;

public class Main {

  public static void main(String[] args) {
	Scanner userInput;
	int panjang,lebar,sisi,hasil,pilih;
	userInput = new Scanner(System.in);
	System.out.println("====MENGHITUNG LUAS====");
	System.out.println("1. Luas Persegi");
	System.out.println("2. Luas Persegi Panjang");
	System.out.print("Pilih : ");
	pilih = userInput.nextInt();
	switch (pilih) {
	  case 1 :
	    System.out.print("Masukkan sisinya : ");
	    sisi = userInput.nextInt();
	    hasil = (sisi * sisi);
	    System.out.println("Hasil : " + hasil);
	    break;
	  case 2 :
	    System.out.print("Masukkan panjangnya : ");
	    panjang = userInput.nextInt();
	    System.out.print("Masukkan lebarnya : ");
	    lebar = userInput.nextInt();
	    hasil = (panjang * lebar);
	    System.out.println("Hasil : " + hasil);
	    break;
	  default :
	    System.out.println("Pilihan tidak ditemukan");
	    break;
	}
	
  }
}
