import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double Armut,Elma,Domates,Muz,Patlican,Toplam;
        Scanner input= new Scanner(System.in);
        System.out.print("Armut Kaç kilo?");
        Armut=input.nextInt();


        System.out.print("Elma Kaç kilo?");
        Elma=input.nextInt();


        System.out.print("Domates kaç kilo?");
        Domates=input.nextInt();


        System.out.print("Muz kaç kilo?");
        Muz=input.nextInt();


        System.out.print(" Patlıcan Kaç kilo?");
        Patlican=input.nextInt();

        Toplam=(Armut*2.14)+(Elma*3.67)+(Domates*1.11)+(Muz*0.95)+(Patlican*5.00);
        System.out.print("Tutar:  "+Toplam);




    }
}