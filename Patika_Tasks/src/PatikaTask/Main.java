package PatikaTask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math , fizik ,kimya , music, tarih , turkce ;


        System.out.print("Matematik notunuz : ");
        math = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = input.nextInt();

        System.out.print("Muzik notunuz : ");
        music = input.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = input.nextInt();

        int toplam =(math + fizik + music + tarih + turkce + kimya);

        double sonuc = toplam / 6.0;
        if (sonuc >= 60 ){
            System.out.println("Passed the Class");
            System.out.println("Your avarage is : " + sonuc);
        }else{
            System.out.println("Class not passed");
            System.out.println("Your avarage is : " + sonuc);
        }

    }
}
