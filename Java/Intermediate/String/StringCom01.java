// String Compression using String Builder 
public class StringCom01 {
    public static String compression(String Str)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<Str.length();i++)
        {
            Integer count =1;
            while(i<Str.length()-1 && Str.charAt(i)==Str.charAt(i+1) )
            {
                count++;
                i++;
            }
            sb.append(Str.charAt(i));
            if(count>1)
            {
                sb.append(count.toString());
            }
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String Str="aaabbbccd";
        System.out.println(compression(Str));
    }
}
