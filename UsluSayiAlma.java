import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.print("Üssü Alınacak Sayi: ");
        x=input.nextInt();
        System.out.println("Üs olacak Sayi: ");
        y=input.nextInt();
        int total=1;
        for(int i=1;i<=y;i++){
            total*=x;
        }
        System.out.println("Cevap:  "+total);
    }
}