// Convert first letter of word in upperCase 
// hi, my name is nikhil
// Hi, My Name Is Nikhil
public class Question01 {
    public static void printStr(String str)
    {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        sb.toString();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="hi, my name is nikhil";
        printStr(str);
    }
}
