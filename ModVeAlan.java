import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    static void calculation(){
        int a;
        int b;
        System.out.println("Dikdörgenin kenarlarını giriniz: ");
        Scanner inp=new Scanner(System.in);
          a=inp.nextInt();
         b=inp.nextInt();
        System.out.println((a+b)+"Çevresi");
        System.out.println((a*b)+"Alanı");
    }
    static void mod(){
        int a;
        int b;

        System.out.println("Mod Hesabı: ");
        Scanner inp=  new Scanner(System.in);
        a=inp.nextInt();
        b=inp.nextInt();
      double c=a%b;
      System.out.println("Modu: "+c);

    }
    public static void main(String[] args) {
        int select;
        Scanner inp=new Scanner(System.in);
        System.out.println("İşlem Seçiniz");
        System.out.println("1-Dikdörtgenin Çevre ve Alan Hesabı\n2-Mod Hesabı");
        select=inp.nextInt();
switch (select){
    case 1:
        calculation();
    case 2:
        mod();
}
    }
}