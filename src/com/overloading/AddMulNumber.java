package com.overloading;

public class AddMulNumber {
public int add(int a, int b) {
	return a+b;
}
public int add(int a, int b, int c) {
	return a+b+c;
}
public static void main(String[] args) {
	AddMulNumber m = new AddMulNumber();
	System.out.println("Sum of two Number : "+m.add(10, 10));
	System.out.println("Sum of three Number : "+m.add(10, 10, 10));
}
}
