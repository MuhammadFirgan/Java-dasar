package com.tutorial;

public class Main {

  public static void main(String[] args) {
	int x,y;
	x = hitung(3,55);
	y = hitung(4,5);
	System.out.println("x = " + x + ", y = " + y);
	salam( " Firgan" );
	System.out.println("Umur saya " + age(19) + " tahun");
  }
  
  // fungsi/method dengan kembalian
  
  public static int hitung(int input1, int input2) {
    int hasil;
    hasil = input1 * input2;
    return hasil;
  }
  
  public static int age(int umur) {
	return umur;
   
  }
  
  // fungsi/method tanpa kembalian/return
  
  private static void salam(String nama) { 
	System.out.println("Selamat siang" + nama); 
    
  }
  
  
  
}
