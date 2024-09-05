import java.util.*;
public class LeapYear
{
    public static void main(String[] args) 
    {
        int y;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Year - ");
        y=sc.nextInt();
        sc.close();
        if (y%100==0)
        {
            if (y%400==0)
                System.out.println("Leap Year");
            else
                System.out.println("Not Leap Year");
        }
        else
        {
            if (y%4==0)
                System.out.println("Leap Year");
            else
                System.out.println("Not Leap Year");
        }
    }
}