import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı girişinizi yapınız: ");
        String userName = scanner.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        String password = scanner.nextLine(), nPassword;

        double bakiye = 15;

        double parasalIslem;

        int islem;


        /*
        kullanıcı adı şifre kontrol
        hoşgeldin mesajı
            1-Para yatırma
            2-Para Çekme
            3-Bakiye Sorgula
            4-Çıkış Yap

        */

        /*
        if (userName.equals("Mask") && password.equals("Şevko")) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz!\n1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap\n5-Kullanıcı Adı Değiştir\n6-Şifre Değiştir");

            islem = scanner.nextInt();
            if (islem == 1) {
                System.out.print("Yatırılacak miktarı giriniz: ");
                parasalIslem = scanner.nextDouble();
                bakiye = bakiye + parasalIslem;
                System.out.println("Güncel bakiyeniz: " + bakiye);
                parasalIslem = 0.0;
            } else if (islem == 2) {
                System.out.println("Çekilecek miktarı giriniz: ");
                parasalIslem = scanner.nextDouble();
                if (parasalIslem>bakiye){
                    System.out.println("Bakiyeniz yetersiz! ");
                }else {
                    bakiye = bakiye - parasalIslem;
                    System.out.println("Güncel bakiyeniz: " + bakiye);
                    parasalIslem = 0.0;
                }
            } else if (islem == 3) {
                System.out.println("Bakiyeniz: " + bakiye);
            } else if (islem == 4) {
                System.out.println("Çıkış yapılıyor...");
            } else if (islem == 5) {
                System.out.print("Yeni kullanıcı adınızı giriniz: ");
                Scanner scanner1 = new Scanner(System.in);
                userName = scanner1.nextLine();
                System.out.println("Yeni kullanıcı adınız: " + userName);

            } else if (islem == 6) {
                System.out.print("Şifrenizi değiştirmek için güncel şifrenizi giriniz: ");
                Scanner scanner1 = new Scanner(System.in);
                nPassword = scanner1.nextLine();
                if (nPassword.equals(password)) {
                    System.out.print("Yeni şifrenizi giriniz: ");
                    password = scanner1.nextLine();
                    System.out.println("Yeni şifreniz: " + password);

                } else {
                    System.out.println("Girdiğiniz şifre yanlış!");
                }
            } else System.out.println("Hatalı giriş yaptınız!!!");

        } else System.out.println("Hatalı kullanıcı girişi!!!");

        */

        if (userName.equals("Mask") && password.equals("Ağla")) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz!\n1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
            islem = scanner.nextInt();
            switch (islem) {
                case 1:
                    System.out.println("Yatırılacak miktarı giriniz: ");
                    parasalIslem = scanner.nextInt();
                    bakiye = bakiye + parasalIslem;
                    System.out.println("Güncel bakiye: " + bakiye);
                    parasalIslem = 0.0;
                    break;
                case 2:
                    System.out.println("Çekilecek miktarı giriniz: ");
                    parasalIslem = scanner.nextInt();
                    if (parasalIslem > bakiye) {
                        System.out.println("Bakiye yetersiz!");
                        System.out.println("Güncel bakiye: " + bakiye);
                    } else if (parasalIslem <= bakiye) {
                        bakiye = bakiye - parasalIslem;
                        System.out.println("Güncel bakiye: " + bakiye);
                    } else {
                        System.out.println("Hatalı giriş yaptınız!");
                    }
                    break;
                case 3:
                    System.out.println(bakiye);
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Hatalı işlem...");
                    break;

            }
        }else{
            System.out.println("Kullanıcı Adı ya da Şifre Hatalı!!");
        }

    }
}
