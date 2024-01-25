import java.util.Scanner;

public class Burc_Hesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //
        //Kova Burcu : 22 Ocak - 19 Şubat
        //
        //Balık Burcu : 20 Şubat - 20 Mart
        //
        //Koç Burcu : 21 Mart - 20 Nisan
        //
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //
        //Yay Burcu : 22 Kasım - 21 Aralık
        //
        //Ödev
        //Aynı örneği switch-case kullanmadan yapınız.

        int day;
        String month, burc = "";
        boolean isError = false;

        System.out.println("Ayınız: ");
        month = scanner.nextLine();
        System.out.println("Doğum gününüz: ");
        day = scanner.nextInt();

        if (month.equalsIgnoreCase("Ocak")) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc = "Kova";//22 ocak ve sonrası
                } else {
                    burc = "Oğlak";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Şubat")) {
            if (day >= 1 && day <= 28) {
                if (day > 19) {
                    burc = "Balık";//20 şubat ve sonrası
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Mart")) {
            if (day >= 1 && day <= 31) {
                if (day > 20) {
                    burc = "Koç";//21 mart ve sonrası
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Nisan")) {
            if (day >= 1 && day <= 30) {
                if (day > 20) {
                    burc = "Boğa";//21 nisan ve sonrası
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Mayıs")) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc = "İkizler";//22 mayıs ve sonrası
                } else {
                    burc = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Haziran")) {
            if (day >= 1 && day <= 30) {
                if (day > 22) {
                    burc = "Yengeç";//23 haziran ve sonrası
                } else {
                    burc = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Temmuz")) {
            if (day >= 1 && day <= 31) {
                if (day > 22) {
                    burc = "Aslan";//23 Temmuz ve sonrası
                } else {
                    burc = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Ağustos")) {
            if (day >= 1 && day <= 31) {
                if (day > 22) {
                    burc = "Başak";//23 ağustos ve sonrası
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Eylül")) {
            if (day >= 1 && day <= 30) {
                if (day > 22) {
                    burc = "Terazi";//23 eylül ve sonrası
                } else {
                    burc = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Ekim")) {
            if (day >= 1 && day <= 31) {
                if (day > 22) {
                    burc = "Akrep";//23 ekim ve sonrası
                } else {
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Kasım")) {
            if (day >= 1 && day <= 30) {
                if (day > 21) {
                    burc = "Yay";//22 kasım ve sonrası
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Aralık")) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;
                System.out.println("Hatalı Giriş!");
            }
        }

        if (isError){
            System.out.println("Hatalı Giriş!");
        }else {
            System.out.println("Burcunuz: " + burc);
        }

    }
}
