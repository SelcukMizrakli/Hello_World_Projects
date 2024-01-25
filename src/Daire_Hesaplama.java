import java.util.Scanner;

public class Daire_Hesaplama {
    public static void main(String[] args) {
        //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        //
        //Alan Formülü : π * r * r;
        //
        //Çevre Formülü : 2 * π * r;
        /*
        Scanner scanner = new Scanner(System.in);
        int r;
        double pi = 3.14,alan,cevre;

        System.out.print("Daire yarı çapını giriniz: ");
        r = scanner.nextInt();
        alan = pi*r*r;
        cevre = 2*pi*r;
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);

        */

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //
        //𝜋 sayısını = 3.14 alınız.
        //
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        Scanner scanner = new Scanner(System.in);
        int r;
        double pi = 3.14,a,alan;

        System.out.println("Dairenin yarı çapını giriniz: ");
        r = scanner.nextInt();
        System.out.println("Dairenin merkez açısını giriniz: ");
        a = scanner.nextDouble();

        alan = (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı: " + alan);

    }
}
