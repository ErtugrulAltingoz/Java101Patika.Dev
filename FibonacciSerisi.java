import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Eleman Sayısı Giriniz: ");
        n=input.nextInt();
        int n1=0,n2=1,n3;
        for(int i=1;i<=n;i++){

            n3=n1+n2;
            System.out.println(n1+"+"+n2+"="+n3);
            n1=n2;
            n2=n3;
        }





    }
}