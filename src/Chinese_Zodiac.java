import java.util.Scanner;

public class Chinese_Zodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear, result;
        String animal;

        System.out.print("Doğum yılınızı giriniz: ");
        birthYear = scanner.nextInt();

        result = birthYear % 12;
        System.out.println(result);

        switch (result)
        {
            case 0: animal = "Maymun";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            case 1: animal = "Horoz";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            case 2: animal = "Köpek";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            case 3: animal = "Domuz";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            case 4: animal = "Fare";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            case 5: animal = "Öküz";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            case 6: animal = "Kaplan";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            case 7: animal = "Tavşan";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            case 8: animal = "Ejderha";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            case 9: animal = "Yılan";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            case 10: animal = "At";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            case 11: animal = "Koyun";
                System.out.println("Çin Zodyağı Burcunuz : " + animal );
                break;
            default:
                System.out.println("Hatalı giriş!");
                break;
        }
    }
}
