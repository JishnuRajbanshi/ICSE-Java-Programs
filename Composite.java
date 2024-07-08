import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Composite
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader Br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter the Number - ");
        String input = Br.readLine();
        int n = Integer.parseInt(input);
        
        int count=0;
        for (int i=1;i<n;i++)
        {
            if (n%i==0)
            {
                count++;
            }
        }

        if (count!=2)
        System.out.println("Composite Number");
        else
        System.out.println("Not Composite Number");
    }
}
        