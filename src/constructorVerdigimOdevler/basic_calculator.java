package constructorVerdigimOdevler;
import java.util.Scanner;
public class basic_calculator {
    Scanner scanner = new Scanner(System.in);
    basic_calculator() {
        System.out.println("2 Sayi giriniz");
        System.out.print("1. Sayi: ");
        int sayi = scanner.nextInt();
        System.out.print("2. Sayi: ");
        int sayi2 = scanner.nextInt();
        System.out.println("Yapilacak islemi seciniz\n1- Toplama\n2- Cikarma\n3- Carpma\n4- Bolme");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                System.out.println(sayi + sayi2);
                break;
            case 2:
                if (sayi >= sayi2) {
                    System.out.println(sayi - sayi2);
                } else System.out.println(sayi2 - sayi);
                break;
            case 3:
                System.out.println(sayi*sayi2);
                break;
            case 4:
                if (sayi2==0){
                    System.out.println("Bu işlem gerçekleştirilemiyor");
                }else System.out.println(sayi/sayi2);
                break;
            default:
                System.out.println("Hatalı giriş");
        }
    }
    public static void main(String[] args) {
        basic_calculator obj = new basic_calculator();
    }
}
