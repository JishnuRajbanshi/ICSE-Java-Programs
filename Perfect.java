import java.util.*;

public class Perfect 
{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Number - ");
        int n=sc.nextInt();
        sc.close();
        int s=0;
        for (int i=1;i<n;i++)
        {
            if (n%i==0)
            {
                s+=i;
            }
        }
        if (s==n)
        System.out.println("Perfect Number");
        else
        System.out.print("Not Perfect Number");
    }
}
