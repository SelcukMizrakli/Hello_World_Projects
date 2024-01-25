import java.util.Objects;
import java.util.Scanner;

public class Login_Page {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username, password, un, ps;

        System.out.print("Kullanıcı Adı: ");
        username = scanner.nextLine();
        System.out.print("Şifre: ");
        password = scanner.nextLine();

        un = null;
        ps = password;

        System.out.println("Kullanıcı Adınızı giriniz: ");
        username = scanner.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        password = scanner.nextLine();

        if (password != ps) {
            System.out.println("Şifreniz yanlış!\nŞifrenizi Değiştirmek ister misiniz?");
            un = scanner.nextLine();
            if (un.equals("evet")) {
                System.out.print("Yeni Şifreyi giriniz: ");
                password = scanner.nextLine();
                while (Objects.equals(password, ps)) {
                    System.out.println("Şifreniz eski şifrenizle aynı olamaz!");
                    System.out.print("Yeni Şifreyi giriniz: ");
                    password = scanner.nextLine();
                }
                if (password != ps) {
                    System.out.println("Şifreniz Başarıyla Değiştirildi!");
                }
            } else {
                System.out.println("İşlem iptal ediliyor...");
            }

        }

    }
}
