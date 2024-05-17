import java.util.*;
public class Larger
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner (System.in);
        System.out.print("Enter the 1st Number - ");
        int a = Sc.nextInt();
        System.out.print("Enter the 2nd Number - ");
        int b = Sc.nextInt();
        System.out.print("Enter the 3rd Number - ");
        int c = Sc.nextInt();
        Sc.close();
        if (a>=b && a>=c)
        {
            if (b>c)
            {
                System.out.println(b+" is the Second Largest");
            }
            else
            {
                System.out.println(c+" is the Second Largest");
            }
        }
        else if (b>=a && b>=c)
        {
        if (a>c)
            {
                System.out.println(a+" is the Second Largest");
            }
            else
            {
                System.out.println(c+" is the Second Largest");
            }
        }
        else
        {
            if (a>b)
            {
                System.out.println(a+" is the Second Largest");
            }
            else
            {
                System.out.println(b+" is the Second Largest");
            }
        }
    }
}