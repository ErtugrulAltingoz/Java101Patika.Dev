import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, n, largestNumber = 0, smallestNumber = 0;
        System.out.println("Kaç sayı sıralamak istersin");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Sayı Giriniz:  " + i + ". numara");
            number = inp.nextInt();
            if (i == 1) {
                largestNumber = number;
                smallestNumber = number;
            } else {
                if (number > largestNumber) {
                    largestNumber = number;
                } else if (number < smallestNumber) {
                    smallestNumber = number;
                }
            }
        }
        System.out.println("En büyük sayı : " + largestNumber);
        System.out.println("En küçük sayı :" + smallestNumber);




}
}