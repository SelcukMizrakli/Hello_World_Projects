package constructorVerdigimOdevler;
import java.util.Scanner;
public class factorial_Constructor {
    Scanner scanner = new Scanner(System.in);
    factorial_Constructor(){
        System.out.print("Faktoryeli hesaplanacak sayiyi giriniz: ");
        int sayi = scanner.nextInt(),result = 1;

        for (int i = 1; i <= sayi; i++) {
            result *= i;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        factorial_Constructor obj = new factorial_Constructor();
    }
}
