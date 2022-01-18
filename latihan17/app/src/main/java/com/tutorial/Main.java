package com.tutorial;
import java.lang.StringBuilder;

public class Main {

  public static void main(String[] args) {
  
	StringBuilder builder = new StringBuilder("halo");
	printData(builder);
	
	
	//append 
	builder.append(" Muhammad");
	builder.append(" firgani");
	printData(builder);
	
	
	//insert
	builder.insert(21," Rahman");
	printData(builder);
	
	
	//delete 
	builder.delete(4,13);
	printData(builder);
	
	
	//replace
	builder.replace(5,12,"Firgani");
	printData(builder);
	
	
   
  }
  
  private static void printData(StringBuilder data) {
    System.out.println("Data : " + data);
  }
}
