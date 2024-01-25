import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        int a, b, c,islem;

        System.out.println("2 değer giriniz.");
        System.out.print("1. değer: ");
        a = scanner.nextInt();
        System.out.print("2. değer: ");
        b = scanner.nextInt();

        System.out.print("Yapılcak işlemi giriniz: ");
        islem = scanner.nextInt();
        if (islem == 1) {
            c = a + b;
            System.out.println("Sonuç = " + c);
        } else if (islem == 2) {
            c = a - b;
            System.out.println("Sonuç = " + c);
        } else if (islem == 3) {
            c = a * b;
            System.out.println("Sonuç = " + c);
        } else if (islem == 4) {
            c = a / b;
            System.out.println("Sonuç = " + c);
        }else {
            System.out.println("Hatalı işlem");
        }
        */
        int a, b, secim;

        System.out.println("2 değer giriniz.");
        System.out.print("1. değer: ");
        a = scanner.nextInt();
        System.out.print("2. değer: ");
        b = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");

        System.out.print("Yapılcak işlemi giriniz: ");
        secim = scanner.nextInt();
        switch (secim) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case 4:
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
        }


    }
}
