// So Here is a class pen with some attribute and function .
// Bascially Example of class And object.

public class Syntax
{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColour("Yellow");
        System.out.println(p1.color);
    }
}

class Pen
 {
    String color;
    int tip;
    
    void setColour(String newColor)
    {
        color=newColor;
    }
    void setTip(int newTip)
    {
        tip =newTip;
    }
 }
