package com.Edward;

public class Main  {

    public static void main(String[] args) {
	// creating new classes
        Animal animal = new Animal("Animal",1, 1, 5, 5);

        Dog dog = new Dog("Lion",2,50,4,1,"red",5);

        // this where inheritance stated making sense
        dog.eat();
        dog.walk();
        dog.run();

    }
}
