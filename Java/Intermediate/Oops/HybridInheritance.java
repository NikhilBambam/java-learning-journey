// Hybrid Inheritance :-    

public class HybridInheritance {
    public static void main(String[] args) {
        Dog kanna = new Dog();
        kanna.nature();
        kanna.breath();
    }
}

class Animal 
{
    void breath()
    {
        System.out.println("All Breathes");
    }
    
    void Eat()
    {
        System.out.println("All Eats");
    }
}


class Fish extends Animal {
    void swim()
    {
        System.out.println("All Fish can Swim");
    }
}

class Bird extends Animal {
    void fly()
    {
        System.out.println("All Bird can fly");
    }
}

class Mammal extends Animal 
{
    void walk()
    {
        System.out.println("All mammal Can Walk");
    }
}


class shark extends Fish 
{
    void nature()
    {
        System.out.println("Sharks are very Agressive in nature");
    }
}

class Tuna extends Fish{
    void nature()
    {
        System.out.println("Tuna are also quiet aggresive in nature");
    }
}

class Peacock extends Bird{
    void beauty()
    {
        System.out.println("The beauty of this bird is very good");
    }
}

class Dog extends Mammal
{
    void nature()
    {
        System.out.println("Dogs are very friendly in nature");
    }
}

class cat extends Mammal{
    void nature()
    {
        System.out.println("Cats are agressive ");
    }
}
