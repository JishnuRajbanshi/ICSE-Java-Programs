import java.util.*;

class Palindrome
{
    public static void main (String [] args )
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
            s=(s*10)+r;
            n/=10;
        }
        if (c==s)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not Palindrome Number");
    }
}