import java.util.Scanner;

public class hipotenus_Hesaplama {
    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin hipotenüsünü hesaplayacağız!");
        System.out.println("A değerini giriniz: ");
        a = scanner.nextInt();
        System.out.println("B değerini giriniz: ");
        b = scanner.nextInt();


        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Hipotenüs Değeri: " + c);

/*
        int a,b,c;
        double u,alan;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin kenarlarını belirleyiniz!");
        System.out.print("A: ");
        a = scanner.nextInt();
        System.out.print("B: ");
        b = scanner.nextInt();
        System.out.print("C: ");
        c = scanner.nextInt();

        u = (a+b+c)/2;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı = " + alan);*/

    }
}
