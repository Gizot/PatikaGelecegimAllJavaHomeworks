import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


                double n1,n2;
                int number, select;

                Scanner input = new Scanner(System.in);
                System.out.println("Enter the first number: ");
                n1 = input.nextDouble();
                System.out.println("Enter the first number: ");
                n2 = input.nextDouble();
                System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
                System.out.println("Enter the transaction number:");
                select = input.nextInt();

                switch(select){
                    case 1:
                        System.out.println("Result: " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println("Result: " + (n1 - n2));
                        break;
                    case 3:
                        System.out.println("Result: " + (n1 * n2));
                        break;
                    case 4:
                        System.out.println("Result: " + (n1 / n2));
                        break;

                }

                
              /*  if(select == 1) {
                    System.out.println("Result: " + (n1 + n2));
                }
                else if(select == 2){
                    System.out.println("Result: " + (n1 - n2));
                }
                else if( select == 3)
                    System.out.println("Result: " + (n1 * n2));
                else if (select == 4){
            System.out.println("Result: " + (n1 / n2));
                }
                else
                    System.out.println("Please, make sure you enter a valid value!"); */
        }


            
    }
