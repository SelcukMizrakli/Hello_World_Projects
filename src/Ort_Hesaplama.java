import java.util.Scanner;

public class Ort_Hesaplama {
    public static void main(String[] args) {
         /*System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);
        mat = scanner.nextInt();
        */

        int mat, turkce, fen, sosyal, not, bolen = 0;

        double ort;

        String secim;
        Scanner scanner = new Scanner(System.in);

        int notList[] = new int[4];

        do {
            System.out.println("Matematik notunuzu giriniz: ");
            not = scanner.nextInt();

            if (not < 0 || not >= 100) {
                mat = 0;
                notList[0] = mat;
            } else {
                mat = not;
                notList[0] = mat;
            }

            System.out.println("Türkçe notunuzu giriniz: ");
            not = scanner.nextInt();

            if (not < 0 || not >= 100) {
                turkce = 0;
                notList[1] = turkce;
            } else {
                turkce = not;
                notList[1] = turkce;
            }

            System.out.println("Fen notunuzu giriniz: ");
            not = scanner.nextInt();

            if (not < 0 || not >= 100) {
                fen = 0;
                notList[2] = fen;
            } else {
                fen = not;
                notList[2] = fen;
            }

            System.out.println("Sosyal notunuzu giriniz: ");
            not = scanner.nextInt();

            if (not < 0 || not >= 100) {
                sosyal = 0;
                notList[3] = sosyal;
            } else {
                sosyal = not;
                notList[3] = sosyal;
            }

            System.out.println("Notları tekrar girmek ister misiniz?\nEvet için \"evet\"\nHayır için \"hayır\" yazınız.");

            secim = scanner.next();

            if (secim.equalsIgnoreCase("evet")) {
                System.out.println("Lütfen Notları Tekrar Giriniz!");
            }

        } while (!(secim.equalsIgnoreCase("hayır")));

        for (int i = 0; i < 4; i++) {
            if (notList[i] > 0) {
                bolen++;
            }
        }
        ort = (double) (mat + turkce + fen + sosyal) / bolen;

        System.out.println("Derslerin Ortalaması: " + ort);

        /*
        if (0<= ort && ort < 60) System.out.println("Kaldınız");
        else System.out.println("Geçtiniz");*/

        if (0 <= ort && ort < 60) {
            System.out.println("Kaldınız");
        } else if (ort >= 60 && ort < 101) {
            System.out.println("Geçtiniz");
        } else {
            System.out.println("Notunuz Hatalı Girilmiştir");
        }

    }
}