public class GetterandSetter {
    public static void main(String[] args) {
        Pencil p1= new Pencil();
        p1.setColor("Yellow");
        p1.setTip(5);
        System.out.println(p1.getTip());
        System.out.println(p1.getColor());
    }
}

class Pencil
{
    private String color;
    private int tip;

    void setColor(String color)
    {
        this.color=color;
    }

    void setTip(int tip)
    {
        this.tip=tip;
    }

    String getColor()
    {
        return this.color;
    }
    int getTip()
    {
        return this.tip;
    }
}
