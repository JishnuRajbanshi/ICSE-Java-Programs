import java.util.*;
public class Niven
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int r,n,s=0,c;
        System.out.print("Enter the Number - ");
        n=sc.nextInt();
        sc.close();
        c=n;
        while (n!=0)
        {
            r=n%10;
            s+=r;
            n=n/10;
        }
        if (c%s==0)
        System.out.println("Niven Number");
        else
        System.out.println("Not Niven Number");
    }
}