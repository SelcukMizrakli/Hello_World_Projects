import java.util.Scanner;

public class Armstrong_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        /*
         407 --> (4^3)+ (0^3)+ (7^3) = 64+0+343 = 407 sonucunu veriyor.

         basamak sayısını bul.          407 / 10 > 0
         her basamaktaki değeri bul.    407 % 10 = 7

        */

        int basamakSayisi = 0, basDegeri = 0, number2, number3, number4 = number / 10, sonuc = 1, sonuc2 = 0;

        number3 = number % 10;

        number2 = number / 10;

        for (int i = 2; 0 < number2; i++) {
            basamakSayisi = i;
            number2 = number2 / 10;
        }


        
        for (int j = 0; j < basamakSayisi; j++) {

            basDegeri = number3;

            System.out.println("Basamak Sayısı: " + basamakSayisi + "\nDeğeri: " + basDegeri);

            number3 = number4 % 10;
            number4 = number4 / 10;

            for (int s = 1; s <= basamakSayisi; s++) {
                sonuc = basDegeri * sonuc;
                System.out.println(sonuc);
            }
            sonuc2 = sonuc + sonuc2;
            sonuc = 1;
        }
        if (sonuc2 == number) {
            System.out.println(number + " sayısı bir Armstrong Sayısıdır!");
        } else {
            System.out.println(number + " sayısı bir Armstrong Sayısı DEĞİLDİR!");
        }


    }
}
