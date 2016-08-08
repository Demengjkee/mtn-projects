package com.test;

//dependency on Apache commons-collections
import org.apache.commons.collections.Predicate;

class Project {

  public static void test() {
    System.out.println("test");
  }
  
  public static void main(String[] args) {
  	System.out.println("Hellow MTN");

  	Runnable test = () -> { System.out.println("up and running"); };
  	for(int i = 0; i < 10; i++) {
  	  	new Thread(test).start()
  	}
  }

}
