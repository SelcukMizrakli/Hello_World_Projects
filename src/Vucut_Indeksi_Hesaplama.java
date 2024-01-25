import java.util.Scanner;

public class Vucut_Indeksi_Hesaplama {
    public static void main(String[] args) {
        //Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        //Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        //Formül
        //Kilo (kg) / Boy(m) * Boy(m)

        //Çıktı ==>
        //Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        //Lütfen kilonuzu giriniz : 105
        //Vücut Kitle İndeksiniz : 35.49215792320173

        Scanner scanner = new Scanner(System.in);

        double kg, m, sonuc;

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        m = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        kg = scanner.nextDouble();

        sonuc = kg / (m * m);
        System.out.println("Vücut Kitle İndeksiniz :" + sonuc);


    }
}
