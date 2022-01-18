package com.ujian;
import java.util.*;

public class Main {

  public static void main(String[] args) {
	

	
	int nilaiAwal,nilaiAkhir,total;
	Scanner inputUser = new Scanner(System.in);
	System.out.print("Masukkan nilai awal : ");
	nilaiAwal = inputUser.nextInt();
	System.out.print("Masukkan nilai Akhir : ");
	nilaiAkhir = inputUser.nextInt();
	
	//menggunakan while
	
	
	total = 0;
	
	while(nilaiAwal <= nilaiAkhir) {
	  total = total + nilaiAwal;
	  System.out.println(total);
	   System.out.println("ditambah "+ nilaiAwal + " menjadi " + total);
	  nilaiAwal++; 
	} 
	
	// menggunakan do while 

	
	do {
	  total = total + nilaiAwal; 
	  System.out.println("ditambah "+ nilaiAwal + " menjadi " + total); 
	  nilaiAwal++; 
	  
	} while (nilaiAwal <= nilaiAkhir); 
	
	// menggunakan for loop
	
	
	for( int i = nilaiAwal; i <= nilaiAkhir; i++ ) {
	  total = total + i;
	  System.out.println("ditambah "+ i + " menjadi " + total);
	  
}
	
	
	
	
	
	
	
	  
  }
}
