import java.util.*;

public class FibonacciSeries {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] Ak)
    {
        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();
        int n1 = 0, n2 = 1, n3;

        System.out.println(n1);
        System.out.println(n2);

        for(int i=2;i<N;++i)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
