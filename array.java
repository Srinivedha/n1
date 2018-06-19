import java.io.*;
import java.util.*;
class array
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=10,count=0;
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int b[]=new int[10];
        for(int i=0;i<n;i++)
        {
            b[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int k=a[i];
            int k1=b[i];
        if(k==k1)
        {
            count++;
        }
        }
        if(count==n)
        System.out.print("true");
        else
        {
            System.out.print("false");
        }
    }
}

