public class Syntax 
{
    public static void printall(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        // String str = "Nikhil";
        // String str1 = new String("Anand") ;
        // System.out.println(str.length());
        // System.out.println(str1);


        // Concatenation
        String firstName = "Nikhil" ;
        String lastName = "Anand";

        String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // CharAt
        // System.out.println(fullName.charAt(5));
        printall(fullName);
    }
}