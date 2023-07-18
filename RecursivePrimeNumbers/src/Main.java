import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scan.nextInt();

        if (isPrime(sayi))
            System.out.println(sayi + " sayısı ASALDIR !");
        else
            System.out.println(sayi + " sayısı ASAL değildir !");
    }

    static boolean isPrime(int sayi) {
        return isPrimeHelper(sayi, sayi / 2);
    }

    static boolean isPrimeHelper(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        } else {
            if (sayi % bolen == 0) {
                return false;
            } else {
                return isPrimeHelper(sayi, bolen - 1);
            }
        }
    }
}