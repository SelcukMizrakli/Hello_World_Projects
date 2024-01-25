import java.util.Scanner;

public class Sayi_Siralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s1, s2, s3;

        System.out.println("3 tane sayı giriniz!");
        System.out.print("1. Sayı: ");
        s1 = scanner.nextInt();
        System.out.print("2. Sayı: ");
        s2 = scanner.nextInt();
        System.out.print("3. Sayı: ");
        s3 = scanner.nextInt();

        if (s1 > s2 && s1 > s3) {
            if (s2 > s3) {
                System.out.println(s1 + " > " + s2 + " > " + s3);
            } else {
                System.out.println(s1 + " > " + s3 + " > " + s2);
            }
        } else if (s2 > s1 && s2 > s3) {
            if (s1 > s3) {
                System.out.println(s2 + " > " + s1 + " > " + s3);
            } else {
                System.out.println(s2 + " > " + s3 + " > " + s1);
            }
        } else {
            if (s1 > s2) {
                System.out.println(s3 + " > " + s1 + " > " + s2);
            } else {
                System.out.println(s3 + " > " + s2 + " > " + s1);
            }
        }
    }
}
