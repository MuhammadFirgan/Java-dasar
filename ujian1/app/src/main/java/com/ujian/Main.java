package com.ujian;
import java.util.*;

public class Main {

  public static void main(String[] args) {
	Scanner keyword = new Scanner(System.in);
	int nilaiBenar = 6;
	int nilaiTebakan;
	boolean hasilTebakan;
	System.out.print("Masukkan nilai tebakan : ");
	nilaiTebakan = keyword.nextInt();
	hasilTebakan = ( nilaiTebakan == nilaiBenar );
	System.out.println("Hasil tebakan anda : " + hasilTebakan);
	
	System.out.print("Masukkan angka diantara 3 dan 9 : ");
	nilaiTebakan = keyword.nextInt();
	hasilTebakan = (nilaiTebakan >= 3) && (nilaiTebakan <= 9);
	System.out.println("Hasil : " + hasilTebakan);
   
  }
}
