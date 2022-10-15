import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        int total=0;

        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayi Giriniz: ");
        a=inp.nextInt();
        for(int i=1;i< a;i++){
            if(a%i==0){
                System.out.println(i);
                total=total+i;

            }


        }
        if(total==1){
            System.out.println("Mükemmel sayı değildir.");
        } else if (total==a) {
            System.out.println("Mükemmel sayıdır.");
            
        }
        else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}