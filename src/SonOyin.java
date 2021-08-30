import java.util.Random;
import java.util.Scanner;

public class SonOyin {
    public static void main(String[] args) {
        System.out.println("Men 0 dan 9 gacha bo'lgan son o'yladim. Bu sonni toping!");
        System.out.println("Sizda 3 ta imkoniyat bor");
        System.out.println("-------------------------------------------");
        Random random = new Random();
        int rand = random.nextInt(10);
//        System.out.println(rand);
        System.out.println("O'ylagan birinchi soningizni kiriting: ");
        Scanner sc = new Scanner(System.in);
        int son1 = sc.nextInt();
        if (son1== rand) {
            System.out.println("Siz yutdingiz!");
        } else {
            System.out.println("Afsuski noto'g'ri, sizda yana 2 imkoniyat bor...");
            System.out.println("O'ylagan ikkinchi soningizni kiriting: ");
            int son2 = sc.nextInt();
            if (son2 == rand) {
                System.out.println("Siz yutdingiz!");
            } else {
                System.out.println("Afsuski noto'g'ri, sizda yana 1 imkoniyat bor...");
                System.out.println("O'ylagan uchinchi soningizni kiriting: ");
                int son3 = sc.nextInt();
                if (son3 == rand) {
                    System.out.println("Siz yutdingiz!");
                } else {
                    System.out.println("Afsuski, siz yutqazdingiz! O'ylagan sonim " + rand + " edi . . .");
                }
            }
        }
    }
}
