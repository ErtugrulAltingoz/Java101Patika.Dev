import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double derece;
        Scanner input = new Scanner(System.in);
      System.out.print("Hava Bugün Kaç Derece: ");
      derece=input.nextDouble();
      if(derece<5){
          System.out.print("Kayak yapamak için süper bir gün: "+derece);
      }
      else if(derece<15&&derece>5){
          System.out.print("Sinemaya  gitmek için süper bir gün: "+derece);
      }else if(derece>15&&derece<25){
          System.out.print("Piknik yapamak için süper bir gün: "+derece);
      }else if(derece>25){
          System.out.print("Yüzmek için süper bir gün: "+derece);
      }

    }
}