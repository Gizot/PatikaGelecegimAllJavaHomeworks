import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int sayi1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int sayi2 = scanner.nextInt();

        int ebob = hesaplaOBEB(sayi1, sayi2);
        int ekok = hesaplaOKEK(sayi1, sayi2);

        System.out.println("OBEB: " + ebob);
        System.out.println("OKEK: " + ekok);
    }

    public static int hesaplaOBEB(int sayi1, int sayi2) {
        while (sayi2 != 0) {
            int kalan = sayi1 % sayi2;
            sayi1 = sayi2;
            sayi2 = kalan;
        }
        return sayi1;
    }

    public static int hesaplaOKEK(int sayi1, int sayi2) {
        int ebob = hesaplaOBEB(sayi1, sayi2);
        int ekok = (sayi1 * sayi2) / ebob;
        return ekok;
    }
}
