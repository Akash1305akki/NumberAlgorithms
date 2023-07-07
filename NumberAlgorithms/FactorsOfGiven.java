import java.util.*;

public class FactorsOfGiven extends Thread{

    static Scanner sc = new Scanner(System.in);

    static String fact = "1";

    public static void main(String[] Ak) throws Exception {
        recursiveCaller();
    }

    public static void recursiveCaller() throws Exception
    {
        System.out.println("Enter your input: ");
        int input = sc.nextInt();
        String output;

        if (input > 0)
        {
            if (input == 1)
            {
                System.out.println("The factors of "+input+" are: "+fact);
            }
            else if (input > 1) {
                output = factorsLogic(input);
                System.out.println("The factors of "+input+" are: "+output);
            }
        }
        else {
            System.out.println("You entered a invalid input... ");
            Thread.sleep(1000);
            recursiveCaller();
        }
    }

    public static String factorsLogic(int n)
    {
        for (int i = 2;i <= n;i++)
        {
            if (n % i==0)
            {
                fact = fact+" "+i;
            }
        }
        return fact;
    }
}