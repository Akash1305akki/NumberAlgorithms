import java.util.*;

public class AmstrongNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] Ak)
    {
        System.out.println("Enter your input: ");
        int input = sc.nextInt();
        int temp = 0 ,output = 0, condition = input;

        while (input > 0)
        {
            temp = input % 10;
            output =output + (int)Math.pow(temp,3);
            input = input / 10;
            temp = 0;
        }

        output = output + (int) Math.pow(input,3);

        if (output == condition)
        {
            System.out.println("The given number is an \"Amstrong Number\"");
        }
        else
        {
            System.out.println("The given number is not an \"Amstrong Number\"");
        }
    }
}
