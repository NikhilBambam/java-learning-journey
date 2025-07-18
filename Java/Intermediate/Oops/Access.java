// Access Modifier 
public class Access {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setName("Nikhil");
        b1.setPassword("1234");
        System.out.println(b1.username);
        
        // System.out.println(b1.password);  ❌ ERROR: password is private
    }
}

class Bank
{
    public String username;
    private String password;

    public void setName(String name)
    {
        username = name;
    }

    public void setPassword(String pwd)
    {
        password = pwd;
    }
}