import java.util.*;

public class XylemPhloem extends Thread{

    static Scanner sc = new Scanner(System.in);
    static int input;
    static int extremeSum;
    static int meanSum;

    public static void main(String[] Ak) throws Exception
    {
        recursiveCaller();

        if (extremeSum == meanSum)
        {
            System.out.println("The given input is a \"Xylem Number\"...");
        }
        else
        {
            System.out.println("The given input is a \"Phloem Number\"...");
        }
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
        extremeSum = n % 10;
        n = n / 10;

        while (n > 10)
        {
            meanSum = meanSum + (n % 10);
            n = n / 10;
        }
        extremeSum = extremeSum + (n % 10);
    }
}