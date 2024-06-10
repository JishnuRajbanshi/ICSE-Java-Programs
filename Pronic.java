import java.util.Scanner;

public class Pronic
{
    public static void main () 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number - ");
        int num = sc.nextInt();
        sc.close();
        
        boolean isPronic = false;
        
        for (int i = 1; i <= num - 1; i++) 
        {
            if (i * (i + 1) == num) 
            {
                isPronic = true;
                break;
            }
        }
        
        if (isPronic)
            System.out.println("Pronic Number");
        else
            System.out.println("Not a Pronic Number");
    }
}