package com.study.polymorphic.polyexample;

public class Master {
    public static void main(String[] args) {
        Master jack = new Master("jack");
        Animals cat = new Cat("tom");
        Food fish = new Fish("fish");
        jack.Feed(cat,fish);
    }
    private String name;
    public Master(String name) {
        this.name = name;
    }
    public void Feed(Animals animals,Food food){
        System.out.println(animals.getName() + " " + food.getName());
    }
}
class Animals{
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }
}
class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }
}
class Food{
    private String name;
    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Bone extends Food {
    public Bone(String name) {
        super(name);
    }
}
class Fish extends Food {
    public Fish(String name){
        super(name);
    }
}