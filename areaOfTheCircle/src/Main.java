import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double r,centerAngle,a;

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the \"Radius\" value: ");
        r= input.nextDouble();
        System.out.println("Please, enter the \"Center Angle\" value: ");
        centerAngle= input.nextDouble();
        a =Math.PI * Math.pow(r, 2) * ( centerAngle)/360;
        System.out.println("Area of the circle: " + a);
        
        

    }
}