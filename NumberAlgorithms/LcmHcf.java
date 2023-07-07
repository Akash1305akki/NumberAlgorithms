import java.util.*;

public class LcmHcf {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static int count;
    static int gcd;
    static int lcm=1;

    public static void main(String[] Ak)
    {
        System.out.println("Enter the number of input's to process: ");
        n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n;i++)
        {
            System.out.println("Enter the input value: ");
            arr[i] = sc.nextInt();
            lcm = lcm * arr[i];
        }

        Arrays.sort(arr);
        for (int i = 1;i <= arr[n-1];i++)
        {
            for(int j = 0;j<n;j++)
            {
                if (arr[j] % i==0)
                {
                    count = count + 1;
                }
            }
            if (count==n)
            {
                gcd = i;
                count = 0;
            }
            else
            {
                count = 0;
            }
        }
        lcm = lcm / gcd;
        System.out.println("The GCD of given numbers is: "+gcd);
        System.out.println("The LCM of given numbers is: "+lcm);
    }
}
