import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int [] array={15,12,788,1,-1,-778,2,0};
        int sayi;

        Scanner inp=new Scanner(System.in);
        int max=array[0];
        int min=array[0];
        System.out.println(Arrays.toString(array));
        System.out.println("Bir sayı Giriniz: ");
        sayi=inp.nextInt();
        Arrays.sort(array);
        for(int i:array){
            if(i<sayi){
                min=i;
            }
        }
        for(int i:array){
            if(i>sayi){
                max=i;
                break;
            }

    }
        System.out.println("Girilen sayıya yakın en büyük sayı: "+max);
        System.out.println("Girilen sayıya yakın en küçük sayı: "+min);
}}