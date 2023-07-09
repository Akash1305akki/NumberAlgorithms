package NumberAlgorithms;

import java.util.Scanner;

public class OptionMatching {
    static Scanner sc = new Scanner(System.in);
    static int terminate=0;

    public static void main(String[] Ak) throws Exception{
        int terminate=0;

        while (Driver.loggedIn==true) {
            System.out.println("What Operation Do You Like To Perform...");
            Thread.sleep(1000);
            System.out.println("1. To Find Whether The Given number is Armstrong (or) Not.");
            Thread.sleep(500);
            System.out.println("2. To Find The Factorial Sum Of Digit's Present in Given Number.");
            Thread.sleep(500);
            System.out.println("3. To Find The Factor's of Given Number.");
            Thread.sleep(500);
            System.out.println("4. To Print First N Values of Fibonacci Series.");
            Thread.sleep(500);
            System.out.println("5. To Find The Given Number is Happy (or) Not.");
            Thread.sleep(500);
            System.out.println("6. To Find The L.C.M and H.C.F(G.C.D) of Given Number's.");
            Thread.sleep(500);
            System.out.println("7. To Find The Given Number is Perfect (or) Not.");
            Thread.sleep(500);
            System.out.println("8. To Find The Given Number is Strong (or) Not.");
            Thread.sleep(500);
            System.out.println("9. To Find The Given Number is Xylem (or) Phloem.");
            Thread.sleep(500);
            System.out.println("10. Logout.");

            int option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1: {
                    AmstrongNumber.main(Ak);
                    break;
                }
                case 2: {
                    FactorialOfGiven.main(Ak);
                    break;
                }
                case 3: {
                    FactorsOfGiven.main(Ak);
                    break;
                }
                case 4: {
                    FibonacciSeries.main(Ak);
                    break;
                }
                case 5: {
                    HappyNumber.main(Ak);
                    break;
                }
                case 6: {
                    LcmHcf.main(Ak);
                    break;
                }
                case 7: {
                    PerfectNumber.main(Ak);
                    break;
                }
                case 8: {
                    StrongNumber.main(Ak);
                    break;
                }
                case 9: {
                    XylemPhloem.main(Ak);
                    break;
                }
                case 10: {
                    System.out.println("This Process will erase all your credential details...");
                    System.out.println("Are you sure to logout..?\n" +
                            "Press '1' to Logout & Press '0' to Stay-in");
                    terminate = sc.nextInt();
                    System.out.println();

                    if ((terminate == 1) && (Driver.loggedIn == true)) {
                        Driver.loggedIn = false;
                        Driver.logout();
                    } else if (terminate == 0) {
                        break;
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid Input...");
                    Thread.sleep(1000);
                    System.out.print("Choose Again");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.println(".");
                    OptionMatching.main(Ak);
                }
            }
        }
    }
}
