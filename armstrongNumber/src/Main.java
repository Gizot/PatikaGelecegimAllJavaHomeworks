import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number=input.nextInt();

        int tmpNumber=number;
        int toplam=0;
        while (tmpNumber != 0) {
            toplam += tmpNumber % 10;
            tmpNumber /= 10;
        }
        System.out.println("Sum of digits of a number: " + toplam);
    }
}