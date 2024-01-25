import java.util.Scanner;

public class Ucak_Bilet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        // Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        // Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        //
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        //                              Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        int age, type;
        double km, total,total2;
        System.out.println("Gidilecek mesafeyi giriniz!");
        km = scanner.nextDouble();

        total = km * 0.10;
        total2 = 0;

        System.out.println("Yaşınızı Giriniz!");
        age = scanner.nextInt();

        if ((age <= 0) || (km <= 0)) {
            System.out.println("0'dan küçük değer giremezsiniz!");
        } else {
            if (age < 12) {
                total2 = total / 2;
                total = total - total2;
            } else if ((age >= 12) && (age < 24)) {
                total2 = total * ((double) 10/100 );
                total = total - total2;
            } else if (age >= 65) {
                total2 = total2 * ((double) 20/100 );
                total = total - total2;
            }

            System.out.println("Yolculuk Tipi Seçiniz:\n1-) Tek Yön\n2-) Gidiş-Dönüş");
            type = scanner.nextInt();

            switch (type){
                case 1:
                    System.out.println("Biletiniz tek yön olarak ayarlanmıştır!");
                    System.out.println("Bilet fiyatı: " + total);
                    break;
                case 2:
                    System.out.println("Biletiniz Gidiş-Dönüş olarak ayarlanmıştır!");
                    total2 = ( total * ((double) 20/100));
                    total = (total - total2) * 2;
                    System.out.println("Bilet fiyatı: " + total);
                    break;
                default:
                    System.out.println("Hatalı Veri Girdiniz !");

            }

        }

    }
}
