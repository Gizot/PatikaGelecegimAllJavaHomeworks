import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int weatherTemp ;
        Scanner input = new Scanner(System.in);
            System.out.println("Hava sıcaklığını giriniz:");
        weatherTemp = input.nextInt();

        if ( weatherTemp < 5 ) {
            System.out.println(" Kayak Yapabilirsiniz..\n \"Tabi ki kar duruyorsa!\" ");
        }else if (weatherTemp >= 5 && weatherTemp <= 25) {
            if (weatherTemp <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");

            }
            if (weatherTemp >= 10) {
                System.out.println("Pikniğe gidebilirsiniz.");

            }
        }else  {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    *******************1. ALTERNATİF *******************************
          */


      /*  int weatherTemp;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz:");
        weatherTemp = input.nextInt();

        String activity = (weatherTemp < 5) ? "Kayak Yapabilirsiniz.." :
                (weatherTemp >= 5 && weatherTemp <= 15) ? "Sinemaya gidebilirsiniz." :
                        (weatherTemp > 15 && weatherTemp <= 25) ? "Pikniğe gidebilirsiniz." :
                                (weatherTemp > 25) ? "Yüzmeye gidebilirsiniz." :
                                        "Geçersiz sıcaklık değeri.";

        System.out.println(activity);


        ********************* 2. ALTERNATİF ************************************

        int weatherTemp;
Scanner input = new Scanner(System.in);
System.out.println("Hava sıcaklığını giriniz:");
weatherTemp = input.nextInt();

String activity;

switch (true) {
    case (weatherTemp < 5):
        activity = "Kayak Yapabilirsiniz..";
        break;
    case (weatherTemp >= 5 && weatherTemp <= 15):
        activity = "Sinemaya gidebilirsiniz.";
        break;
    case (weatherTemp > 15 && weatherTemp <= 25):
        activity = "Pikniğe gidebilirsiniz.";
        break;
    case (weatherTemp > 25):
        activity = "Yüzmeye gidebilirsiniz.";
        break;
    default:
        activity = "Geçersiz sıcaklık değeri.";
        break;
}

System.out.println(activity);

**************************3. ALTERNATİF *************************************
   */

        int weatherTemp;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz:");
        weatherTemp = input.nextInt();

        String activity;

        switch (weatherTemp) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                activity = "Kayak Yapabilirsiniz..";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                activity = "Sinemaya gidebilirsiniz.";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                activity = "Pikniğe gidebilirsiniz.";
                break;
            default:
                activity = "Yüzmeye gidebilirsiniz.";
                break;
        }

        System.out.println(activity);



    }
    }
        
