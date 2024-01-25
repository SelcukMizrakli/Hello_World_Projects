import java.util.Scanner;

public class Factorial_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, number2, number3 = 1, number4 = 1, sonuc, i, k, number5, j,t=1;
        System.out.print("Bir sayı giriniz: ");
        number = scanner.nextInt();
        for (i = 1; i <= number; i++) {
            number3 = i * number3;
            System.out.println("Girilen sayının fakötriyeli: " + number3);
        }
        System.out.print("Başka bir sayı giriniz: ");
        number2 = scanner.nextInt();
        for (k = 1; k <= number2; k++) {
            number4 = k * number4;
            System.out.println("Girilen sayının fakötriyeli: " + number4);
        }

        number5 = number - number2;

        for (j = 1; j <= number5; j++) {
            t = t * j;
        }

        sonuc = number3 / (number4 * (t));
        System.out.println(sonuc);
    }
}
