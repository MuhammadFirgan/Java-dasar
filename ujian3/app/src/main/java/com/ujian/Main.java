package com.ujian;
import java.util.*;

public class Main {

  public static void main(String[] args) {
	Scanner Input = new Scanner(System.in);
	int hargaBarang1,hargaBarang2,jumlahBarang1,jumlahBarang2,total,bayar,kembalian;
	System.out.println("====PROGRAM KASIR SEDERHANA====");
	System.out.print("Harga barang pertama : ");
	hargaBarang1 = Input.nextInt();
	System.out.print("Harga barang kedua : ");
	hargaBarang2 = Input.nextInt();
	System.out.print("Jumlah barang pertama: ");
	jumlahBarang1 = Input.nextInt();
	System.out.print("Jumlah barang kedua: ");
	jumlahBarang2 = Input.nextInt();
	total = (hargaBarang1 * jumlahBarang1) + (hargaBarang2 * jumlahBarang2);
	System.out.println("Total : " + total);
	System.out.print("Bayar : ");
	bayar = Input.nextInt();
	if (bayar > total) {
	  kembalian = (bayar - total);
	  System.out.println("Kembalian : " + kembalian);
	} else if ( bayar == total ) {
	    System.out.println("Uang anda pas");
	 } else {
	   System.out.println("Uang anda kurang");
    }
	
	
  }
}

