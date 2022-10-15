import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        double result=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Bir  Sayi Giriniz: ");
        a=input.nextInt();
        for (int i=1;i<=a;i++){
            result+=(1.0/i);

        }
        System.out.println("Harmonik Değeri:  "+result);

    }
}