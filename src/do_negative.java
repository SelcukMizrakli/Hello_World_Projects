import java.util.Scanner;
public class do_negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Bir sayı giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi<0){
                System.out.println("===-> " +sayi);
            } else if (sayi>0) {
                System.out.println(sayi + " <=-=> " + sayi * -1);
            } else {
                System.out.println("\nÇıkış yapılıyor...");
                break;
            }
        }

        /*
        0 girilene kadar girilen pozitif sayıların negatif versiyonunu ekrana yazan uygulamayı yapınız.

        Ekran çıktısı aşağıdaki gibi olabilir:

        Bir sayı giriniz: 3
        3 <=-=> -3
        Bir sayı giriniz: -3
        ===-> -3
        Bir sayı giriniz: 1
        1 <=-=> -1
        Bir sayı giriniz: -1
        ===-> -1
        Bir sayı giriniz: 0

        Çıkış yapılıyor...

        Process finished with exit code 0
         */
    }
}