import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();
        recursiveOperation(n);
    }

    static void recursiveOperation(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            System.out.print("\n");
            return;
        }

        recursiveOperation(n - 5);

        if (n > 0) {
            System.out.print(n + " ");
        }
    }
}