import java.util.Scanner;

public class Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi, j = 0;
        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        double ort = 0;

        for (int k = 0; k < sayi; k++) {
            if (k%2 == 0){
                System.out.println("Çift Sayılar: " + k);
            }
        }

        for (int i = 1; i < sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.println("Ortak sayı: " + i);
                ort = ort + i;
                j++;
            }
        }
        ort = ort / j;
        System.out.println(ort);
    }
}
