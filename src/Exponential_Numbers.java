import java.util.Scanner;

public class Exponential_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, sonuc = 1;

        System.out.print("Lütfen bir sayı giriniz: ");
        number1 = scanner.nextInt();

        System.out.print("Hesaplamak istediğiniz katı giriniz:");
        number2 = scanner.nextInt();

        for (int i = 1; i <= number2; i++) {
            sonuc = number1 * sonuc;
        }

        System.out.println("Sonuç: " + sonuc);

    }
}
