public class SingleInheritance {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.study();
    }
}

class Mammals
{
    String color;

    void breath()
    {
        System.out.println("Mammals can breathe");
    }

    void think()
    {
        System.out.println("Mammals can think");
    }
}


class Human extends Mammals
{
    void study()
    {
        System.out.println("Humans can study");
    }
}
