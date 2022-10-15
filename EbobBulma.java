import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2;
        System.out.println("Lütfen EBOB almak istedğiniz syıları giriniz: ");
        n1=input.nextInt();
        n2=input.nextInt();
        for(int i=1;i<=n1;i++){
            if(n1%i==0&&n2%i==0){
                System.out.println("Girilen Sayının Ebobları: "+i);
            }
        }
    }
}