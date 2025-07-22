// Hierarchial Inheritance =  Animal -> Fish  and Animal -> Bird ;
public class HierarchialInheritance {
    public static void main(String[] args) {
        Bird b1=new Bird();
        b1.breath();
        b1.fly();
        Fish f1 = new Fish();
        f1.swim();
    }
}

class Animal {

    void breath()
    {
        System.out.println("Breath");
    }

    void eat()
    {
        System.out.println("Eats");
    }
}

class Fish extends Animal
{
    void swim()
    {
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly()
    {
        System.out.println("fly");
    }
}