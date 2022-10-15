import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double Tutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafe Kaç KM? :");
        mesafe=input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas=input.nextInt();
        System.out.println("Gidiş ise 1 e gidiş-dönüş ise 2 yi seçiniz: ");
        yolculukTipi=input.nextInt();
        if(yolculukTipi==1){
            Tutar=(mesafe)*0.10;
            System.out.println("Ödenecek Tutar: "+Tutar+"TL");
        }else if(yolculukTipi==2){
            Tutar=(mesafe)*0.10*2;
            System.out.println("Ödenecek Tutar: "+Tutar+"Tl");
        }else{
            System.out.println("Hatalı Seçim Yaptınız!");
        }
        if(yas<12&&yolculukTipi==1){
            Tutar=(mesafe*0.10)/2;
            System.out.println("İndirimli  Tutar: "+Tutar+"TL");
        }else if(yas<12&&yolculukTipi==2) {
            Tutar=(mesafe)*0.10;
            System.out.println("İndirimli Tutar: "+Tutar+"Tl");
        }
        if(yas>12&&yas<24&&yolculukTipi==1){
            Tutar=(mesafe)*0.10;
            Tutar-=Tutar*0.10;
            System.out.println("Ödenecek Tutar"+Tutar+"Tl");
        }else if(yas>12&&yas<24&&yolculukTipi==2){
            Tutar=(mesafe)*0.10*2;
            Tutar-=Tutar*0.10;
            System.out.println("Ödenecek Tutar: "+Tutar+"TL");

        }
        if(yas>65&&yolculukTipi==1){
            Tutar=(mesafe)*0.10;
            Tutar-=Tutar*0.30;
            System.out.println("Ödenecek Tutar: "+Tutar+"Tl");
        }else if(yas>65&&yolculukTipi==2){
            Tutar=(mesafe)*0.10*2;
            Tutar-=Tutar*0.30;
            System.out.println("Ödenecek Tutar: "+Tutar+"Tl");

        }

}
}