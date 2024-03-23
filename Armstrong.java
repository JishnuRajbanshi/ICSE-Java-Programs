import java.util.*;

 public class Armstrong
{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Number - ");
        int n=sc.nextInt();
        sc.close();
        int c=n;
        int r,s=0;
        while (n!=0)
        {
            r=n%10;
            s+=r*r*r;
            n/=10;
        }
        if (c==s)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not Armstrong Number");
    }
}