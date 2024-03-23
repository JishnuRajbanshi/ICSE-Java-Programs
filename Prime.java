import java.util.*;

public class Prime
{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Number - ");
        int n=sc.nextInt();
        sc.close();
        int s=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                s++;
            }
        }
        if (s==2)
            System.out.println("Prime Number");
            else
            System.out.println("Not Prime Number");
    }
}