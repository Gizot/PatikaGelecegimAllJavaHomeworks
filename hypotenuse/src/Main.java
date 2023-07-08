import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Aşağıya hipotenüsünü hesaplamak istediğiniz dik üçgenin dik kenar uzunluklarını girmeniz gerekmektedir.");
        System.out.println("Birinci dik kenar uzunluğunu giriniz:");
         a = input.nextDouble();
         System.out.println("İkinci dik kenar uzunluğunu giriniz:");
         b = input.nextDouble();

         c = Math.sqrt((a*a) + (b*b));
        System.out.println("Girdiğiniz kenar bilgilerine sahip dik üçgenin hipotenüsü: " + c + "'dir.");
        System.out.println("**********************************************************************************");





    }

}

