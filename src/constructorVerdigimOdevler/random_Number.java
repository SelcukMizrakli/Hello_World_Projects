package constructorVerdigimOdevler;
import java.util.Random;
import java.util.Scanner;
public class random_Number {
    Scanner scanner = new Scanner(System.in);
    random_Number() {
        while (true) {
            boolean kalem = true;
            if (kalem) {
                System.out.println("Bir deger araligi giriniz: ");
                int sayi1 = scanner.nextInt();
                int sayi2 = scanner.nextInt(), sayiRND;
                Random rnd = new Random();
                if (sayi1 > sayi2) {
                    sayiRND = rnd.nextInt(sayi2, sayi1);
                } else if (sayi1 == sayi2) {
                    sayiRND = sayi1;
                } else {
                    sayiRND = rnd.nextInt(sayi1, sayi2);
                }
                System.out.println(sayiRND);
            } else {
                break;
            }
            System.out.println("Devam etmek icin 'Q' degerini giriniz.");
            String devam = scanner.next();
            if (devam.equalsIgnoreCase("Q")){
                kalem = true;
            } else kalem = false;
        }
    }
    public static void main(String[] args) {
        random_Number obj = new random_Number();
    }
}
