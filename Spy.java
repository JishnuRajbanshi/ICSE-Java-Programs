import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Spy
{
    public static void main (String [] args) throws IOException
    {
        BufferedReader Br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter the Number - ");
        String input = Br.readLine();
        int n = Integer.parseInt (input);
        int s=0,o=1,r;
        while (n!=0)
        {
            r=n%10;
            s+=r;
            o*=r;
            n/=10;
        }
        if (s==o)
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
    }
}