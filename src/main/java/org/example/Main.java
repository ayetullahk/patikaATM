package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, passaword;
        Scanner inp = new Scanner(System.in);
        int balance = 1500;
        int right = 3;
        int select;
        while (right > 0) {
            System.out.print("kullanıcı Adınızı Giriniz :");
            userName = inp.nextLine();
            System.out.print("Şifrenizi giriniz :");
            passaword = inp.nextLine();
            if (userName.equals("Ayetullah") && passaword.equals("Karabulut")) {
                System.out.println("Hoş geldiniz");
               do {
                   System.out.print("Yapmak istediğiniz işlemi Seciniz\n" +
                           "1-Para çekme\n" +
                           "2-Para yatırma\n" +
                           "3-Bakiye sorgulama\n" +
                           "4-Çıkış.");
                   select=inp.nextInt();
                   switch (select){
                       case 1:
                           System.out.print("Çekmek istedğiniz tutar :");
                           int price=inp.nextInt();
                           if (balance<price){
                               System.out.println("Yetersiz bakiye! tutarınız :"+balance);
                           }else {
                               balance-=price;
                               System.out.print("Kalan Bakiye :"+balance);

                           }
                       case 2:
                           System.out.print("Yatırmak istedğiniz tutar :");
                           int price2=inp.nextInt();
                           balance+=price2;
                           System.out.print("Güncel bakiyeniz :"+balance);

                       case 3:
                           System.out.println("Bakiyeniz :"+balance);

                       case 4:
                           System.out.println("İyi günler;");
                           break;

                   }
               }while (select !=4);
                System.out.println("İyi günler");
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }

        }
    }
}