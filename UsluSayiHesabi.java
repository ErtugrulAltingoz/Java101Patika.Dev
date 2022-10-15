import java.util.Scanner;
public class Main {
    static void number(){
        int number;
        int buttonNumber;
        int total = 1;
        Scanner inp=new Scanner(System.in);
        System.out.println("Üs sayısını girin: ");
        number=inp.nextInt();
        System.out.println("Alt sayıyı girin: ");
        buttonNumber= inp.nextInt();
        for(int i=1;i<=buttonNumber;i++){
            total*=number;


        }
        if(number==0) {
            total=1;


        }
        if(buttonNumber==0){
            total=0;
        }
        System.out.println(total);
        }




    public static void main(String[] args) {
        number();

    }
}