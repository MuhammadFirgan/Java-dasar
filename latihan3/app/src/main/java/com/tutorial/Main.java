package com.tutorial;

import javax.xml.transform.Source;


public class Main {

  public static void main(String[] args) {
	//penjumlahan
	int a = 1;
	a += 10;
	System.out.println(a);
	
	//pengurangan
	int b = 1;
	b -= 10;
	System.out.println(b);
	
	//perkalian
	int c = 2;
	c *= 20;
	System.out.println(c);
	
	//pembagian
	int d = 30;
	d /= 5;
	System.out.println(d);
	
	int angka1 = 20;
	int angka2 = 30;
	boolean kondisi;
	kondisi = (angka1 == angka2);
	System.out.printf("%d == %d --> %s \n",angka1,angka2,kondisi);
	
	boolean kondisi2;
	kondisi2 = (b != d);
	System.out.printf("%d != %d --> %s \n", b,d,kondisi2);
	
	boolean kondisi3;
	kondisi3 = (a < c);
	System.out.printf("%d < %d --> %s\n", a,c,kondisi3);
	
	boolean kondisi4;
	kondisi4 = (a > b);
	System.out.printf("%d > %d --> %s \n",a,b,kondisi4);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  }
}
