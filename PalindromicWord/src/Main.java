import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Palindromik kelime, tersten okunduğunda aynı olan kelimedir.");
        System.out.println("Bir kelime girin ve program palindromik olup olmadığını kontrol etsin:");

        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " kelimesi palindromiktir.");
        } else {
            System.out.println(word + " kelimesi palindromik değildir.");
        }
    }
}
