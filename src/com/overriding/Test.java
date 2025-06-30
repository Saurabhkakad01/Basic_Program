package com.overriding;

public class Test {
public static void main(String[] args) {
	AnimalSound a1 = new Dog();
	AnimalSound a2 = new Cat();
	
	a1.makeSound();
	a2.makeSound();
}
}
