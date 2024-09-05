import java.util.*;
public class Buzz
{
    public static void main (String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number - ");
        n=sc.nextInt();
        sc.close();
        if (n%7==0 || n%10==7)
        System.out.println("Buzz Number");
        else
        System.out.println("Not Buzz Number");
    }
}