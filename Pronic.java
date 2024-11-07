import java.util.Scanner;

public class Pronic
{
    public static void main (String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num,pronic=0;
        System.out.print("Enter the Number - ");
        num = sc.nextInt();
        sc.close();
        
        
        for (int i = 1; i < num ; i++) 
        {
            if (i * (i + 1) == num) 
            {
                pronic++;
                break;
            }
        }
        
        if (pronic==1)
            System.out.println("Pronic Number");
        else
            System.out.println("Not Pronic Number");
    }
}