package org.starnoh;

public class Alien {

    private int age;
    private Laptop lap;

    public Alien(int age , Laptop lap) {
        this.age = age;
        this.lap = lap;
        System.out.println("Object created!!!!");
    }
    public void code(){
        lap.code();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
