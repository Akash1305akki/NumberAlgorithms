public class HeartinPattern1 {

    public static void main(String[]  Ak)
    {
        for (int i=1;i<=8;i++){
            for (int j=1;j<=9;j++){
                if (i==1 && (j==3 || j==7)){
                    System.out.print(" * ");
                } else if (i==2 && j%2==0) {
                    System.out.print(" * ");
                } else if ((i==3) && (j==1 || j==5 || j==9)) {
                    System.out.print(" * ");
                } else if ((i==4) && (j==1 || j==9)) {
                    System.out.print(" * ");
                } else if (i==5 && (j==2 || j==8)) {
                    System.out.print(" * ");
                } else if (i==6 && (j==3 || j==7)) {
                    System.out.print(" * ");
                } else if (i==7 && (j==4 || j==6
                )) {
                    System.out.print(" * ");
                }else if ((i==8) && (j==5)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}