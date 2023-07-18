import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        int n,r;
        int total1=1;
        int total2=1;
        int total3=1;

        System.out.print("Enter the number n: ");
        n=input.nextInt();

        System.out.print("Enter the number r: ");
        r=input.nextInt();

        int x=n-r;
        for (int i=1;i<=n;i++){
            total1*=i;
        }

        for (int j=1;j<=r;j++){
            total2*=j;
        }

        for (int k=1;k<=x;k++){
            total3*=k;
        }

        int combination = total1 / (total2*total3);

        System.out.println("C(" + n + "," + r + ") = " + combination);
    }
}