import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Harshad
{
    public static void main (String [] args) throws IOException
    {
        BufferedReader Br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter the Number - ");
        String input = Br.readLine();
        int n = Integer.parseInt(input);
        int r,s=0,c=n;
        while (n!=0)
        {
            r=n%10;
            s+=r;
            n/=10;
        }
        if (c%s==0)
        System.out.println("Harshad Number");
        else
        System.out.println("Not Harshad Number");
    }
}