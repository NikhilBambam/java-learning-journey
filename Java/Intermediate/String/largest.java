public class largest {
    public static void printLargest(String fruits[])
    {
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++)
        {
           if(fruits[i].compareToIgnoreCase(largest)>0)
           {
            largest=fruits[i];
           }
        }
        System.out.println("Largest String in lexicography order : "+largest);
    }
    public static void main(String[] args) {
        String fruits[] ={"apple","mango","banana"};
        printLargest(fruits);
    }
}
