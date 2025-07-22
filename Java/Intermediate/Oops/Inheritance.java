public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swim();
        
    }
}

//Base class

class Animal {
    String color;

    void eat()
    {
        System.out.println("Eats");
    }
    void breathe()
    {
        System.out.println("Breathes");
    }
}


// Derived or Child Class
class Fish extends Animal{
    int fin;
    void swim()
    {
        System.out.println("Fish can swim");
    }
}
