public class Palindrome {
    public static boolean isPalindrome(String str)
    {
        int n=str.length();
       for(int i=0;i<=n/2;i++)
       {
        if(str.charAt(i)!=str.charAt(n-i-1))
        {
            System.out.println(str + "is not a palindrome");
            return false;
        }
       }
       System.out.println(str +" is a palindrome. ");
       return true;

    }
    public static void main(String[] args) {
        String str="racecar";
        isPalindrome(str);
    }
}
