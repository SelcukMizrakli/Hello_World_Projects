import java.util.Scanner;

public class Multiples_Of_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi;
        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("2'nin katları bitti!\n4 ve 5'in ortak katları yazılıyor...");
        for (int j = 1; j < sayi; j++) {
            if ((j % 4 == 0) && (j % 5 == 0)) {
                System.out.println(j);
            }
        }

    }
}
