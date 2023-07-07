import java.util.*;
import java.lang.*;

public class HappyNumber extends Thread{

    static Scanner sc = new Scanner(System.in);
    static int input;
    static int sum;
    static int fact;

    public static void main(String[] Ak) throws Exception
    {
        recursiveCaller();
    }

    public static void recursiveCaller() throws Exception
    {
        System.out.println("Enter your input: ");
        input = sc.nextInt();

        if (input > 0)
        {
            logic(input);
        }
        else
        {
            System.out.println("Your input is invalid....");
            Thread.sleep(1000);
            recursiveCaller();
        }
    }

    public static void logic(int n)
    {
        sum = 0;
        while (n > 0)
        {
            fact = n % 10;
            sum = sum + (int) Math.pow(fact,2);
            n = n / 10;
        }

        if(sum == 1)
        {
            System.out.println("The given input is a \"Happy Number\"");
        } else if (sum == 4) {
            System.out.println("The given input is not a \"Happy Number\"");
        } else
        {
            logic(sum);
        }
    }
}