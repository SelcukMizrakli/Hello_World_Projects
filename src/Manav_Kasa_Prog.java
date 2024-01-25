import java.util.Scanner;

public class Manav_Kasa_Prog {
    public static void main(String[] args) {
        //Java ile kullanıcıların manavdan almış oldukları ürünlerin
        //kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        //
        //Meyveler ve KG Fiyatları

        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL

        //Örnek Çıktı;

        //Armut Kaç Kilo ? :0
        //Elma Kaç Kilo ? :1
        //Domates Kaç Kilo ? :1
        //Muz Kaç Kilo ? :2
        //Patlıcan Kaç Kilo ? :3
        //Toplam Tutar : 21.68 TL

        Scanner scanner = new Scanner(System.in);
        double armut, elma, domates, muz, patlican, sonuc,kg;

        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;
        sonuc = 0;

        System.out.println("Armut Kaç Kilo ? :");
        kg = scanner.nextDouble();
        sonuc = sonuc + (kg * armut);
        System.out.println("Elma Kaç Kilo ? :");
        kg = scanner.nextDouble();
        sonuc = sonuc + (kg * elma);
        System.out.println("Domates Kaç Kilo ? :");
        kg = scanner.nextDouble();
        sonuc = sonuc + (kg * domates);
        System.out.println("Muz Kaç Kilo ? :");
        kg = scanner.nextDouble();
        sonuc = sonuc + (kg * muz);
        System.out.println("Patlıcan Kaç Kilo ? :");
        kg = scanner.nextDouble();
        sonuc = sonuc + (kg * patlican);
        System.out.println("Toplam Tutar : " + sonuc + "Tl");

    }
}
