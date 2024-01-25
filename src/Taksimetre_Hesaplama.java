import java.util.Scanner;

public class Taksimetre_Hesaplama {
    public static void main(String[] args) {

        //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        //
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        int km;
        double kmTl,ucret;
        kmTl = 2.20;

        ucret = 10.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz: ");
        km = scanner.nextInt();

        ucret = ucret+(km*kmTl);

        if (ucret<20){
            ucret = 20;
            System.out.println("Ücretiniz = "+ucret);
        }else{
            System.out.println("Ücretiniz = " + ucret);
        }


    }
}
