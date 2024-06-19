import java.io.*;

public class Add 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first number: ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.print("Enter the second number: ");
        int num2 = Integer.parseInt(br.readLine());
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}