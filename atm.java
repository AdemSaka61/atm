import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        int right = 3;
        double balance = 1500;
        int select, price;


        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz :");
            userName = input.nextLine();

            System.out.print("Parolanızı Giriniz :");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.print("Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("Seçiminizi Yapınız");
                    System.out.println("1-Para Çekme\n2-Para Yatırma\n3-Bakiye Sorgulama\n4-Çıkış");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarını Giriniz :");
                            price = input.nextInt();

                           if (price>balance){
                               System.out.println("Yetersiz Bakiye.");
                           }else {
                               balance-=price;
                           }
                           break;
                        case 2:
                            System.out.print("Para Miktarını Giriniz :");
                            price = input.nextInt();
                            balance += price;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);

                    }
                }while (select!=4);
                System.out.println("Tekrar Görüşmek Üzere.");
                break;


            } else {
                System.out.println("Kullanıcı Adı veya Parola Hatalı! Tekrar Deneyiniz.");
                System.out.println("Kalan Hakkınız :" + --right);
            }

        }


    }
}
