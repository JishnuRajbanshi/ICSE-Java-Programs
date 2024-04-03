import java.util.*;
public class Neon
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number - ");
        int n = sc.nextInt();
        sc.close();
        if ((n%7==0) || (n%10==7))
        System.out.println("Neon Number");
        else
        System.out.println("Not Neon Number");
    }
}