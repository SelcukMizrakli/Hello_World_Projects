import java.util.Scanner;

public class Artik_Yil_Hesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;
        double result;

        System.out.print("Yıl Giriniz: ");
        year = scanner.nextInt();

        result = year % 4;
        if (result == 0) {

            result = year % 100;
            if (result == 0) {
                result = year % 400;
                if (result == 0) {
                    System.out.println(year + " bir artık yıldır!");
                } else {
                    System.out.println(year + " bir artık yıl değildir!");
                }
            } else {
                System.out.println(year + " bir artık yıldır!");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
