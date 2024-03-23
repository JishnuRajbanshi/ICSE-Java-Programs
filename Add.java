import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Add {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first number: ");
        String input1 = reader.readLine();
        int num1 = Integer.parseInt(input1);

        System.out.print("Enter the second number: ");
        String input2 = reader.readLine();
        int num2 = Integer.parseInt(input2);

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}