import java.util.Scanner;

public class Hava_Durumu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Koşullar :
        //
        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        //Ödev
        //Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

        int sicaklik;

        System.out.println("Hava bugün kaç derece? ");
        sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Bugün kayak yapabilirsiniz!");
        } else if (sicaklik < 15) {
            if (sicaklik > 10) {
                System.out.println("Bugün pikniğe gidebilirsiniz!");
            }
            System.out.println("Bugün sinemaya gidebilirsiniz!");
        }else if (sicaklik < 25){
            System.out.println("Bugün pikniğe gidebilirsiniz!");
        }else if (sicaklik >= 25){
            System.out.println("Bugün yüzmeye gidebilirsiniz!");
        }


    }
}
