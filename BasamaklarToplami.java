import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,number;
        int total=0;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        while (a!=0){
            number=a%10;
            total+=number;
            a=a/10;


        }
        System.out.println("Rakamalr Toplamı: "+total);
    }
}