import java.util.*;
public class Automorphic
{
    public static void main(String[] args)
    {
        int n, sqrNum, temp,sqrNumRemainder,c = 0;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number - ");
        n = Sc.nextInt();
        Sc.close();
        temp=n;        
        while (temp > 0)
        {
            temp=temp/10;
            c++;
        }
        sqrNum = n * n;
        sqrNumRemainder= sqrNum%(int)Math.pow(10, c);
        if(sqrNumRemainder==n)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }       
    }
}