import java.util.*;

public class Largest
{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Number - ");
        int a=sc.nextInt();
        Scanner sa=new Scanner (System.in);
        System.out.println("Enter the Number - ");
        int b=sa.nextInt();
        Scanner sb=new Scanner (System.in);
        System.out.println("Enter the Number - ");
        int c=sb.nextInt();
        sc.close();
        sa.close();
        sb.close();
        if (a>b && a>c)
        System.out.println(a);
        if (b>a && b>c)
        System.out.println(b);
        if (c>a && c>b)
        System.out.println(c);
    }
}