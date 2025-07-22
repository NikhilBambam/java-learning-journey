// Multi level Inheritance = Base Class -> Derived Class -> Derived class

public class MultiInheritance {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.breed();
        d1.breathe();
        d1.legs=4;
        System.out.println(d1.legs);
    }
}


class Animals
{
    String color;

    void eat()
    {
        System.out.println("Eats");
    }


    void breathe()
    {
        System.out.println("Breathe");
    }

}
class Mammals extends Animals{

    int legs;
}



class Dog extends Mammals
{
    void breed()
    {
        System.out.println("German Sphered");
    }
}