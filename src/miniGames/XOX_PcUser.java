package miniGames;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class XOX_PcUser {
    /*
    hataları çöz.

        kazananı bulurkenki if'in içerisine doğru bir atama yap, pozitif kullanma o yüzden program direkt kapanıyor.

        if içerisine eğer oyuncu kazanırsa flag = true; yapılacak. if bloğunun dışına çıkıldığında ise yeni bir if açılacak ve
        positive'in true false olma durumunu flag = true ise false, değilse true şeklinde döndüreceğiz.

     */
    static int user1, pc;
    static boolean pozitif = true, casePozitif = true, bitis = true;
    static String kullaniciKarakteri;
    static String kullaniciKarakteri2;
    static String buraDolu = "         BURA DOLU";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        String[][] xox = {{"☺", "☻", "☺"}, {"☻", "☺", "☻"}, {"☺", "☻", "☺"}};
        for (int i = 0; i < xox.length; i++) {
            for (int j = 0; j < xox.length; j++) {
                System.out.print(xox[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Oyun başlatiliyor...\nYapmak istediğiniz hamleyi numlock kısmınızdan seçiniz(1,2,3,4,5,6,7,8,9)");
        while (pozitif) {
            System.out.println("Lütfen \'X\' veya \'O\' seçeneklerinden birisini seçiniz.");
            kullaniciKarakteri = scanner.next();
            if (kullaniciKarakteri.equalsIgnoreCase("X") || kullaniciKarakteri.equalsIgnoreCase("O")) {
                if (kullaniciKarakteri.equalsIgnoreCase("X")) {
                    kullaniciKarakteri = kullaniciKarakteri.toUpperCase();
                    kullaniciKarakteri2 = "O";
                } else {
                    kullaniciKarakteri2 = "X";
                    kullaniciKarakteri = kullaniciKarakteri.toUpperCase();
                }
                break;
            }
        }

        int sayacUser1 = 0, sayacUser2 = 0, sayac = 0;
        while (pozitif) {
            for (int i = 0; i <= 5; i++) {
                while (casePozitif) {
                    boolean isFinish = true;
                    do {
                        try {
                            System.out.print("1. Oyuncu hamlenizi giriniz: ");
                            user1 = scanner.nextInt();
                            isFinish = false;
                        } catch (InputMismatchException a) {
                            System.err.println("Sayı gir gabak kafa");
                            System.out.println();
                            scanner.next();
                        }
                    } while (isFinish);

                    switch (user1) {
                        case 1:
                            if (xox[0][0].equalsIgnoreCase("O") || xox[0][0].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[0][0] = kullaniciKarakteri;
                                sayacUser1++;
                                sayac++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 2:
                            if (xox[0][1].equalsIgnoreCase("O") || xox[0][1].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[0][1] = kullaniciKarakteri;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 3:
                            if (xox[0][2].equalsIgnoreCase("O") || xox[0][2].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[0][2] = kullaniciKarakteri;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 4:
                            if (xox[1][0].equalsIgnoreCase("O") || xox[1][0].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[1][0] = kullaniciKarakteri;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 5:
                            if (xox[1][1].equalsIgnoreCase("O") || xox[1][1].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[1][1] = kullaniciKarakteri;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 6:
                            if (xox[1][2].equalsIgnoreCase("O") || xox[1][2].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[1][2] = kullaniciKarakteri;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 7:
                            if (xox[2][0].equalsIgnoreCase("O") || xox[2][0].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[2][0] = kullaniciKarakteri;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 8:
                            if (xox[2][1].equalsIgnoreCase("O") || xox[2][1].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[2][1] = kullaniciKarakteri;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 9:
                            if (xox[2][2].equalsIgnoreCase("O") || xox[2][2].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[2][2] = kullaniciKarakteri;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        default:
                            System.err.println("Düzgün sayı gir");
                    }
                }

                int g = 0, h = 0;
                if (bitis) {
                    if (xox[g][h].equalsIgnoreCase(xox[g][h + 1]) && xox[g][h].equalsIgnoreCase(xox[g][h + 2])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Oyuncu Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g + 1][h].equalsIgnoreCase(xox[g + 1][h + 1]) && xox[g + 1][h].equalsIgnoreCase(xox[g + 1][h + 2])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Oyuncu Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g + 2][h].equalsIgnoreCase(xox[g + 2][h + 1]) && xox[g + 2][h].equalsIgnoreCase(xox[g + 2][h + 2])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Oyuncu Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g][h].equalsIgnoreCase(xox[g + 1][h]) && xox[g][h].equalsIgnoreCase(xox[g + 2][h])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Oyuncu Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g][h + 1].equalsIgnoreCase(xox[g + 1][h + 1]) && xox[g][h + 1].equalsIgnoreCase(xox[g + 2][h + 1])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Oyuncu Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g][h + 2].equalsIgnoreCase(xox[g + 1][h + 2]) && xox[g + 1][h + 2].equalsIgnoreCase(xox[g + 2][h + 2])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Oyuncu Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g][h].equalsIgnoreCase(xox[g + 1][h + 1]) && xox[g][h].equalsIgnoreCase(xox[g + 2][h + 2])) {
                        if (sayac > 3) {
                            if (sayacUser1 >= sayacUser2) {
                                System.err.println("Oyunu Oyuncu Kazandı!!!");
                                bitis = false;
                            }
                        }
                    } else if (xox[g][h + 2].equalsIgnoreCase(xox[g + 1][h + 1]) && xox[g][h + 2].equalsIgnoreCase(xox[g + 2][h])) {
                        if (sayac > 3) {
                            if (sayacUser1 >= sayacUser2) {
                                System.err.println("Oyunu Oyuncu Kazandı!!!");
                                bitis = false;
                            }
                        }
                    }
                }

                if (sayac == 9 && bitis) {
                    System.err.println("Oyun Berabere");
                    System.exit(0);
                } else if (!bitis) {
                    pozitif = false;
                } else casePozitif = true;

                while (casePozitif) {
                    pc = rnd.nextInt(1, 9);
                    System.out.println("Bilgisayar hamlesi : " + pc);
                    switch (pc) {
                        case 1:
                            if (xox[0][0].equalsIgnoreCase("O") || xox[0][0].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[0][0] = kullaniciKarakteri2;
                                sayacUser1++;
                                sayac++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 2:
                            if (xox[0][1].equalsIgnoreCase("O") || xox[0][1].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[0][1] = kullaniciKarakteri2;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 3:
                            if (xox[0][2].equalsIgnoreCase("O") || xox[0][2].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[0][2] = kullaniciKarakteri2;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 4:
                            if (xox[1][0].equalsIgnoreCase("O") || xox[1][0].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[1][0] = kullaniciKarakteri2;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 5:
                            if (xox[1][1].equalsIgnoreCase("O") || xox[1][1].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[1][1] = kullaniciKarakteri2;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 6:
                            if (xox[1][2].equalsIgnoreCase("O") || xox[1][2].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[1][2] = kullaniciKarakteri2;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 7:
                            if (xox[2][0].equalsIgnoreCase("O") || xox[2][0].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[2][0] = kullaniciKarakteri2;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 8:
                            if (xox[2][1].equalsIgnoreCase("O") || xox[2][1].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[2][1] = kullaniciKarakteri2;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        case 9:
                            if (xox[2][2].equalsIgnoreCase("O") || xox[2][2].equalsIgnoreCase("X")) {
                                System.out.println(buraDolu);
                            } else {
                                xox[2][2] = kullaniciKarakteri2;
                                sayac++;
                                sayacUser1++;
                                for (int z = 0; z < xox.length; z++) {
                                    for (int j = 0; j < xox.length; j++) {
                                        System.out.print(xox[z][j]);
                                    }
                                    System.out.println("");
                                }
                                casePozitif = false;
                            }
                            break;
                        default:
                            System.err.println("PC brain DEAD");
                    }
                }

                if (bitis) {
                    if (xox[g][h].equalsIgnoreCase(xox[g][h + 1]) && xox[g][h].equalsIgnoreCase(xox[g][h + 2])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Bilgisayar Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g + 1][h].equalsIgnoreCase(xox[g + 1][h + 1]) && xox[g + 1][h].equalsIgnoreCase(xox[g + 1][h + 2])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Bilgisayar Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g + 2][h].equalsIgnoreCase(xox[g + 2][h + 1]) && xox[g + 2][h].equalsIgnoreCase(xox[g + 2][h + 2])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Bilgisayar Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g][h].equalsIgnoreCase(xox[g + 1][h]) && xox[g][h].equalsIgnoreCase(xox[g + 2][h])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Bilgisayar Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g][h + 1].equalsIgnoreCase(xox[g + 1][h + 1]) && xox[g][h + 1].equalsIgnoreCase(xox[g + 2][h + 1])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Bilgisayar Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g][h + 2].equalsIgnoreCase(xox[g + 1][h + 2]) && xox[g + 1][h + 2].equalsIgnoreCase(xox[g + 2][h + 2])) {
                        if (sayacUser1 >= sayacUser2) {
                            System.err.println("Oyunu Bilgisayar Kazandı!!!");
                            bitis = false;
                        }
                    } else if (xox[g][h].equalsIgnoreCase(xox[g + 1][h + 1]) && xox[g][h].equalsIgnoreCase(xox[g + 2][h + 2])) {
                        if (sayac > 3) {
                            if (sayacUser1 >= sayacUser2) {
                                System.err.println("Oyunu Bilgisayar Kazandı!!!");
                                bitis = false;
                            }
                        }
                    } else if (xox[g][h + 2].equalsIgnoreCase(xox[g + 1][h + 1]) && xox[g][h + 2].equalsIgnoreCase(xox[g + 2][h])) {
                        if (sayac > 3) {
                            if (sayacUser1 >= sayacUser2) {
                                System.err.println("Oyunu Bilgisayar Kazandı!!!");
                                bitis = false;
                            }
                        }
                    }
                }

                if (!bitis) {
                    pozitif = false;
                } else casePozitif = true;
            }
        }
    }
}