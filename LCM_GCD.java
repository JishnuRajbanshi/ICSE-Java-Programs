import java.util.*;

public class LCM_GCD
{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the 1st Number - ");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd Number - ");
        int b=sc.nextInt();
        sc.close();
        int num1,num2,hcf,lcm,temp;
        num1=a;
        num2=b;
        while(num2!=0)
        {
            temp=num2;
            num2=num1%num2;
            num1=temp;        
        }
        hcf=num1;
        lcm=(a*b)/hcf;
        System.out.println("HCF = "+hcf);
        System.out.println("LCM = "+lcm);
    }
}