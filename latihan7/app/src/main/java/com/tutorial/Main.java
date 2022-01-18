package com.tutorial;
import java.util.*;

public class Main {

  public static void main(String[] args) {
	Scanner inputUser = new Scanner(System.in);
	String keyword;
	System.out.print("Masukkan nama : ");
	keyword = inputUser.next();
	if (keyword == "firgan") {
	  System.out.println(keyword);
	}
  }
}
