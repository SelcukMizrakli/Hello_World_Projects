import java.time.LocalDate;
import java.util.Scanner;

public class dogumGunuGunSoyleme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gun,ay,yil;
        System.out.println("Sırasıyla Aşağıdaki bilgileri doldurunuz Doğduğunuz " );

        LocalDate dogumGun = LocalDate.of(2002,12,28);
        System.out.println(dogumGun.getDayOfWeek());
    }
}
