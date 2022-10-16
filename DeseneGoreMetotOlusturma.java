import java.util.Scanner;
public class Main {
        static int negative(int x){
            if(x<=0){
                return x;
            }else {
                System.out.print(x+" ");
                return negative(x-5);
            }

        }
        static int positive(int x,int y){
            if(x>y){
                return x;

            }else{
                System.out.print(x+" ");
                return positive(x+5,y);
            }
        }

    public static void main(String[] args) {
            System.out.println("lütfen Sayı giriniz.");
            Scanner inp= new Scanner(System.in);

            int number=inp.nextInt();
            positive(negative(number),number);

    }

}
/* Girilen Sayıyı 0 ve negatif olana kadar 5 azaltır
sonra sayı kendisine eşit olana kadar 5 ekler.
Ex: 16 11 6 1 -4 1 6 11 16
 */
