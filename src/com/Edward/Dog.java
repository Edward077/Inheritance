package com.Edward;

public class Dog extends Animal { // create a constructor for the extends class
    // add more feature to the dog class or behaviour
    private int eyes;
    private  int legs;
    private int tails;
    private  int teeth;
    private String coat;

    public Dog(String name, int eyes, int teeth, int legs,int tails, String coat, int weight) {
        super(name,1, 1,1, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth =teeth;
        this.coat = coat;
    }
    private  void chew(){
        System.out.println("Dog.eat()  called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() Called");
        chew();
        super.eat();

    }
    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);

    }
    public void run(){
        run(10);

    }
}
