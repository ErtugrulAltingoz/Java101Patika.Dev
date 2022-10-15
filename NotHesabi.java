import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int s1,s2;
        double ort;
        Scanner input=new Scanner(System.in);
        System.out.print("Birici sınav notunuzu giriniz: ");
        s1=input.nextInt();
        System.out.println("İkinci sınav notunuzu giriniz: ");
        s2=input.nextInt();
        ort=(s1+s2)/2;
        if(ort>55){
            System.out.println("GEÇTİNİZ TEBRİKLER:"+ort);

        }else {
            System.out.println("KALDINIZ DAHA ÇOK ÇALIŞMALISINIZ!:"+ort);
        }
    }
}
