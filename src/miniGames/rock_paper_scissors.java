package miniGames;
import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissors {
    rock_paper_scissors(){
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int pcGuess, userGuess, userWin = 0, pcWin = 0;
        String finish;
        while (true) {
            while (true) {
                System.out.print("\n\tSıradaki Hamlenizi Yapınız\n0- Taş | 1- Kağıt | 2- Makas\nOyuncu Hamlesi : ");
                userGuess = scanner.nextInt();
                pcGuess = rnd.nextInt(0,2);
                System.out.println("Bilgisayar Hamlesi : "+pcGuess);
                if (userGuess == pcGuess){
                    System.out.println("Bu tur berabere");
                } else if ((userGuess == 2 && pcGuess == 1) || (userGuess == 0 && pcGuess == 2) || (userGuess == 1 && pcGuess == 0)) {
                    System.out.println("Bu turu siz kazandınız");
                    userWin++;
                } else if ((userGuess == 1 && pcGuess == 2) || (userGuess == 2 && pcGuess == 0) || (userGuess == 0 && pcGuess == 1)) {
                    System.out.println("Bu turu bilgisayar kazandı");
                    pcWin++;
                } else System.out.println("Geçersiz giriş");
                if (pcWin >= 2) {
                    break;
                } else if (userWin >= 2){
                    break;
                }
            }
            if (pcWin > userWin || pcWin >= 2) {
                System.out.println("\n\tOyunu " + pcWin + " - " + userWin + " skorla bilgisayar kazandı\n");
                userWin = 0; pcWin = 0;
            } else if (userWin > pcWin || userWin >= 2){
                System.out.println("\n\tOyunu " + userWin + " - " + pcWin + " skorla siz kazandınız\n");
                userWin = 0; pcWin = 0;
            }
            System.out.println("\tDevam etmek için 'Q' tuşuna basınız.");
            finish = scanner.next();
            if (!finish.equalsIgnoreCase("Q")){
                break;
            }
        }
    }
    public static void main(String[] args) {
        rock_paper_scissors obj = new rock_paper_scissors();
    }
}