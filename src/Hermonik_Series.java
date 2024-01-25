import java.util.Scanner;

public class Hermonik_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int hermonikSeries = scanner.nextInt();
        double sonuc = 0.0;

        for (int i = 1; i<=hermonikSeries;i++){

            sonuc += (1.0/i);

        }
        System.out.println(sonuc);

    }
}
