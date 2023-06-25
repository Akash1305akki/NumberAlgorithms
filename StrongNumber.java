import java.util.*;

public class StrongNumber extends Thread{
    static Scanner sc = new Scanner(System.in);
    static int fact;
    static int ans;
    static int output;
    static int condition;

    public static void main(String[] Ak) throws Exception
    {
        recursiveCaller();

        if (output == condition){
            System.out.println("Your input is a \"Strong Number\"");
        }
        else {
            System.out.println("Your input is not a \"Strong Number\"");
        }
    }

    public static void recursiveCaller() throws Exception
    {
        System.out.println("Enter Your Input: ");
        int input = sc.nextInt();
        condition = input;

        if (input > 0) {
            while (input != 0) {
                fact = input % 10;
                if (fact > 0) {
                    ans = strongLogic();
                } else if (fact == 0) {
                    ans = 1;
                }
                output += ans;
                input = input / 10;
            }
        } else if (input == 0) {
            output =1;
        }
        else {
            System.out.println("You entered a invalid input... ");
            Thread.sleep(1000);
            recursiveCaller();
        }
    }

    public static int strongLogic()
    {
        int temp = 1;
        for(int i=1;i<fact+1;i++){
            temp = temp * i;
        }
        return temp;
    }
}