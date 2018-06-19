import java.io.*;
import java.util.*;
class Alpha
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        
        if(a>='a'&&a<='z')
        {
            System.out.print("Alphabet");
        }
        else
        System.out.print("No");
    }
}
