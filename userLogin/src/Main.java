import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "patika";
        String password = "java123";
        Scanner input = new Scanner(System.in);

        System.out.println("Username: ");
        username = input.nextLine();

        System.out.println("Password: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("********Giriş başarılı*******");
        } else {
            System.out.println("Hay aksi! \n Şifre yanlış! \n " +
                    "Şifrenizi sıfırlamak ister misiniz? \n (E/H)");
            String sifreSifirla = input.nextLine();

            if (sifreSifirla.equalsIgnoreCase("E")) {
                System.out.println("Yeni şifrenizi giriniz: ");
                String yeniSifre = input.nextLine();
                if (!yeniSifre.equals(password) && !yeniSifre.equals("java123")) {
                    password = yeniSifre;
                    System.out.println("********Şifre oluşturuldu*******");
                } else {
                    System.out.println("Şifre oluşturulamadı! " +
                            "\n Lütfen farklı bir şifre giriniz.");
                }
            } else {
                System.out.println("Giriş işlemi iptal edildi..");
            }
        }
    }
}
