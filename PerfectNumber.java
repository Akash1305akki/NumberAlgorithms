import java.util.*;

public class PerfectNumber extends Thread {

    static Scanner sc = new Scanner(System.in);

    static int fact=1;
    static int input;

    public static void main(String[] Ak) throws Exception
    {
        recursiveCaller();

        if (fact==input)
        {
            System.out.println("The given input is a \"Perfect Number\" " );
        }
        else
        {
            System.out.println("The given input is not a \"Perfect Number\" " );
        }
    }

    public static void recursiveCaller() throws Exception
    {
        System.out.println("Enter yoy input: ");
        input = sc.nextInt();

        if (input > 0)
        {
            perfectLogic(input);
        }
        else
        {
            System.out.println("Your input is invalid....");
            Thread.sleep(1000);
            recursiveCaller();
        }
    }

    public static void perfectLogic(int n)
    {
        for (int i = 2;i < n;i++)
        {
            if (n % i==0)
            {
                fact = fact+i;
            }
        }
    }
}