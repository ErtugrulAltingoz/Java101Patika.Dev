import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        Scanner input=new Scanner(System.in);
        System.out.print("Yılı Giriniz");
        year=input.nextInt();
        if(year%4==0){
            System.out.print("Artık Yıldır: "+year+" Yılı");
        }else{
            System.out.println("Artık Yıl Değildir: "+year+" Yılı");
        }

    }
}