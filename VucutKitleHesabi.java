import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double   Kilo ,Boy ,VucutKitleIndeksi;

        Scanner inp= new Scanner(System.in);
        System.out.print("Lütfen boyunuzu(metre cinsinden)giriniz: ");
        Boy = inp.nextInt();
        System.out.print("Lütfen kilonuzu giriniz: ");
        Kilo=inp.nextInt();
        VucutKitleIndeksi=Kilo/(Boy*Boy);
        System.out.print("Vücut Kitle İndeksiniz: "+VucutKitleIndeksi);
    }
}
