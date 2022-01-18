package com.tutorial;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	int panjang,lebar,luas,tinggi,volume,keliling;
	String nama;
	System.out.print("Halo siapa nama kamu : ");
	nama = userInput.nextLine();
	System.out.println("Selamat datang " + nama);
	
	System.out.println("====PERSEGI PANJANG====");	
	System.out.print("Panjang : ");
	panjang = userInput.nextInt();
	System.out.print("Lebar : ");
	lebar = userInput.nextInt();
	System.out.print("Tinggi : ");
	tinggi = userInput.nextInt();
	luas = panjang * lebar;
	volume = luas * tinggi;
	keliling = 2 * (panjang + lebar);
	System.out.println("Luas : " + luas);
	System.out.println("Keliling : " + keliling);
	System.out.println("Volume : " + volume);
	
	
	
  }
}