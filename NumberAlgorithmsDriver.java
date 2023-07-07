import java.util.*;

public class NumberAlgorithmsDriver extends Thread{
    static  Scanner sc = new Scanner(System.in);

    public static void main(String[] Ak) throws Exception{
        System.out.println("\t\t\tWelcome To My Number Algorithm's Application");
        Thread.sleep(1000);
        System.out.println("What Operation Do You Like To Perform...");
        Thread.sleep(1000);
        System.out.println("1. To Find Whether The Given number is Armstrong (or) Not.");
        Thread.sleep(500);
        System.out.println("2. To Find The Factorial Sum Of Digit's Present in Given Number.");
        Thread.sleep(500);
        System.out.println("3.. To Find The Factor's of Given Number.");
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

        int option = sc.nextInt();

        switch (option){
            case 1:{
                AmstrongNumber.main(Ak);
                break;
            }
            case 2:{
                FactorialOfGiven.main(Ak);
                break;
            }
            case 3:{
                FactorsOfGiven.main(Ak);
                break;
            }
            case 4:{
                FibonacciSeries.main(Ak);
                break;
            }
            case 5:{
                HappyNumber.main(Ak);
                break;
            }
            case 6:{
                LcmHcf.main(Ak);
                break;
            }
            case 7:{
                PerfectNumber.main(Ak);
                break;
            }
            case 8:{
                StrongNumber.main(Ak);
                break;
            }
            case 9:{
                XylemPhloem.main(Ak);
                break;
            }
            default:{
                System.out.println("Invalid Input...");
                Thread.sleep(1000);
                System.out.print("Run Again");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.println(".");
            }
            System.out.print("\t -");
            Thread.sleep(500);
            System.out.print("\t -");
            Thread.sleep(500);
            System.out.print("\t -");
            Thread.sleep(500);
            System.out.print("\t Thank You For Using My Application");
            Thread.sleep(500);
            System.out.print("\t -");
            Thread.sleep(500);
            System.out.print("\t -");
            Thread.sleep(500);
            System.out.print("\t -");
        }
    }
}