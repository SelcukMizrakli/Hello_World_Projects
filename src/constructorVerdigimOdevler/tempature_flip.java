package constructorVerdigimOdevler;
import java.util.Scanner;
public class tempature_flip {
    Scanner scanner = new Scanner(System.in);
    tempature_flip() {
        while (true) {
            System.out.print("Hava Sıcaklıgını giriniz: ");
            double sicaklik = scanner.nextDouble();
            System.out.print("Donusturulecek turu giriniz: ");
            String tur = scanner.next();
            if (tur.equalsIgnoreCase("F")) {
                System.out.println("Hava sicakligi : " + sicaklik + "°C");
                sicaklik = sicaklik * 1.8 + 32;
                System.out.println("Hava sicakligi : " + sicaklik + "°F");
            } else if (tur.equalsIgnoreCase("C")) {
                System.out.println("Hava sicakligi : " + sicaklik + "°F");
                sicaklik = (sicaklik - 32) / 1.8;
                System.out.println("Hava sicakligi : " + sicaklik + "°C");
            }
            System.out.println("Programı bitirmek için 'T' tuşuna basınız!");
            String devam = scanner.next();
            if (devam.equalsIgnoreCase("T")){
                break;
            }
        }
    }
    public static void main(String[] args) {
        tempature_flip obj = new tempature_flip();
    }
}
