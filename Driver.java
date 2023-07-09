package NumberAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver extends Thread {
    static Scanner sc = new Scanner(System.in);
    static List<String> orginalID = new ArrayList<>();
    static List<Integer> orginalPassword = new ArrayList<>();
    static String userID;
    static int userPassword;
    static int limitCount=1;
    static boolean loggedIn= false;
    static boolean end = false;

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

        while (loggedIn == false && end == false) {
            System.out.println("Choose your path: \n" +
                    "1. Sign-Up\n" +
                    "2. Login-In");
            int choise = sc.nextInt();
            System.out.println();

            switch (choise) {
                case 1: {
                    signUp();
                    break;
                }
                case 2: {
                    if (orginalID.size()>0){
                        loginMethod();
                    }else {
                        System.out.println("No user has registered...");
                        System.out.println("Choose Sign-Up to register...");
                        System.out.println();
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid Operation Requested...\n" +
                            "Try Again...");
                    System.out.println();
                }
            }
        }
    }

    public static void signUp(){
        System.out.println("Let's Create Your Account...");
        System.out.print("Enter a user name: ");
        String inputID = sc.next();
        orginalID.add(inputID);

        System.out.print("Enter a Password: ");
        int inputPassword = sc.nextInt();
        orginalPassword.add(inputPassword);

        sc.nextLine();
        System.out.println();
    }

    public static void loginMethod() throws Exception {
        System.out.println("Enter Your Login Credentials");
        System.out.print("User ID: ");
        userID = sc.next();

        System.out.print("Password: ");
        userPassword = sc.nextInt();
        sc.nextLine();
        System.out.println();
        loginCheck(null);
    }

    public static void loginCheck(String[] Ak) throws Exception{
        if ((orginalID.contains(userID)) && (orginalPassword.contains(userPassword)) && (orginalID.indexOf(userID)==orginalPassword.indexOf(userPassword))) {
            loggedIn = true;
            OptionMatching.main(Ak);
        } else {
            limitCount++;
            if (limitCount<=3) {
                System.out.println("You Credentials are Invalid...");
                Thread.sleep(500);
                System.out.println("Try Again...");
                System.out.println();
                Thread.sleep(500);
                loginMethod();
            }else {
                System.out.println("Maximum Number of Attempts reached...");
                Thread.sleep(500);
                System.out.println("Try to Register a new account");
                System.out.println();
            }
        }
        limitCount=1;
    }

    public static void logout() throws Exception{
        end =true;
        System.out.println();
        System.out.print("\t -");
        Thread.sleep(500);
        System.out.print("\t -");
        Thread.sleep(500);
        System.out.print("\t -");
        Thread.sleep(500);
        System.out.print("\t Thank ");
        Thread.sleep(500);
        System.out.print("You ");
        Thread.sleep(500);
        System.out.print("for ");
        Thread.sleep(500);
        System.out.print("using ");
        Thread.sleep(500);
        System.out.print("My ");
        Thread.sleep(500);
        System.out.print("Application ");
        Thread.sleep(500);
        System.out.print("\t -");
        Thread.sleep(500);
        System.out.print("\t -");
        Thread.sleep(500);
        System.out.println("\t -");
    }
}
