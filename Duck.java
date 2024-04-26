import java.util.*;
public class Duck
{
    public static void main(String[] args)
    {
        int r, n, num;
        boolean flag=false;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Number - ");
        n = Sc.nextInt();
        Sc.close();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            if(r==0)
            {
                flag=true;
            }
            num = num / 10;
        }
        if(flag)
        {
            System.out.println("Duck Number");
        }
        else
        {
            System.out.println("Not Duck Number");
        }
    }
}