import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dudeney
{
    public static void main(String[] args) throws IOException
    
    {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Number - ");
        String input = Br.readLine();
        int n = Integer.parseInt(input);
        int c=n,r,s=0,o=1;
        while (n!=0)
        {
            r=n%10;
            s+=r;
            o=s*s*s;
            n/=10;
        }
        if (c==o)
        System.out.println("Dudeney Number");
        else
        System.out.println("Not Dudeney Number");
    }
}