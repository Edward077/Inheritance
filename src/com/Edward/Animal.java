package com.Edward;

public class Animal {
    private String name;
    private  int brain;
    private int body;
    private  int size;
    private  int weight;

    public Animal(String name, int brain, int body, int size, int weight) { // Constructor
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    // creating more method

    public void eat(){
        System.out.println("Animal.called()");

    }
    public void  move(int speed){
        System.out.println("Animal is moving at " + speed);

    }
    public void run(int levelSpeed){
        System.out.println("Rate at which the dog move= " +levelSpeed);

    }
    // create a getter

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
