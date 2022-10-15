import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,r,a;
        Scanner input=new Scanner(System.in);
        System.out.print("Sırasıyla 2 sayı giriniz  : ");
        n=input.nextInt();
        int total=1;
        for(int i=1;i<=n;i++){
            total=total*i;
            System.out.println("Birinci Sayının Faktöriyeli: "+total);

            }
        System.out.println("Lütfen İkinci Sayıyı Giriniz: ");
        r=input.nextInt();
        int Total=1;
        for(int j=1;j<=r;j++){
            Total=Total*j;
            System.out.println("İkinci Sayının Faktöriyeli: "+Total);

        }
        a=1;
        a=n-r;
        int Total1 =1;
        for(int k=1;k<=a;k++){
            Total1=Total1*k;
            System.out.println("İki sayının Fark faktöriyeli: "+Total1);
        }

            int Combinasyon;
        Combinasyon=total/(Total*Total1);
        System.out.println("Kombinasyon Sonucunuz: "+Combinasyon);
        }


    }
