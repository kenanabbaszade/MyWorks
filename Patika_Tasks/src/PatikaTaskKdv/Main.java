package PatikaTaskKdv;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        int b ;
        int c ;

        System.out.print(" 1 ci Kateti giriniz : ");
        a = input.nextInt();
        System.out.print(" 2 ci Kateti giriniz : ");
        b = input.nextInt();
        System.out.print("Hipotenusu giriniz : ");
        c = input.nextInt();
        double u = (a + b + c) / 2.0;
        double alan  = u*(u - a)*(u - b)*(u -c);
        System.out.println("Alan : "+ alan);
    }
}
