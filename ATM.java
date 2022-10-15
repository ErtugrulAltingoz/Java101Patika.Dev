import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password;
        int select ;
        int total=2000;
        int pay;
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        userName=input.nextLine();
        System.out.print("Şifre: ");
        password=input.nextLine();
         {
            if (userName.equals("erto") && password.equals("erto123")) {
                System.out.println("KodBanka Hoş Geldiniz.");
                System.out.println("Lütfen İşlem Seçiniz.");
                System.out.println("1-Para Yatırma.");
                System.out.println("2-Para Çekme.");
                System.out.println("3-Bakiye Sorgulama.");
                System.out.println("4-Çıkı Yapınız.");


            } else {
                System.out.println("Hatalı Kullanıcı Adı veya Şifre Tekrar Deneyiniz.");


            }
             select=input.nextInt();
             if(select==4){
                 System.out.println("Çıkış Yaptınız.");
             }
                if(select==3){
                    System.out.println("Bakiyeniz"+total);

                }

                if(select==2){
                    System.out.println("Çekmek İstedğiniz Tutarı Giriniz");
                    pay=input.nextInt();
                    if(pay>total){
                        System.out.println("Yetersiz Bakiye.");
                    }
                    else {
                        total-=pay;
                        System.out.println("Paranızı Alınız.");
                    }


                }



                if(select==1){
                    System.out.println("Yatırmak İstedğiğniz Tutarı Giriniz: ");
                    pay=input.nextInt();
                    total+=pay;
                    System.out.print("Toplam Tutar."+total);


                }






        }
    }

}