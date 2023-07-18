import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the digit number for Fibonacci Series: ");
        int elemanSayisi = scanner.nextInt();

        System.out.println(elemanSayisi + " Digits of Fibonnacci Series:");

        int num1 = 0;
        int num2 = 1;

        if (elemanSayisi >= 1) {
            System.out.print(num1 + " ");
        }

        if (elemanSayisi >= 2) {
            System.out.print(num2 + " ");
        }

        for (int i = 3; i <= elemanSayisi; i++) {
            int toplam = num1 + num2;
            System.out.print(toplam + " ");
            num1 = num2;
            num2 = toplam;
        }

    }
}