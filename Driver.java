package NumberAlgorithms;

import java.awt.*;
import java.util.*;

public class Driver extends Thread {
    static Scanner sc = new Scanner(System.in);
    static String orginalID = "admin", userID;
    static int orginalPassword = 12345, userPassword;
    static boolean loginAttempt = true;


    public static void main(String[] Ak) throws Exception {
        System.out.print("\t -");
        Thread.sleep(500);
        System.out.print("\t -");
        Thread.sleep(500);
        System.out.print("\t -");
        Thread.sleep(500);
        System.out.print("\t Welcome ");
        Thread.sleep(500);
        System.out.print("To ");
        Thread.sleep(500);
        System.out.print("My ");
        Thread.sleep(500);
        System.out.print("Number ");
        Thread.sleep(500);
        System.out.print("Application ");
        Thread.sleep(500);
        System.out.print("\t -");
        Thread.sleep(500);
        System.out.print("\t -");
        Thread.sleep(500);
        System.out.println("\t -");

        System.out.println();
        Thread.sleep(1000);
        loginCheck();

        while (loginAttempt == true) {
            if ((orginalID.equals(userID)) && (orginalPassword == userPassword)) {
                OptionMatching.main(Ak);
            } else {
                System.out.println("You Credentials are Invalid...");
                Thread.sleep(500);
                System.out.println("Try Again...");
                System.out.println();
                Thread.sleep(500);
                loginCheck();
            }
        }
    }

    public static void loginCheck() throws Exception {
        System.out.println("Enter Your Login Credentials");
        System.out.println();

        System.out.print("User ID: ");
        userID = sc.nextLine();

        System.out.print("Password: ");
        userPassword = sc.nextInt();
        sc.nextLine();
        System.out.println();
    }
}