package miniGames;

import java.sql.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class XOX {
    static String kullaniciKarakteri;
    static int user1, user2;
    static boolean pozitif = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    /*
        ☺☻☺     010     010     011
        ☻☺☻     000     100     100
        ☺☻☺     000     000     000
        1. oyuncu vs oyuncu
        2. oyuncu vs pc

        çift zar at 1. oyuncuyu belirle
     */
        String[][] xox = {{"☺", "☻", "☺"}, {"☻", "☺", "☻"}, {"☺", "☻", "☺"}};
        for (int i = 0; i < xox.length; i++) {
            for (int j = 0; j < xox.length; j++) {
                System.out.print(xox[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Oyun başlatiliyor...\nHamle yapacağınız zaman alanı numlock kısmınızdan seçiniz(1,2,3,4,5,6,7,8,9)");
        while (pozitif) {
            System.out.println("Lütfen \'X\' veya \'O\' seçeneklerinden birisini seçiniz.");
            kullaniciKarakteri = scanner.next();
            if (kullaniciKarakteri.equalsIgnoreCase("X") || kullaniciKarakteri.equalsIgnoreCase("O")) {
                break;
            }
        }
        int sayacUser1 = 0, sayacUser2 = 0, sayac = 0;
        while (pozitif) {
            for (int i = 0; i <= 5; i++) {

                while (pozitif) {
                    System.out.print("1. Oyuncu hamlenizi giriniz: ");
                    user1 = scanner.nextInt();
                    switch (user1) {
                        case 1:
                            if (xox[0][0].equalsIgnoreCase("O") || xox[0][0].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[0][0] = "X";
                                sayacUser1++;
                                sayac++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 2:
                            if (xox[0][1].equalsIgnoreCase("O") || xox[0][1].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[0][1] = "X";
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 3:
                            if (xox[0][2].equalsIgnoreCase("O") || xox[0][2].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[0][2] = "X";
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 4:
                            if (xox[1][0].equalsIgnoreCase("O") || xox[1][0].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[1][0] = "X";
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 5:
                            if (xox[1][1].equalsIgnoreCase("O") || xox[1][1].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[1][1] = "X";
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 6:
                            if (xox[1][2].equalsIgnoreCase("O") || xox[1][2].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[1][2] = "X";
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 7:
                            if (xox[2][0].equalsIgnoreCase("O") || xox[2][0].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[2][0] = "X";
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 8:
                            if (xox[2][1].equalsIgnoreCase("O") || xox[2][1].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[2][1] = "X";
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 9:
                            if (xox[2][2].equalsIgnoreCase("O") || xox[2][2].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[2][2] = "X";
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız");
                    }
                }

                if (sayac == 9) {
                    System.out.println("Oyun Berabere");
                    pozitif = false;
                } else {
                    pozitif = true;
                }
                int g = 0, h = 0;
                if (xox[g][h].equalsIgnoreCase("x") || xox[g][h].equalsIgnoreCase("o")){
                    if (xox[g][h].equalsIgnoreCase(xox[g][h + 1])) {
                        if (xox[g][h].equalsIgnoreCase(xox[g][h + 2])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 1. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g + 1][h].equalsIgnoreCase(xox[g + 1][h + 1])) {
                        if (xox[g + 1][h].equalsIgnoreCase(xox[g + 1][h + 2])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 1. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g + 2][h].equalsIgnoreCase(xox[g + 2][h + 1])) {
                        if (xox[g + 2][h].equalsIgnoreCase(xox[g + 2][h + 2])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 1. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g][h].equalsIgnoreCase(xox[g + 1][h])) {
                        if (xox[g][h].equalsIgnoreCase(xox[g + 2][h])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 1. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g][h + 1].equalsIgnoreCase(xox[g + 1][h + 1])) {
                        if (xox[g][h + 1].equalsIgnoreCase(xox[g + 2][h + 1])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 1. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g][h + 2].equalsIgnoreCase(xox[g + 1][h + 2])) {
                        if (xox[g][h + 2].equalsIgnoreCase(xox[g + 2][h + 2])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 1. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g][h].equalsIgnoreCase(xox[g + 1][h + 1])) {
                        if (xox[g][h].equalsIgnoreCase(xox[g + 2][h + 2])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 1. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    }
                }

                while (pozitif) {
                    System.out.print("2. Oyuncu hamlenizi giriniz: ");
                    user2 = scanner.nextInt();

                    switch (user2) {
                        case 1:
                            if (xox[0][0].equalsIgnoreCase("O") || xox[0][0].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[0][0] = "O";
                                sayac++;
                                sayacUser2++;
                                pozitif = false;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                            }
                            break;
                        case 2:
                            if (xox[0][1].equalsIgnoreCase("O") || xox[0][1].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[0][1] = "O";
                                sayac++;
                                sayacUser2++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 3:
                            if (xox[0][2].equalsIgnoreCase("O") || xox[0][2].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[0][2] = "O";
                                sayac++;
                                sayacUser2++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 4:
                            if (xox[1][0].equalsIgnoreCase("O") || xox[1][0].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[1][0] = "O";
                                sayac++;
                                sayacUser2++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 5:
                            if (xox[1][1].equalsIgnoreCase("O") || xox[1][1].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[1][1] = "O";
                                sayac++;
                                sayacUser2++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 6:
                            if (xox[1][2].equalsIgnoreCase("O") || xox[1][2].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[1][2] = "O";
                                sayac++;
                                sayacUser2++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 7:
                            if (xox[2][0].equalsIgnoreCase("O") || xox[2][0].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[2][0] = "O";
                                sayac++;
                                sayacUser2++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 8:
                            if (xox[2][1].equalsIgnoreCase("O") || xox[2][1].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[2][1] = "O";
                                sayac++;
                                sayacUser2++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        case 9:
                            if (xox[2][2].equalsIgnoreCase("O") || xox[2][2].equalsIgnoreCase("X")) {
                                System.out.println("Geçersiz hamle!");
                            } else {
                                xox[2][2] = "O";
                                sayac++;
                                sayacUser2++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                pozitif = false;
                            }
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız");
                    }
                }

                if (sayac == 9) {
                    System.out.println("Oyun Berabere");
                    pozitif = false;
                } else {
                    pozitif = true;
                }
                g = 0;
                h = 0;
                if (xox[g][h].equalsIgnoreCase("x") || xox[g][h].equalsIgnoreCase("o")){
                    if (xox[g][h].equalsIgnoreCase(xox[g][h + 1])) {
                        if (xox[g][h].equalsIgnoreCase(xox[g][h + 2])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 2. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g + 1][h].equalsIgnoreCase(xox[g + 1][h + 1])) {
                        if (xox[g + 1][h].equalsIgnoreCase(xox[g + 1][h + 2])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 2. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g + 2][h].equalsIgnoreCase(xox[g + 2][h + 1])) {
                        if (xox[g + 2][h].equalsIgnoreCase(xox[g + 2][h + 2])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 2. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g][h].equalsIgnoreCase(xox[g + 1][h])) {
                        if (xox[g][h].equalsIgnoreCase(xox[g + 2][h])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 2. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g][h + 1].equalsIgnoreCase(xox[g + 1][h + 1])) {
                        if (xox[g][h + 1].equalsIgnoreCase(xox[g + 2][h + 1])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 2. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g][h + 2].equalsIgnoreCase(xox[g + 1][h + 2])) {
                        if (xox[g][h + 2].equalsIgnoreCase(xox[g + 2][h + 2])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 2. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    } else if (xox[g][h].equalsIgnoreCase(xox[g + 1][h + 1])) {
                        if (xox[g][h].equalsIgnoreCase(xox[g + 2][h + 2])) {
                            if (sayacUser1 == sayacUser2) {
                                System.out.println("Oyunu 2. Oyuncu Kazandı!!!");
                                break;
                            }
                        }
                    }
                }

            }
        }
    }
}
