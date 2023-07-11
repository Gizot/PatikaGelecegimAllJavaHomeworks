import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int weatherTemp ;
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
                    
        }
    }
        
