import java.util.*;

public class Fibonucci {
    public static void main (String [] arStrings)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No. of Terms -");
        int n=sc.nextInt();
        sc.close();
        int a=0,b=1,c;
        for (int i=0;i<=n;i++)
        {
            System.out.print(" "+a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}