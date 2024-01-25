import java.util.Scanner;

public class DENEMETAHTASI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int basSay = (sayi  + "").length();
        int toplam = 0;
        int girilenSayi = sayi;


        for (int i = 0; i <basSay ; i++) {
            toplam = toplam+(girilenSayi%10);
            girilenSayi/=10;

        }
        System.out.println("Girilen sayı: " + sayi + " \nRakamlar toplamı: " + toplam);
    }
}
