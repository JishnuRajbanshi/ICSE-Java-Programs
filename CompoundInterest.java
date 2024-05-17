import java.util.*;
public class CompoundInterest
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the Principal - ");
    double p = sc.nextDouble();
    System.out.print("Enter the Rate of Interest - ");
    double r = sc.nextDouble();
    System.out.print("Enter the Time Period - ");
    double t = sc.nextDouble();
    double s = (1+(r/100));
    double CI = Math.pow(s,t);
    Float re = (float)(p*CI);
    float i = (float)(re-p);
    System.out.println("Compound Interest = "+i);
    System.out.println("Amount = "+re);
    sc.close();
    }
}