package org.vmtask1;

public class Variables {
   
	  int a=10;								//access instance variables in to non static method direct access
	 public void  m1() {
		 System.out.println(a);
		 
	 }
	public void m2() {
		System.out.println("hi welcome");
		m1();
	}
	  public static void main(String[] args) {
		Variables a =new Variables();
		a.m2();
		

		
	}
}

