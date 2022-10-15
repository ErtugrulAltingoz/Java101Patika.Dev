import java.util.Scanner;
public class Main {
    static void asal(int number) {
        int sayac = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sayac++;
            }
        }
        if (sayac == 2) {
            System.out.print(number + " Bir Asal Sayıdır!");
        } else if (number == 1) {
            System.out.print(number + " Bir Asal Sayıdır!");
        } else {
            System.out.print(number + " Bir Asal Sayı Değildir!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int x = scan.nextInt();
        asal(x);
    }
}
