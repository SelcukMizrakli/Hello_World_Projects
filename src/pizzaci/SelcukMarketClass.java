package pizzaci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelcukMarketClass {
    /*
     Ödev                                           == Yemek Şirketi Otomasyonu ==

        Program çalıştığında bizi menü karşılamalı
        1 Pizza Seçenekleri               (Pizza seçenekleri, ürünlerin fiyatları gelsin)             (pizza türleri: Sosisli,Peynirli,Ananaslı)
        2 Burger Seçenekleri           (Burger seçenekleri, ürünlerin fiyatları gelsin)           (burger türleri: King Beef, Whooper, Big King)
        3 Tatlı Seçenekleri                (Tatlı seçenekleri, ürünlerin fiyatları gelsin)                (tatlı türleri: Sufle, Donut, Cookie)
        4 İçecek Seçenekleri            (İçecek seçenekleri, ürünlerin fiyatları gelsin)            (içecek türleri: Kola,Fanta,Sprite)
        5 Sepeti görüntüle

        Seçime göre
        sepet kontrolü (Sepete ürün eklemek, ürün çıkartmak)
        ödeme ekranı
        Çıkış
        Çıkış yaptıktan sonra e-mail'e reklam göndersin (İlkin'in isteği)
     */
    static Scanner scanner = new Scanner(System.in);
    public static List<String> sepet = new ArrayList<>();
    public static List<Integer> sepetFiyat = new ArrayList<>();
    public static List<Integer> tekrarliUrununAdedi = new ArrayList<>();

    public static List<Integer> tekrarliUrununFiyati = new ArrayList<>();

    public static List<String > sahteSepet = new ArrayList<>();

    public static void main(String[] args) {

        boolean deger = true;
        while (deger) {
            System.out.println("Menünüzde ne istersiniz?\n1- Pizza\n2- Burger\n3- Tatlı\n4- İçecek\n5- Sepeti Görüntüle");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    SelcukMarketClass selcukMarketClass = new SelcukMarketClass(secim);
                    break;
                case 2:
                    selcukMarketClass = new SelcukMarketClass(secim);
                    break;
                case 3:
                    selcukMarketClass = new SelcukMarketClass(secim);
                    break;
                case 4:
                    selcukMarketClass = new SelcukMarketClass(secim);
                    break;
                case 5:
                    deger = false;
                    Integer sepetTutari = 0;
                    for (int i = 0; i < sepetFiyat.size(); i++) {

                        sepetTutari += sepetFiyat.get(i);
                    }
                    int urunSayac = 1;
                    String urunTekrari = null;
                    for (int i = 0; i < sepet.size(); i++) {
                        urunSayac = 1;
                        urunTekrari = sepet.get(i);
                        for (int j = 0; j < sepet.size(); j++) {
                            if (sepet.get(j).equalsIgnoreCase(urunTekrari)) {
                                urunSayac++;
                                sahteSepet.add(sepet.remove(j));
                                tekrarliUrununFiyati.add(sepetFiyat.remove(j));
                            }
                            tekrarliUrununAdedi.add(urunSayac);
                        }

                    }
                    System.out.println("Sepetinizdeki ürünler:\n");

                    for (int i = 0; i < sepet.size(); i++) {
                        System.out.println(sahteSepet.get(i) + " x" + tekrarliUrununAdedi.get(i) + " Tutar: " + tekrarliUrununFiyati.get(i) + "Tl\n");
                    }
                    System.out.println("Toplam tutar: " + sepetTutari +"TL\n\n E-mail'inize tecavüz ediyoruz(İlkin).");

                    break;
                default:
                    System.out.println("Hatalı giriş tekrar deneyiniz!");
            }

        }

    }

    public SelcukMarketClass(int secim1) {
        if (secim1 == 1) {
            while (true) {
                System.out.println("Pizza Tercihinizi Belirtiniz\n1- Sosisli Pizza 65Tl\n2- Peynirli Pizza 75Tl\n3- Ananaslı Pizza 85Tl");
                int secim2 = scanner.nextInt();
                switch (secim2) {
                    case 1:
                        sepet.add("Sosisli Pizza");
                        sepetFiyat.add(65);
                        break;
                    case 2:
                        sepet.add("Peynirli Pizza");
                        sepetFiyat.add(75);
                        break;
                    case 3:
                        sepet.add("Ananaslı Pizza");
                        sepetFiyat.add(85);
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;
            }
        } else if (secim1 == 2) {
            while (true) {
                System.out.println("Burger Tercihinizi Belirtiniz\n1- King Beef 65Tl\n2- Whooper 75Tl\n3- Big King 85Tl");
                int secim2 = scanner.nextInt();
                switch (secim2) {
                    case 1:
                        sepet.add("King Beef");
                        sepetFiyat.add(65);
                        break;
                    case 2:
                        sepet.add("Whooper");
                        sepetFiyat.add(75);
                        break;
                    case 3:
                        sepet.add("Big King");
                        sepetFiyat.add(85);
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;
            }
        } else if (secim1 == 3) {
            while (true) {
                System.out.println("Tatlı Tercihinizi Belirtiniz\n1- Sufle 25Tl\n2- Donut 35Tl\n3- Cookie 45Tl");
                int secim2 = scanner.nextInt();
                switch (secim2) {
                    case 1:
                        sepet.add("Sufle");
                        sepetFiyat.add(25);
                        break;
                    case 2:
                        sepet.add("Donut");
                        sepetFiyat.add(35);
                        break;
                    case 3:
                        sepet.add("Cookie");
                        sepetFiyat.add(45);
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;
            }
        } else if (secim1 == 4) {
            while (true) {
                System.out.println("İçecek Tercihinizi Belirtiniz\n1- Kola 25Tl\n2- Fanta 25Tl\n3- Sprite 25Tl");
                int secim2 = scanner.nextInt();
                switch (secim2) {
                    case 1:
                        sepet.add("Kola");
                        sepetFiyat.add(25);
                        break;
                    case 2:
                        sepet.add("Fanta");
                        sepetFiyat.add(25);
                        break;
                    case 3:
                        sepet.add("Sprite");
                        sepetFiyat.add(25);
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;
            }
        }

    }
}
