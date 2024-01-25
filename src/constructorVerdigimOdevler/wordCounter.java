package constructorVerdigimOdevler;
import java.util.Scanner;
public class wordCounter {
    Scanner scanner = new Scanner(System.in);
    wordCounter(){
        System.out.println("Bir metin giriniz.");
        String metin = scanner.nextLine();
        System.out.println("Bu metinde " + (metin.split("\\s+").length) + " kelime bulunmakta.");
    }
    public static void main(String[] args) {
        wordCounter obj = new wordCounter();
    }
}