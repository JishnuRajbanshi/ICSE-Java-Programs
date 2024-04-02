import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Factorial
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Number - ");
        String input = Br.readLine();
        int n = Integer.parseInt(input);
        int s=1;
        for (int i=1;i<=n;i++)
        {
            s*=i;
        }
        System.out.println("Factorial of "+n+" is "+s);
    }
}