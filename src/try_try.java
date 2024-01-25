import java.util.Scanner;

public class try_try {
    public static void main(String[] args)
    {
        /*
            0- Kullaniciya ait adres, telefon, meslek bilgileri tanimlayiniz.

            1- Kullanici kayit olacak &  giris yapacak (@gmail.com kullanilacak) .

            2- Kullanici bilgileri kontrol edilecek (@, @gmail.com, .com icermiyorsa hata mesaji verin ve tekrar deger girmesini isteyiniz.)

            3- Giris yaptiktan sonra kullaniciya yapmak istedigi islemi sorun

               3.1- kullanici adi (mail), sifre degistirme
                3.2- adres bilgilerisini guncelleme
                3.3- meslek bilgilerisini guncelleme
                3.4- iletisim bilgilerisini guncelleme
                3.5- Hatali giris sayisini yazdirma
                3.6- Kullanicinin yas bilgisini aliniz ve su ana kadar kac gun yasadigini hesaplayiniz
                3.7- Kullanicidan 5 sayi girmesini isteyiniz ve bu sayilari buyukten kucuge siralayiniz.(for ve while kullanarak 2 farklı method olusturunuz.)

                4- Cikis yap
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Telefon numaranızı giriniz");
        String telefon = scanner.nextLine();
        System.out.println("Lütfen Mesleğinizi giriniz");
        String meslek = scanner.nextLine();
        String adres;



        int flag = 0;
        do {

            int telefonsayac = 0;
            do {

                if(sayiMi(telefon)){
                    System.out.println("Lütfen Telefon numaranızı giriniz");
                    telefon = scanner.nextLine();
                }else{
                    System.out.println("Hata: Girdi sadece harf içermelidir.");
                    telefonsayac++;
                    flag++;
                }

            }while(telefonsayac != 0);

            int mesleksayac = 0;
            do {
                if (harfMi(meslek)) {
                    System.out.println("Lütfen Mesleğinizi giriniz");
                    meslek = scanner.nextLine();
                } else {
                    System.out.println("Hata: Girdi sadece harf içermelidir.");
                    mesleksayac++;
                    flag++;

                }
            }while(mesleksayac != 0);

            System.out.println("Tebrikler başarıyla kayıt oldunuz");
            System.out.println("adres : " );
        }while(flag != 0);
    }

    public static boolean harfMi(String str) {
        return str.matches("[a-zA-Z]+");
    }

    public static boolean sayiMi(String str) {
        return str.matches("\\d");
    }
}
