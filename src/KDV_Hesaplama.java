import java.util.Scanner;

public class KDV_Hesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sayi,kdv_sayi,kdv;
        kdv = 18/100.0;
        // KDV = %18
        System.out.println("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        if (sayi<=1000 && sayi>=0 ){
            kdv = 18/100.0;
        }else if (sayi>1000){
            kdv = 8/100.0;
        }

        kdv_sayi = sayi*kdv;
        // sayi = 10, kdv = 10*18/100 => kdv_sayi = 1.8
        sayi = sayi + kdv_sayi;
        // sayi = 10 + 1.8
        System.out.println("KDV\'li ücretiniz: " + sayi );
        System.out.println("KDV fiyatı = " + kdv_sayi);

    }
}
