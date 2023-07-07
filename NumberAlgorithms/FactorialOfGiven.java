import java.util.*;

public class FactorialOfGiven extends Thread{
    static Scanner sc = new Scanner(System.in);
    static int input;
    static int fact=1;

    public static void main(String[] Ak) throws Exception
    {
        recursiveCaller();

        System.out.println("The factorial product of given number is: "+fact);
    }

    public static void recursiveCaller() throws Exception
    {
        System.out.println("Enter you input: ");
        input = sc.nextInt();

        if (input==0)
        {
            fact = fact;
        } else if (input > 0) {
            for (int i=input;i>=1;i--)
            {
                fact = fact*i;
            }
        }
        else {
            System.out.println("You entered a invalid input... ");
            Thread.sleep(1000);
            recursiveCaller();
        }
    }
}