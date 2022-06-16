import java.util.Scanner;

public class odev18 {
    public static void main(String[] args) {
        int a, topla4k = 0, topla2k = 0, toplam;

        Scanner input = new Scanner(System.in);

        System.out.println("Hosgeldiniz!!!");

        do {
            System.out.println("Lutfen sayi giriniz : ");
            a = input.nextInt();
            if (a % 2 == 0 && a % 4 == 0) {
                topla4k += a;
            }
            if (a % 2 == 0 && a % 4 != 0) {
                topla2k += a;
            }
        } while (a % 2 == 0);
        toplam = topla2k + topla4k;

        System.out.println("Toplam : " + toplam);
    }
}
