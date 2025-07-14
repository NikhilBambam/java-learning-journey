public class Practise {
    public static String convert(String str)
    {
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void compr(String str)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) )
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1)
            {
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="aaaabbbbcccddd";
        compr(str);

    }
}
