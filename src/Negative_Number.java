import java.util.Scanner;

public class Negative_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi, toplam = 0;
        /*
        do {
            System.out.print("Bir sayı giriniz: ");
            sayi = scanner.nextInt();
            if (sayi % 2 == 1) {
                toplam = toplam + sayi;
            }
            System.out.println("Toplam :" + toplam);
        } while (sayi >= 0);
        */
        do {
            System.out.print("Bir sayı giriniz: ");
            sayi = scanner.nextInt();
            if (sayi % 4 == 0) {

                toplam = toplam + sayi;
            }
            System.out.println("Toplam :" + toplam);
        } while (sayi % 2 == 0);

    }
}
