package org.vmtask1;


public class Task2SC {				//access non static method into non static method direct access
	int i=20;

	public void m1() {
		System.out.println(i);
		m2();
		
	}
	public void m2() {
		int i=10;
		System.out.println(i);
		
	}
public static void main(String[] args) {
	Task2SC ab=new Task2SC();
	ab.m1();
	
}
	
	
	
	

}
